package fdgfgd.fggvgfguf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessTesting {
	public static void main(String[] args) {
		HtmlUnitDriver unitDriver = new HtmlUnitDriver();
		 
		// open google.com webpage
		unitDriver.get("http://www.tolexo.com");
 
		System.out.println("Title of the page is -> " + unitDriver.getTitle());
 
		// find the search edit box on the google page
		WebElement searchBox = unitDriver.findElement(By.name("q"));
 
		// type in Selenium
		searchBox.sendKeys("shoe");
 
		// find the search button
		WebElement button = unitDriver.findElement(By.xpath("//button[@class='search-button com-sprt-af v-align-top jq-srch-btn']"));
 
		// Click the button
		button.click();
 
		System.out.println("Title of the page is -> " + unitDriver.getTitle());
 
	}
	}


