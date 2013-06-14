package com.sheetal.sample.crawler.test;
import junit.framework.TestCase;

import org.webharvest.definition.ScraperConfiguration;
import org.webharvest.runtime.Scraper;
import org.webharvest.runtime.variables.Variable;
public class WebharvestTest extends TestCase {

 public void testBlogSpot() throws Exception
 {
  
   try {
	String strPageURL =  "http://half-wit4u.blogspot.com/2011/01/web-scraping-using-java-api.html";
	strPageURL = "http://sksethy.blogspot.com/";
	//  System.out.println(new File("webharvest/blogspot.xml").getAbsolutePath());
	      ScraperConfiguration config = new ScraperConfiguration("src/main/resources/webharvest/test1.xml");
	       Scraper scraper = new Scraper(config, "/home/sheetal/");
	       scraper.addVariableToContext("startUrl",strPageURL);
	       scraper.addVariableToContext("username", "web-harvest");
	       scraper.addVariableToContext("password", "web-harvest");
	       scraper.setDebug(true);
	
	       scraper.execute();
	       
	       
	      // takes variable created during execution
	       Variable articles = (Variable) scraper.getContext().get("blogs");
	       //System.out.println(scraper.getMessage());
	       if (articles != null && !articles.isEmpty()) {
	    	   //System.out.println(articles);
	       }
	       
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println(e.getMessage());
	e.printStackTrace();
	throw e;
}
    
}
}