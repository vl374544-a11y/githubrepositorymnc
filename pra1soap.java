package testng_trial_1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class pra1soap {
  @Test
  @Parameters({"soap1"})
  public void l(String l) {
	  System.out.println("Soap----->"+"l");
	  //System.out.println(l);
  }
  @Test
  @Parameters({"soap2"})
  public void v(String v) {
	 
	  System.out.println(v);
  }
}
