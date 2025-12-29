package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SILDER1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.globalsqa.com/demo-site/sliders/");
		//d.get("https://practice.expandtesting.com/horizontal-slider");
		Thread.sleep(3000);
		/*WebElement a = d.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		Thread.sleep(3000);  
		
		for(int i= 90; i>=40; i--)
		{
			a.sendKeys(Keys.ARROW_LEFT);
		}*/
		
		WebElement b= d.findElement(By.xpath("//*[@id=\"green\"]/span"));
		for(int i =50; i<=90; i++)
		{
			b.sendKeys(Keys.ARROW_RIGHT);
		}
		
		
		
		
		
		
		
		

	}

}
