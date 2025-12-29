package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		WebElement dr = d.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input"));
		dr.click();
		
		

	}

}
