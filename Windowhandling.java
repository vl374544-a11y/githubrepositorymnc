package trial2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdrive.chrome.drive","C:\\chropath\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://www.leafground.com/window.xhtml;jsessionid=node0f2ajjnfd82a5129url98e4f909849615.node0");
String oldwindows = d.getWindowHandle();
WebElement  open = d.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
open.click();
Set<String> childwindows = d.getWindowHandles();
for(String newWindow : childwindows)
{
	d.switchTo().window(newWindow);
}

	}

}
