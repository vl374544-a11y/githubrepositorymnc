package trial;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class dataprovider {
	WebDriver d;
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException, BiffException, IOException {
	 	
	d.findElement(By.id("username")).sendKeys(username);
	d.findElement(By.id("password")).sendKeys(password);
	d.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	WebElement out = d.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));
	out.click();

  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
d.get("https://practicetestautomation.com/practice-test-login/");
Thread.sleep(3000);
  }
  @DataProvider
  public Object[][] dp() throws BiffException, IOException {
	  FileInputStream f = new FileInputStream("C:\\Users\\user\\Desktop\\task1.xls");
	  Workbook b = Workbook.getWorkbook(f);
	  Sheet s = b.getSheet(0);
	  
	  int row = s.getRows();
	  int col = s.getColumns();
	  
	  Object [][] data = new Object[row- 1][col];
	  
	  for (int i = 1; i<row; i++) {
	  
		  for(int j =0; j<col ;j++) {
			  data[i-1][j]=s.getCell(j,i).getContents();
		  }
		  }
	  
	  return  data;
      
	  
  }
}
