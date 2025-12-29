package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://practice.expandtesting.com/dropdown#google_vignette");
d.manage().window().maximize();
WebElement country = d.findElement(By.id("dropdown")); 
Select s = new Select(country);
Thread.sleep(2000);
//s.selectByValue("AX");
//s.selectByIndex(2);
s.selectByContainsVisibleText("Option 2");



	}

}
