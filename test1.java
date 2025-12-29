package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://practice.expandtesting.com/otp-login");
		d.manage().window().maximize();
		WebElement dr = d.findElement(By.cssSelector("input#email"));
		dr.sendKeys("practice@expandtesting.com");
		Thread.sleep(2000);
		WebElement otp = d.findElement(By.xpath("//*[@id=\"btn-send-otp\"]"));
		Thread.sleep(2000);
otp.click();
		Thread.sleep(2000);
		
		WebElement jj = d.findElement(By.xpath("//*[@id=\"otp\"]"));
		Thread.sleep(2000);
		jj.sendKeys("214365");
		Thread.sleep(2000);
		d.findElement(By.id("btn-send-verify")).click();
		
		
		
		
		
	}

}
