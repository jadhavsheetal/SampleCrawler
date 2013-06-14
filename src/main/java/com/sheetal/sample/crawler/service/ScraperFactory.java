package com.sheetal.sample.crawler.service;

import com.sheetal.sample.crawler.scrapers.IScraper;

public interface ScraperFactory {
	
	public IScraper getScraper(String key) ;
}
