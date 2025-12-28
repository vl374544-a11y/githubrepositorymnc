package String;

public class exam6 {

	public static void main(String[] args) {
		// TODO Java program to illustrate enhanced for loop
		int count ;
		for(count=30;count<40;count++)
		{
			System.out.println(count);
		}
		System.out.println("-----------------------------------------");
		//Display a Text Five Times
         String a = "java";
         for(int b = 1 ;b<=5;b++)
         {
        	 System.out.println(a);
         }
         System.out.println("-----------------------------------------");
         
         //concatenate two strings?
         String c = "vijaya";
         String b = "lakshmi";
         String d = c.concat(b);
         System.out.println(d);
         System.out.println("-----------------------------------------");
	
         //search a word inside a string?
	     String address = " 3th floor mettupalayam,cbe.";
	     System.out.println(address.contains("oor"));
	
	
	}
	
	
	

}
