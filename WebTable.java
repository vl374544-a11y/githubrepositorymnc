package trial2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
         d.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
//        List col = d.findElements(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/thead/tr/th"));
//        System.out.println("no of coloum"+ col);
//        List rows = d.findElements(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr/td[1]"));
//        System.out.println("no of rows"+ rows);
//        
//        for(int l =1; l<=2;l++)
//        {
//        	
//       WebElement s = d.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr"+l+"/td[7]/a[1]/svg")); 
//        	 s.click();
//  WebElement h = d.findElement(By.xpath("//*[@id=\"staticEdit\"]/div/div/div/button"));
//        	 h.click();
//        	 
  }
         
         
         
         
         
         
	}

}
