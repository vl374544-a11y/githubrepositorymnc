package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://practice-automation.com/file-upload/");
		d.manage().window().maximize();
WebElement a = d.findElement(By.xpath("//*[@id=\"file-upload\"]"));	
Thread.sleep(2000);
		a.sendKeys("C:\\Users\\user\\Downloads\\sampleFile (1).jpeg");
		d.findElement(By.id("upload-btn")).click();
	}

}
