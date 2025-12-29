package trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	  WebDriver d;
  @Test
  @Parameters({"username","password"})
  public void f(String u, String p) {
	  System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
	   d = new ChromeDriver();
	  d.get("https://practicetestautomation.com/practice-test-login/");
	  d.findElement(By.name("username")).sendKeys(u);
	  d.findElement(By.id("password")).sendKeys(p);
	  
	  
  }
}
