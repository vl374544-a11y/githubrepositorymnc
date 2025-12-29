package exception_handling;

public class exceptionhandlings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100, y=50, z=50,a,b,c;
		System.out.println("<---exception handlings----<");
    a=x+y*z+x+z;
    System.out.println("value of a ="+ a);
    try
    {
    b=x/(y-z);
    System.out.println(" value of b ="+ b);// it throw to catch so it avoid a error
    }
    catch(Exception i)
    {
    	
    }
    finally // it not necessary we what means we can use 
    {
    c=x-y+y+z;
    System.out.println("value of c ="+c);
    }
	}

}
