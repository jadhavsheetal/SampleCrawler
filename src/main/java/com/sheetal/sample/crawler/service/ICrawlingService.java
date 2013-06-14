package com.sheetal.sample.crawler.service;

import com.sheetal.sample.crawler.model.Author;
import com.sheetal.sample.crawler.model.Page;
import com.sheetal.sample.crawler.scrapers.CrawlingException;

public interface ICrawlingService {
	
	Page getPage(String url) throws CrawlingException;
	Author getAuthorDetails(String authorUrl);

}
