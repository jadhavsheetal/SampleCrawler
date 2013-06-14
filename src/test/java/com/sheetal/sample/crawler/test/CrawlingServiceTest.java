package com.sheetal.sample.crawler.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.sheetal.sample.crawler.model.Page;
import com.sheetal.sample.crawler.scrapers.CrawlingException;
import com.sheetal.sample.crawler.service.ICrawlingService;
import com.sheetal.sample.crawler.test.utils.SpringContextUtil;

public class CrawlingServiceTest {
	
	@Test
	public void testGetPage() throws CrawlingException {
		ICrawlingService crawlingService = (ICrawlingService) SpringContextUtil.getContext().getBean("crawlingService");
		Page page  =crawlingService.getPage("http://sksethy.blogspot.com/");

		assertNotNull(page);
		assertNotNull(page.getPosts());
	}

}
