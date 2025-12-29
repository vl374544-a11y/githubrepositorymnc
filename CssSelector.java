package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://practice-automation.com/form-fields/");
		d.findElement(By.cssSelector("input#name-input")).sendKeys("vji");
		WebElement dr =d.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[2]/input"));
		dr.sendKeys("56788");
		Thread.sleep(2000);
	//WebElement wine = d.findElement(By.xpath("//*[@id=\"drink4\"]"));
	//Thread.sleep(2000);
	//wine.click();
	
		WebElement blue = d.findElement(By.xpath("//*[@id=\"color2\"]"));
		
		
		
		

	}

}
