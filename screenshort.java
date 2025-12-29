package trial2;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chropath\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
File sr= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(sr,new File("C:\\Users\\user\\Desktop\\New folder\\sc3.png"));
	}

}
