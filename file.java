package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://qa-automation-practice.netlify.app/file-upload.html");
WebElement s = d.findElement(By.name("filename"));
s.sendKeys("C:\\Users\\user\\Downloads\\sampleFile (1).jpeg");
d.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/button")).click();

	}

}
