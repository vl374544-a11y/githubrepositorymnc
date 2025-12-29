package testng_trial_1;

import org.testng.annotations.Test;
@Test(groups= {"classlevel"})
public class classgroup {
  @Test(groups= {"somke","sanity"})
  public void f1() {
	  System.out.println(" i am somke, sanity");
  }
  @Test
  public void f2() {
	  System.out.println("i am  sanity ");
  }
  @Test(groups = {"regression"})
  public void f3() {
	  System.out.println("i am regression");
  }
  @Test(groups = {"regression","retest"})
  public void f4() {
	  System.out.println("i am regression,retest");
  }
  
}
