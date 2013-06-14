package com.sheetal.sample.crawler.web;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeUserAction extends ActionSupport {
 
	private String username;
 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	// all struts logic here
	public String execute() {
		System.out.println("execute");
		return "SUCCESS";
 
	}
}