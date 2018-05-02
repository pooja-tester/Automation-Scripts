package fdgfgd.fggvgfguf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobikwik {
	public static void main(String[] args) throws InterruptedException {
		
		
				
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.mobikwik.com");
			driver.manage().window().maximize();
			Thread.sleep(20000);
			/*//driver.findElement(By.cssSelector("input[class='form-input waoInput tx64 transbdr posrel jsField ng-pristine ng-valid ng-isolate-scope ng-valid-maxlength ng-touched']")).sendKeys("7895778911");
			  driver.findElement(By.cssSelector("input[type='text'][restrict-type='numbers']")).sendKeys("7895778911");
			driver.findElement(By.cssSelector("input[type='text'][restrict-type='numberswithdecimal']")).sendKeys("100");
			driver.findElement(By.cssSelector("button[id='btn-load']")).click();
			System.out.println("123");
			driver.findElement(By.cssSelector("input[class='form-input waoInput tx64 transbdr posrel jsField ng-valid ng-isolate-scope ng-valid-maxlength ng-dirty ng-valid-parse ng-touched']")).sendKeys("7895778911");
	     	*/
	 driver.findElement(By.xpath("//i[@id='qa-mbkPostpaid']")).click();
	 
	}

		
	}


