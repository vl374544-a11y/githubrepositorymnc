package array_basic;

public class two_dimensional_array {

	public static void main(String[] args) {
		//approach 1
		int a[] [] = new int [3][2];
		a[0][0]=100;
		a[0][1]=200;  // next coloum of row
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		
		//approach 2
		int b[][]= { {100,200},{300,400},{500,600} };
		
		//find size of an array
		System.out.println("lenght =" + b.length);// this type only show row lenght
		System.out.println("lenght ="+ b[0].length);// for coloum lenght 
		
		//THIS IS HOMOGENIOUS
	}

}
