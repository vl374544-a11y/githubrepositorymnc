package array_basic;

public class Oject_heterogeneous {

	public static void main(String[] args) {
	 Object a[]= {100,10.5,'A',"welcome",true};
	 //heterogeneous - store different type of data
	 
	 
	 //for each loop
	 for(Object x : a)
	 {
		 System.out.println(x);
	 }

	 //simple for loop
	 for(int i = 1; i<=5;i++)
	 {
		 System.out.println(a[i]);
	 }
	 
	 // execption for when we enter extra index in array it show ArrayIndexOutOfBoundsExecption
	}
	// Interview- they will ask we can store heterogeneous data 
	//  YES by creating predefined object class

}
