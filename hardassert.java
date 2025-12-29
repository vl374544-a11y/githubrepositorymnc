package trial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	String j ="jane";
  @Test
  public void f() {
	  System.out.println("started");
	  Assert.assertEquals("hello","hello");
	  System.out.println("completed");
  }
  @Test
  public void f2() {
	  System.out.println("started");
	  Assert.assertNotEquals("hello","hello");
	  System.out.println("completed");
  }
  @Test
  public void f3() {
	  System.out.println("started");
	  Assert.assertNull("hello","hello");
	  System.out.println("completed");
  }
  @Test
  public void f4() {
	  System.out.println("started");
	  Assert.assertTrue(j.contains("a"));
	  System.out.println("completed");
  }
}
