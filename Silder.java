package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Silder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
         d.get("https://www.tutorialspoint.com/selenium/practice/slider.php");
         WebElement silder = d.findElement(By.id("ageInputId"));
          for(int a = 10 ;a<=80;a++)
          {
        	  silder.sendKeys(Keys.ARROW_RIGHT);
          }
         
         for(int w =80; w>=50;w--)
         {
        	 silder.sendKeys(Keys.ARROW_LEFT);
         }
         
	}

}
