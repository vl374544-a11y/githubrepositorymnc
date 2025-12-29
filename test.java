package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
	//	d.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		//Thread.sleep(2000);
		//d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		//Thread.sleep(2000);
		//d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]"));
		//Thread.sleep(2000);
		//d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
		
	//	d.findElement(By.xpath("//*[@id=\"txtDate\"]")).click();
		//d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
//		WebElement date =d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
//		date.click();
//		Thread.sleep(2000);
//		Select s = new Select(date);
//		Thread.sleep(2000);
//		s.selectByIndex(4);
	//	Thread.sleep(2000);
	//	WebElement year = d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
	//	year.click();
//		Thread.sleep(2000);
	//	Select s2 = new Select(year);
	//	Thread.sleep(2000);
//		s2.selectByIndex(4);
	//	Thread.sleep(2000);
	//	d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a")).click();
		
	}
 
}
