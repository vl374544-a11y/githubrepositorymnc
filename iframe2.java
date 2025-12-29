package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {
	
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	//d.get("https://www.rediff.com/");

//d.switchTo().frame("moneyiframe");	
//Thread.sleep(20);
//WebElement s = d.findElement(By.id("nseindex"));
//Thread.sleep(20);
//System.out.println(s.getText());
//s.click();
//Thread.sleep(2000);
//d.switchTo().defaultContent();
//Thread.sleep(2000);
//WebElement f = d.findElement(By.xpath("/html/body/div[5]/div[1]/span[5]/a"));
//Thread.sleep(2000);
//f.click();

d.get("https://www.dezlearn.com/nested-iframes-example/");
	d.switchTo().frame("parent_iframe");
	Thread.sleep(2000);
	WebElement j = d.findElement(By.xpath("//*[@id=\"u_5_5\"]"));
	Thread.sleep(2000);
	j.click();
	Thread.sleep(2000);
	d.switchTo().parentFrame();
	Thread.sleep(5000);
	WebElement k = d.findElement(By.xpath("//*[@id=\"parent_iframe\"]"));
	Thread.sleep(5000);
	d.switchTo().frame(k);
	Thread.sleep(5000);
	WebElement A = d.findElement(By.id("u_5_6"));
	Thread.sleep(2000);
	A.click();
	
	
	
	
	
	
	
	
	

	}	
}
