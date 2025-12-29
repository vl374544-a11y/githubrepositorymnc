package testng_trial_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import bclass.baseclass;

public class NewTest2 extends baseclass {
  @Test
  public void valid() {
	  d.findElement(By.cssSelector("input[type='text']")).sendKeys("sylix");
	  d.findElement(By.id("txt_pass")).sendKeys("admin");
	  d.findElement(By.name("Button3")).click();
  }
}
