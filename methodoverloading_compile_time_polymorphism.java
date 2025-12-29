package oops;

public class methodoverloading_compile_time_polymorphism {
	public void method(double k)
	{
		System.out.println(k);
	}
	public void method(int w, String q)
	{
		System.out.println( "i am working in "+q+" and my salary is"+ " w");
	}
	public void method(int d)
	{
		System.out.println( "my age is");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading_compile_time_polymorphism  x = new methodoverloading_compile_time_polymorphism ();
		x.method(55.4);
		x.method(22);
		x.method(35000, " zoho");
	}

}
