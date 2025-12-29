package trial2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://vinothqaacademy.com/webtable/");
		Thread.sleep(3000);
		WebElement f = d.findElement(By.id("nameInput"));
		Thread.sleep(3000);
		f.sendKeys("viji");
		Thread.sleep(3000);
		d.findElement(By.id("roleInput")).sendKeys("vc/we");
		d.findElement(By.xpath("//*[@id=\"emailInput\"]")).sendKeys("viji@gmail.com");
		d.findElement(By.id("locationInput")).sendKeys("CBE");
		WebElement w = d.findElement(By.xpath("//*[@id=\"departmentInput\"]"));
		w.sendKeys("design");
		d.findElement(By.xpath("//*[@id=\"addBtn\"]")).click();
		
		List col =  d.findElements(By.xpath("//*[@id=\"myTable\"]/thead/tr/th"));
		System.out.println(" No of cols are :"+ col.size());
		
		List rows = d.findElements(By.xpath("//*[@id=\"myTable\"]/tbody/tr/td[2]"));
		System.out.print("no of rows :"+ rows.size());
		Thread.sleep(3000);
	for(int i =1	; i<=11; i++)
	{
		WebElement F = d.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[" + i +"]/td[1]/input"));	
		Thread.sleep(3000);
		F.click();
		break;
	}
	
	Thread.sleep(3000);
	d.findElement(By.id("deleteBtn")).click();
		
		
		
	}

}
