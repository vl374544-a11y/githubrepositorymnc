package testng_trial_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest1base extends baseclass1 {
  @Test
  public void f() throws InterruptedException {
	  List col = d.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td"));
	  System.out.println("no of coloum "+ col);
	  List row = d.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr/td[2]/strong"));
	  
	  System.out.println("no of rows "+ row);
	  
	 
	  
  }
}
