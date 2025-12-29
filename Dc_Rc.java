package trial2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dc_Rc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement dr = d.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
Actions act = new Actions(d);
Thread.sleep(3000);
act.doubleClick(dr).perform();
Thread.sleep(3000);
Alert s = d.switchTo().alert();
Thread.sleep(3000);
s.accept();

WebElement r = d.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
act.contextClick(r).perform();
d.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]")).click();
s=d.switchTo().alert();
s.accept();











	}

}
