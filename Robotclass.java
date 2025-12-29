package trial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Robotclass {
	WebDriver  d;
  @Test
  public void f() throws AWTException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://practice.expandtesting.com/download");
	  d.manage().window().maximize();
	  
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
 
	  
//	  Robot R = new Robot();
//	  R.keyPress(KeyEvent.VK_DOWN);
  }
}
