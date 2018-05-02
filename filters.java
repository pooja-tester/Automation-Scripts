package fdgfgd.fggvgfguf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filters {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.tolexo.com/catalogsearch/result/index/?dir=asc&limit=36&mode=grid&order=name&p=1&q=urinal");
		/*List <WebElement> l= driver.findElements(By.cssSelector("div[class='filter-content-box']>div[class^='title com-sprt-af']"));
	  for(WebElement e : l)
	  {
	     e.click();
	  }*/
		
	Assert.assertEquals("296",driver.findElement(By.cssSelector("input[id='filterByprice_from']")).getAttribute("value"));
	Assert.assertEquals("2099999",driver.findElement(By.cssSelector("input[id='filterByprice_to']")).getAttribute("value"));
	driver.findElement(By.cssSelector("input[id='filterByprice_from']")).clear();
	
	driver.findElement(By.cssSelector("input[id='filterByprice_to")).clear();
	driver.findElement(By.cssSelector("input[id='filterByprice_from']")).sendKeys("300");
	driver.findElement(By.cssSelector("input[id='filterByprice_to")).sendKeys("3000");
	driver.findElement(By.cssSelector("input[id='filterByisFbtRefine']")).click();
	
	List<WebElement> l = driver.findElements(By.xpath("//span[@class='price-box']/s/text()"));
	 
	l.size();
	for(WebElement e : l)
	{
		System.out.println(e);
	}
	 
	String s= driver.findElement(By.xpath("//span[@class='showing-total fr fs13 clr-777']/span[@class='rad-link bold clr-000']")).getText();
	 System.out.println(s);
	}

	
}
