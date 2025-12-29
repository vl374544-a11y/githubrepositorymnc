package testng_trial_1;

import org.testng.annotations.Test;

public class metagroup {
  @Test(groups = {"mazda"})
  public void f1() {
	  System.out.println("i am sports car ");
  }
  @Test(groups = {"mustang"})
  public void f2() {
	  System.out.println("i am sports car ");
  }
  @Test(groups = {"kwasaki"})
  public void f3() {
	  System.out.println("i am sports bike ");  
  }
  @Test(groups = {"ktm"})
  public void f4() {
	  System.out.println("i am austrain bike ");
  }
}
