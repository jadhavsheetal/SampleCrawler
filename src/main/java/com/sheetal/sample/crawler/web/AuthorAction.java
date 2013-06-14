package com.sheetal.sample.crawler.web;

import com.opensymphony.xwork2.ActionSupport;
import com.sheetal.sample.crawler.model.Author;
import com.sheetal.sample.crawler.model.Page;
import com.sheetal.sample.crawler.service.ICrawlingService;

public class AuthorAction extends ActionSupport {
	
	String authorId;
	ICrawlingService crawlService;
	private Author author = new Author();
	private Page page;
	private String url;

	public String getAuthorDetails() {
		try {
			author =  crawlService.getAuthorDetails(authorId);
		} catch (Exception e) {
			addActionError("Unexpected error occurred! Please try again later");
		}
		
		
		return SUCCESS;
		
		
	}
	
	public String getPageDetails() {
		try {
			page =  crawlService.getPage(url);
			
			
		} catch (Exception e) {
			addActionError("Unexpected error occurred! Please try again later");
		}
		
		
		return SUCCESS;
		
		
	}
	
	

	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public ICrawlingService getCrawlService() {
		return crawlService;
	}

	public void setCrawlService(ICrawlingService crawlService) {
		this.crawlService = crawlService;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	

}
