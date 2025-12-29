package trial2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertmsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://demo.automationtesting.in/Alerts.html");
WebElement as = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
as.click();
as.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
Alert s = d.switchTo().alert();
s.accept();

WebElement as2 = d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
as2.click();
WebElement R= d.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
R.click();
s.dismiss();
//System.out.println(s.getText());//--------error


d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
WebElement a = d.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
a.click();
s.sendKeys("viji");
s.accept();





	}

}
