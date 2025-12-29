package oops;
 abstract class student 
 {
	 
	 void method()
	 {
		 String a = "madhu";
		 int k = 100;
		 System.out.println("my student name is "+ a);
		 System.out.println("she got "+k+ "mark in maths" );
	 }
	 static void method2()
	 {
		 String w =" students";
		 System.out.println(w);
	 }
	 abstract void method3();
	 
 }

public class abstraction extends student {
	 void method3()
	{
		String p = "bus";
		System.out.println("my modeof transport for school is"+ p);
	}
	 void distance()
	 {
		 System.out.println(" hi");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstraction oo = new abstraction();
		
		oo.method3();
		oo.distance();
		oo.method();
		method2();

	}

}
