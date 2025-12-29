package BASICS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumbasic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDrive.chrome.driver ", "C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.nykaa.com/ ");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		int T = d.getTitle().length();
		int U = d.getCurrentUrl().length();
		System.out.println("lenght of title"+ T);
		System.out.println("lenght of URL"+ U);
		System.out.println(d.getPageSource());
		int page = d.getPageSource().length();
		System.out.println("<------------------------------------------");
		System.out.println("lenght of pagesource"+ page);
        //d.close();
		d.findElement(By.name("search-suggestions-nykaa")).sendKeys("face mask");
		
	}

}
