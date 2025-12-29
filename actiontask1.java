package trial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiontask1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement C = d.findElement(By.xpath("//*[@id=\"droppableElement\"]"));
		WebElement v = d.findElement(By.id("draggableElement"));
		Actions a = new Actions(d);
		a.dragAndDrop(v, C).build().perform();//Drag and Drop
		
d.findElement(By.id("textbox")).sendKeys("viji");//Mouse Actions - Tooltip

WebElement D = d.findElement(By.id("dblclick"));
Thread.sleep(2000);
a.doubleClick(D).perform();//Mouse Actions - Double Click
		
WebElement R = d.findElement(By.xpath("//*[@id=\"rightclick\"]"));
a.contextClick(R).perform();//Mouse Actions - Right Click or Context Click
	}

}
