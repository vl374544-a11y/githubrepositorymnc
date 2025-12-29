package bclass;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class baseclass {
  
protected WebDriver d;	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
	  d= new ChromeDriver();
	  d.get("http://brm.tremplintech.in/web_pages/login.aspx");
	  
  }

}
