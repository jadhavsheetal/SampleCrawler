package com.sheetal.sample.crawler.service;

import com.sheetal.sample.crawler.model.Author;
import com.sheetal.sample.crawler.model.Page;
import com.sheetal.sample.crawler.scrapers.CrawlingException;
import com.sheetal.sample.crawler.scrapers.IScraper;

public class CrawlingServiceImpl implements ICrawlingService {
	
	ScraperFactory scraperFactory;

	public Page getPage(String url) throws CrawlingException {
		String hostname = getUrlHostName(url);
		IScraper scraper = scraperFactory.getScraper(hostname);
		Page p = scraper.getPage(url);
		return p;
	}

	private String getUrlHostName(String url) {
		// TODO Auto-generated method stub
		return "blogspot";
	}

	public Author getAuthorDetails(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	public ScraperFactory getScraperFactory() {
		return scraperFactory;
	}

	public void setScraperFactory(ScraperFactory scraperFactory) {
		this.scraperFactory = scraperFactory;
	}
	
	
}
