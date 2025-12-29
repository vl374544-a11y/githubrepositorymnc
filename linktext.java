package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.name("email")).sendKeys("9788443737");
		d.findElement(By.id("pass")).sendKeys("39vijr8998 ");
		d.findElement(By.linkText("Forgotten password?")).click();

	}

}
