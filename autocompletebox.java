package trial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class autocompletebox {
	WebDriver d;
  @Test
  public void f() throws InterruptedException {
	  d.findElement(By.cssSelector("input#country")).sendKeys("K");
	  Thread.sleep(2000);
	  List<WebElement> auto  = d.findElements(By.className("col-md-4"));
	  
	  Thread.sleep(2000);
	 
	  for(WebElement suggestion : auto)
	  {
		  System.out.println(auto.size());
		  if(suggestion.getText().equals("Kuwait"));
		  suggestion.click();
		  Thread.sleep(2000);
		break;
		  
	  }
	  WebElement click = d.findElement(By.xpath("//input[@type='text']"));
	 
	 
	  
	  d.findElement(By.xpath("//*[@id=\"core\"]/div/div/div[1]/div/div/div[2]/button")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://practice.expandtesting.com/autocomplete#google_vignette");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
  }

}
