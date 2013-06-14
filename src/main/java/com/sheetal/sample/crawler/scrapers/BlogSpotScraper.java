package com.sheetal.sample.crawler.scrapers;

import java.io.File;

import org.webharvest.definition.ScraperConfiguration;
import org.webharvest.runtime.Scraper;
import org.webharvest.runtime.variables.Variable;

import com.google.gson.Gson;
import com.sheetal.sample.crawler.model.Page;

public class BlogSpotScraper implements IScraper {
	
	File scraperXml;

	public Page getPage(String url) throws CrawlingException {
		try {
			ScraperConfiguration config = new ScraperConfiguration(scraperXml);
			Scraper scraper = new Scraper(config, "tmp");
			scraper.addVariableToContext("startUrl", url);

			scraper.addVariableToContext("username", "web-harvest");
			scraper.addVariableToContext("password", "web-harvest");
			scraper.setDebug(true);

			scraper.execute();

			// takes variable created during execution
			Variable articles = (Variable) scraper.getContext().get("blogs");
			if (articles != null && !articles.isEmpty()) {
				String jsonStr = articles.toString().replace("{\"xml-to-json\":","");
				jsonStr = jsonStr.trim().substring(0, jsonStr.length()-1);
				Gson gson = new Gson();
				Page p = gson.fromJson(jsonStr, Page.class);
				return p;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CrawlingException(e);
		}
		return null;
	}

	public File getScraperXml() {
		return scraperXml;
	}

	public void setScraperXml(File scraperXml) {
		this.scraperXml = scraperXml;
	}
	
	

}
