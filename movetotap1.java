package trial2;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class movetotap1 {

	public static void main(String[] args) throws InterruptedException                                           {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(4000);
		
		((JavascriptExecutor)d).executeScript("window.open()");
		ArrayList<String> tab2 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab2.get(1)); //get index start 0 , tab count start 1 
		d.get("https://in.bookmyshow.com");
                                                                          
		
		((JavascriptExecutor)d).executeScript("window.open()");
		ArrayList<String> tab3 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab3.get(2)); 
		d.get("https://www.smula.com/");
		
//		JavascriptExecutor js=(JavascriptExecutor)d;
//		js.executeScript("window.scrollBy(0, 1500");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-500");
//		Thread.sleep(3000);
//		
		ArrayList<String> tab1R = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab1R.get(0));
        d.get("https://www.facebook.com/");
        Thread.sleep(4000);
        
        ArrayList<String> tab2R = new ArrayList<String>(d.getWindowHandles());
        d.switchTo().window(tab2R.get(1));
        d.get("https://www.flipkart.com/");
        Thread.sleep(4000);
        
        ArrayList<String> tab3R = new ArrayList<String>(d.getWindowHandles());
        d.switchTo().window(tab3R.get(2));
        d.get("https://www.kalyanjewellers.net/Jewellery/choker-necklace.php");
        Thread.sleep(4000);
        
        
        
        
        
		
	}

}
