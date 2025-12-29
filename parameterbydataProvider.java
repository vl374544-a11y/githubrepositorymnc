package testng_trial_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class parameterbydataProvider {
	WebDriver d;
  @Test(dataProvider = "dp")
  public void f(String author, String searchkey) throws InterruptedException {
	  
	  WebElement s = d.findElement(By.name("q"));
	  s.sendKeys(searchkey);
	  System.out.println("Welcome-->"+author+"your key"+ searchkey);
	  Thread.sleep(4000);
	  String testvalues = s.getAttribute("value");
	  System.out.println(testvalues + "::::::"+ searchkey);
	  Thread.sleep(4000);
	  s.clear();
	  Assert.assertTrue(testvalues.equalsIgnoreCase(searchkey));
  }                                                                                                                         
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://www.google.com/");
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "naruto", "hero" },
      new Object[] { "kakasi", "sensei" },
      new Object[] { "itachi", "brother" },
      
    };
  }
}
