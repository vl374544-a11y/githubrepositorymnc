package array_basic;

public class single_dimensional {

	public static void main(String[] args) {
	// approach 1
		
		int a [] = new int[5];//declaration of array
		
		a[0]=100; //-> to store a data 
		a[1]=200;
		a[2]=300;
		System.out.println(a[0]);// it was fixed array
		// use case you know fixed condition ,fixed element no want to store in future
		// array index start from 0
		System.out.println("<---------------,-------------------,--------------------,-----------------------");
		
		// approach 2- all in one line
		
		int i[] = { 100,200,300,400,500};// it was dynamic array
		
		//use case don't know exact number how much want to store
		// it is easy to modification
		
		// find lenght of array 
		System.out.println("lenght ="+ i.length);
		
		// read single value from a array
		System.out.println(i[4]);// here 4 is index number
		System.out.println("<---------------,-------------------,--------------------,-----------------------");
		
		
		//reading all values of array
		//normal for loop
		// when we know the condition use this type
		for(int A =0; A<=4 ; A++) // (or) for(int A= 0;A<5; A++)
		{
			System.out.println(i[A]);
		}
		System.out.println("<---------------,-------------------,--------------------,-----------------------");
		
		
		// normal for loop
		// why we using a lenght because we don't know the condition
		for(int r = 0; r<=i.length-1;r++) // (or) for(int r = 0; r<i.lenght; r++)
		{
			System.out.println(i[r]);
		}
		System.out.println("<---------------,-------------------,--------------------,-----------------------");
		
		//for each loop (or) enhance for loop
		// mostly used in array and collection concept
		for(int x : i)
		{
			System.out.println(x);
			
		}
		//THIS IS HOMOGENIOUS
		
		
		
	}

}
