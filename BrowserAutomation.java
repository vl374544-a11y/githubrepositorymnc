package BASICS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver d = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	
		//d.get("https://www.flipkart.com/");
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty(	"webdriver.gecko.driver","C:\\firefoxbrower\\geckodriver.exe");
		
		driver.get("https://www.purplle.com/");
	
		
	}

}
