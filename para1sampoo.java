package testng_trial_1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para1sampoo {
  @Test
  @Parameters({"shampoo1"})
  public void l(String L) {
	  System.out.println("Shampoo------->"+"L");
	  //System.out.println(L);
  }
  @Test
  @Parameters({"shampoo2"})
  public void f(String r) {
	  System.out.println(r);
  }
}
