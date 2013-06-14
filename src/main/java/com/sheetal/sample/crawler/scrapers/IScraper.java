package com.sheetal.sample.crawler.scrapers;

import com.sheetal.sample.crawler.model.Page;

public interface IScraper {
	
	Page getPage(String url) throws CrawlingException;

}
