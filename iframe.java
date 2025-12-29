package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
       WebDriver d = new ChromeDriver();
       d.get("https://www.rediff.com/");
      // d.switchTo().frame(0);// it will switch from webpage to iframe
       //WebElement fr = d.findElement(By.xpath("//*[@id=\"nseindex\"]")); 
       //System.out.println(fr.getText());
       
      // d.switchTo().frame("moneyiframe");
       //WebElement BSE =d.findElement(By.id("bseindex"));
       //System.out.println(BSE.getText());
       
       WebElement we = d.findElement(By.xpath("//*[@id=\"moneyiframe\"]"));
       d.switchTo().frame(we);
       WebElement nse = d.findElement(By.id("nseindex"));
       System.out.println(nse.getText());
   
       d.switchTo().defaultContent();
       WebElement money = d.findElement(By.xpath("/html/body/div[5]/div[1]/span[5]/a"));
       money.click();
	}
}
