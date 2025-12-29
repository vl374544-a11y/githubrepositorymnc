package trial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class windowhandling {
	
	WebDriver d;
  @BeforeSuite
  public void driver() {
	  System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
  }

//@Test
//public void openwindow() throws InterruptedException {
//	String oldwindow = d.getWindowHandle();
//	d.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
//	Thread.sleep(2000);
//	Set<String> handles = d.getWindowHandles();
//	Thread.sleep(2000);
//	for(String newwindow : handles)
//	{
//		d.switchTo().window(newwindow);
//	}
//	Thread.sleep(2000);
//	d.findElement(By.id("firstName")).sendKeys("viji");
//	Thread.sleep(2000);
//	
//	d.switchTo().window(oldwindow);
//}
  
//@Test
//public void Multiplewindow() throws InterruptedException {
//	String oldwindow = d.getWindowHandle();
//	System.out.println(oldwindow);
//	Thread.sleep(2000);	
//	d.findElement(By.id("newWindowsBtn")).click();
//	Thread.sleep(2000);
//	Set<String> handles = d.getWindowHandles();
//	Thread.sleep(2000);
//	System.out.println("no of windows"+ handles);
//	for(String open : handles)
//	{
//		if(!open.equals(oldwindow)) {
//		}Thread.sleep(2000);
//		d.switchTo().window(open);
//		Thread.sleep(2000);
//	          d.close();
//	}
//			
//}
@Test
public void multipletab() throws InterruptedException
{
	String oldwindow = d.getWindowHandle();
	System.out.println(oldwindow);	
	Thread.sleep(2000);
	d.findElement(By.id("newTabsBtn")).click();
	Thread.sleep(4000);
	Set<String> tabs = d.getWindowHandles();
	System.out.println(tabs);
	Thread.sleep(4000);
	for(String move : tabs)
	{
		
		d.switchTo().window(move);
		Thread.sleep(2000);
		
		d.findElement(By.name("fName")).sendKeys("vijayalakshmi");
		
	}
}

}                                                                                                                                                                                                                                                                