package video;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest {
	WebDriver d;
	@DataProvider(name ="login")
    public String[][]  getdata(){
	  String data [][]= new String [2][2];
	  data [0][0]="student";
	  data[0][1]= "Password123";
      data[1][0]="student";
      data[1][1]="Password123";
      
      return data;
  }
  
  
  @Test(dataProvider = "login")
  public void first (String username, String password) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
  d = new ChromeDriver();
	  d.get("https://practicetestautomation.com/practice-test-login/");
	  d.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	  d.findElement(By.xpath("//input [@type='password']")).sendKeys(password);
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//button[@id='submit']")).click();
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//c[@style='color:#ffffff']")).click();
  }
  
}
