package trial;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Datadriven {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
d.get("https://practicetestautomation.com/practice-test-login/");
Thread.sleep(3000);
FileInputStream f = new FileInputStream("C:\\Users\\user\\Desktop\\task1.xls");
Workbook b = Workbook.getWorkbook(f);
Sheet s = b.getSheet(0);

for(int i=1; i<=3; i++)
{
	String username = s.getCell(0,i).getContents();
	String password = s.getCell(1,i).getContents();
	d.findElement(By.id("username")).sendKeys(username);
	d.findElement(By.id("password")).sendKeys(password);
	d.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	WebElement out = d.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));
	out.click();
			
}



		
		
	}

}
