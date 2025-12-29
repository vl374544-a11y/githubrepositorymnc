package testng_trial_1;

import org.testng.annotations.Test;

public class priority2 {
  
  @Test(priority=3)
  public void f() {
	  System.out.println("europe");	  
  }
  @Test(priority=2)
  public void z() {
	  System.out.println("zombie");
}
  @Test(enabled = false)
  public void r() {
	  System.out.println("roadmap");
} 
  @Test(priority=-1)
  public void c() {
	  System.out.println("caterpiller");
}
  @Test(priority=4)
  public void v() {
	  System.out.println("venom");
} 
  @Test(priority=5)
  public void m() {
	  System.out.println("monster");
}

}
