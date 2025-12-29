package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiontask2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.manage().window().maximize();

d.get("https://webflow.com/made-in-webflow/mouse-hover");
WebElement G = d.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[2]/div[1]/div[2]/div[1]/a/div[2]/div[2]/div"));
Thread.sleep(3000);
WebElement T =d.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[2]/div[1]/div[2]/div[2]/a/div[2]/div[2]/div"));
Thread.sleep(3000);
WebElement M = d.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[2]/div[1]/div[2]/div[3]/a/div[2]/div[2]/div"));
WebElement 	I = d.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/div[2]/div[2]/div[1]/div[2]/div[4]/a/div[2]/div[2]/div"));
	
Actions s = new Actions(d);
s.moveToElement(M).perform();
Thread.sleep(3000);
s.moveToElement(I).perform();
Thread.sleep(3000);
s.moveToElement(T).perform();
Thread.sleep(3000);
s.moveToElement(G).perform();



	}


}
