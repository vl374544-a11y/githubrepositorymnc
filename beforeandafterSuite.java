package video;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class beforeandafterSuite {
	WebDriver d;
	 long endtime;
	 long starttime;
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("WebDriver.Chrome.Driver"," ");
	   starttime = System.currentTimeMillis();
	   d = new ChromeDriver();
	   
  }
  @Test
  public void f() throws InterruptedException {
	  
	  d.get("https://www.saucedemo.com/");
	  WebElement user = d.findElement(By.id("user-name"));
	  user.sendKeys("visual_user");
	  d.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	  Thread.sleep(3000);
	 // String oldwindow = d.getWindowHandle();
	  d.findElement(By.cssSelector("input[type='submit']")).click();
	  Thread.sleep(5000);
//	  Set<String> handles = d.getWindowHandles();
//	  for(String newwindows : handles)
//	  {
//		  d.switchTo().window(newwindows);
//	  }
	  d.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
	  d.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	  d.findElement(By.id("continue-shopping")).click();
  }
  @Test
  public void f2() throws InterruptedException {
	  
	  d.get("https://ultimateqa.com/automation");
	  Thread.sleep(2000);
d.findElement(By.xpath("//*[@id=\"post-507\"]/div/div/div/div[2]/div/div[1]/div/div/div/div/ul/li[3]/a")).click();

	  
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException {
	  d.quit();
	  Thread.sleep(3000);
	   endtime = System.currentTimeMillis();
	  long totaltime = endtime - starttime ;
	  System.out.println("total time taken"+ totaltime);
  }

}
