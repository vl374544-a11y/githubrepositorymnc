package testng_trial_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bclass.BaseNew;
//@Test(groups = {"brm"})
public class trialnewTest extends BaseNew {
  @Test(groups = {"vaild1"})
  public void vaild() throws InterruptedException {
	  d.findElement(By.cssSelector("input[type='text']")).sendKeys("sylix");
	  Thread.sleep(3000);
	  d.findElement(By.id("txt_pass")).sendKeys("admin");
	  Thread.sleep(3000);
	  WebElement k = d.findElement(By.xpath("//*[@id=\"Button3\"]"));
	 k.click();
	 d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();
  }
@Test
public void invaild() throws InterruptedException {
	d.findElement(By.cssSelector("input[type='text']")).sendKeys("syldddix");
	Thread.sleep(3000);
	  d.findElement(By.id("txt_pass")).sendKeys("admiddddn");
	  Thread.sleep(3000);
		  WebElement k = d.findElement(By.xpath("//*[@id=\"Button3\"]"));
			 k.click();
		 Alert ss = d.switchTo().alert();
		 ss.accept();
  }
@Test(groups = {"blank1"})
public void blank() throws InterruptedException {
	d.findElement(By.cssSelector("input[type='text']")).sendKeys(" ");
	Thread.sleep(3000);
	  d.findElement(By.id("txt_pass")).sendKeys("     ");
	  Thread.sleep(3000);
		  WebElement k = d.findElement(By.xpath("//*[@id=\"Button3\"]"));
			 k.click();
		 Alert ss = d.switchTo().alert();
		 ss.accept();

}
}