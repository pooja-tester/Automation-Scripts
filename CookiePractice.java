package fdgfgd.fggvgfguf;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiePractice {
	public static void main(String[] args) {
		
	
		WebDriver driver;
				
				driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("http://facebook.com");
				Set<Cookie> cookie = driver.manage().getCookies();
				
				for(Cookie c : cookie){
					System.out.println(c);
				}
		 	}
		

}
