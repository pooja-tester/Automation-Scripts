package fdgfgd.fggvgfguf;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
  driver.get("https://www.flipkart.com/search?count=40&otracker=CLP_filters&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax&sid=tyy%2F4io");
	 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	/*driver.switchTo().frame(0);*/
	  //WebElement e= driver.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']"));
	int e=  driver.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']")).getSize().width;
	System.out.println(e);
	  Actions move = new Actions(driver);
       //move.dragAndDropBy(e, 110, 0).build().perform();
      //action.perform();
	  
	}

}
