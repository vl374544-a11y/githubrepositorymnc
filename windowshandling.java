package trial2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");                  
WebDriver s = new ChromeDriver();
s.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");


	}

}
