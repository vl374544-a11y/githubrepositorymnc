package trial2;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class movetotap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		
		((JavascriptExecutor)d).executeScript("window.open()");
		ArrayList<String> tab2 = new ArrayList<String>(d.getWindowHandles());
		Thread.sleep(3000);
		d.switchTo().window(tab2.get(1));
		Thread.sleep(3000);
		d.get("https://www.purplle.com");
		
		((JavascriptExecutor)d).executeScript("window.open()");
		Thread.sleep(3000);
		ArrayList<String> tab3 = new ArrayList<String>(d.getWindowHandles());
		Thread.sleep(3000);
		d.switchTo().window(tab3.get(2));
		Thread.sleep(3000);
		d.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
      JavascriptExecutor js = (JavascriptExecutor)d;
      js.executeScript("window.scrollBy(0,1500)");
      Thread.sleep(3000);
      js.executeScript(" window.scrollBy(0,-500)");
		
		ArrayList<String> btab3 = new ArrayList<String>(d.getWindowHandles());
		Thread.sleep(3000);
		d.switchTo().window(btab3.get(0));
		d.get("https://mamaearth.in/");
		Thread.sleep(3000);
		
		ArrayList<String> btab2 = new ArrayList<String>(d.getWindowHandles());
		Thread.sleep(3000);
		d.switchTo().window(btab2.get(2));
		d.get("https://discoverpilgrim.com/");
		
		
		
		
		
		
		
		
	}

}
