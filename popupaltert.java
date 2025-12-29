package trial2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class popupaltert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("chromewebstore.google.com/?hl=en");
		d.manage().window().maximize();
		WebElement ta1 = d.findElement(By.id("alert"));
		ta1.click();
		Alert s = d.switchTo().alert();
		Thread.sleep(2000);
		s.accept();
		
		

	}

}
