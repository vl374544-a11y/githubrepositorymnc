package trial2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://automationexercise.com/");
		WebElement f = d.findElement(By.xpath("/html"));
		f.click();
		JavascriptExecutor js = (JavascriptExecutor)d;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");

		File sr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File("C:\\Users\\user\\Desktop\\New folder\\g2.png"));
		

	}

}
