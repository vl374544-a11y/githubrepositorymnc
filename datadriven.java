package trial2;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadriven {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.amazon.in/");
		String oldwindows = dri.getWindowHandle();
		dri.manage().window().maximize();
		Thread.sleep(3000);
		FileInputStream a = new FileInputStream("C:\\Users\\user\\Downloads\\Book1driven.xls");
		Workbook b = Workbook.getWorkbook(a);
		Sheet s= b.getSheet(0);
		
		for(int i = 1;i<=3;i++)
		{
		String product =  s.getCell(21,i).getContents();
		dri.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(product);
		dri.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		dri.navigate().back();    
		{
			if(i>=3)
			{
			dri.navigate().forward();
		    }
		}
	
		}
//	dri.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
//      dri.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

		//	WebElement R =	dri.findElement(By.cssSelector("img[data-image-index='1']"));
//		JavascriptExecutor js = (JavascriptExecutor)dri;
//		js.executeScript("arguments[0].click",R);
	
	try	{WebElement Image =	dri.findElement(By.xpath("//*[@id=\"03f4f171-7935-45e6-9218-2052038c090b\"]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
				Actions S = new Actions(dri);
	S.doubleClick(Image);
		}
catch (Exception e)	
	{
	
	}
	JavascriptExecutor js = (JavascriptExecutor)dri;
	ArrayList<String> tab2 = new ArrayList<String>(dri.getWindowHandles());
	dri.switchTo().window(tab2.get(0));
	dri.get("https://www.amazon.in/Apple-MacBook-15-inch-10-core-Unified/dp/B0DZDDPXY5/ref=sr_1_2_sspa?dib=eyJ2IjoiMSJ9.3T5lHJsl0wg_5S_l54ZFiHRkjN08TGgPsw1p6V-vgxGw4AVJeT_7CqAcF6o5bHIX4_AgXr9TrOPNFhR6uqk3npTCtyWdNeSy2rQy7LzgyH0BQ1kqu1iL4pvHLS5IGTVg5K5oY6fUwcfFD1PRmDiyybqhan55kswLK-JVZF9L_0_M6w_IiqeU2Ab-8wty-YO7Uc6it4J6YaWVEl9KYbAK5uUXgszgR7yxgDaAo9jvq80.nN8lKOmCXkQR-rT_fJxi1R6AMm-u9BFgeaGrarpPZwY&dib_tag=se&keywords=laptop&qid=1763100260&sr=8-2-spons&aref=iGHGUzbhLy&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
	Thread.sleep(2000);
	//Actions S = new Actions(dri);
	//Thread.sleep(2000);
	WebElement c =dri.findElement(By.name("submit.add-to-cart"));
	Thread.sleep(2000);
//S.moveToElement(c).build().perform();

	JavascriptExecutor j = (JavascriptExecutor)dri;
	j.executeScript("argument[2].click",c);

File Shot=((TakesScreenshot)dri).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(Shot,new File("C:\\Users\\user\\Desktop\\New folder\\f1.png"));

	}
	
}