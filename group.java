package trial;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test (groups ={"numgroup"})
public class group {
	WebDriver d;
  @Test(groups = {"scroll"})
  public void f() throws InterruptedException {
	  System.setProperty("WebDriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	   d = new ChromeDriver();
	  d.get("https://ultimateqa.com/complicated-page");
	WebElement x =  d.findElement(By.xpath("/html"));
	  JavascriptExecutor js = (JavascriptExecutor)d;
	  js.executeScript("window.scrollBy(0,1400)");
	  d.findElement(By.id("user_login_694525116de44")).sendKeys("viji");
	  d.findElement(By.id("user_pass_694525116de44")).sendKeys("viji123");
	  d.findElement(By.xpath("//*[@id=\"post-579\"]/div/div/div/div/div[7]/div[2]/div[2]/div[2]/form/p[4]/button")).click();
	  
  }
  @Test(groups = {"action"})
  public void f2() throws InterruptedException {
	  System.setProperty("WebDriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	   d = new ChromeDriver();
	   Thread.sleep(2000);
	  d.get("https://ultimateqa.com/automation/fake-pricing-page/#top");
	  d.manage().window().maximize();
	  Thread.sleep(2000);
	  WebElement g = d.findElement(By.xpath("//*[@id=\"post-5050\"]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[4]/a"));
	  Thread.sleep(2000);
	  Actions c = new Actions(d);
	  c.moveToElement(g);
	  Thread.sleep(2000);
	  g.click();
  }
  
  @Test(groups = {"click"})
  public void f3()  {
	  System.setProperty("WebDriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	   d = new ChromeDriver();
	  d.get("https://ultimateqa.com/simple-html-elements-for-automation/");
  d.findElement(By.id("button1")).click();
  }
  
  @Test(groups = {"WebTable"})
  public void f4() throws InterruptedException  {
	  System.setProperty("WebDriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	    d = new ChromeDriver();
	  d.get("https://vinothqaacademy.com/webtable/");
	  d.findElement(By.id("nameInput")).sendKeys("viji");
	  d.findElement(By.id("roleInput")).sendKeys("manager");
	  d.findElement(By.id("emailInput")).sendKeys("viji@gamil.com");
	  d.findElement(By.id("locationInput")).sendKeys("CBE");
	  d.findElement(By.id("departmentInput")).sendKeys("IT ");
	  Thread.sleep(2000);
	  d.findElement(By.id("addBtn")).click();
	  
	 List col =d.findElements(By.xpath("//*[@id=\"myTable\"]/thead/tr/th"));
	 System.out.println(col.size());
	 List row = d.findElements(By.xpath("//*[@id=\"myTable\"]/tbody/tr/td[1]"));
	 System.out.println(row.size());
	 Thread.sleep(2000);
	 for(int i = 1; i<=5; i++)
	 {
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr["+ i +"]/td[1]/input")).click();
		 break;
		 
	 }
	  d.findElement(By.xpath("//*[@id=\"deleteBtn\"]")).click();
  }
}
