package testng_trial_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class realtimeForParameter {
	WebDriver d;
  @Test
  @Parameters({"username","password"})
  public void f(String u, String p) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://brm.tremplintech.in/web_pages/login.aspx");
	  d.findElement(By.cssSelector("input[type='text']")).sendKeys(u);
	  Thread.sleep(3000);
	  d.findElement(By.id("txt_pass")).sendKeys(p);
	  Thread.sleep(3000);
	  WebElement k = d.findElement(By.xpath("//*[@id=\"Button3\"]"));
	 k.click();
	 d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();
  }
}
