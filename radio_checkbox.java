package trial2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class radio_checkbox {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
  WebDriver d = new ChromeDriver();
  d.get("https://artoftesting.com/samplesiteforselenium");
//d.findElement(By.cssSelector("input[type=text]")).sendKeys("hello");
//d.findElement(By.id("idOfButton")).click();
//Thread.sleep(3000);
//WebElement K =d.findElement(By.xpath("//*[@id=\"dblClkBtn\"]"));
//Thread.sleep(3000);
Actions A = new Actions(d);
//Thread.sleep(3000);
//A.doubleClick(K).build().perform();
//Thread.sleep(3000);
//Alert al = d.switchTo().alert();
//Thread.sleep(3000);
//al.accept();
//d.findElement(By.xpath("//*[@id\"male\"]")).click();
//d.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[2]")).click();

//WebElement W = d.findElement(By.xpath("//*[@id=\"testingDropdown\"]"));
//W.click();
//Select g = new Select(W);
//Thread.sleep(3000);
//g.selectByValue("Performance");

//WebElement Y = d.findElement(By.xpath("//*[@id=\"AlertBox\"]/button"));
//Y.click();
//Thread.sleep(3000);
//al.accept();
//
//WebElement E = d.findElement(By.xpath("//*[@id=\"ConfirmBox\"]/button"));
//E.click();
//Thread.sleep(3000);
//al.dismiss();


WebElement Q = d.findElement(By.xpath("//*[@id=\"myImage\"]"));
WebElement D = d.findElement(By.xpath("//*[@id=\"targetDiv\"]"));
Thread.sleep(3000);
A.dragAndDrop(Q,D).build().perform();



	}

}
