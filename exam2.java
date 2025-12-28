package String;

public class exam2 {

	public static void main(String[] args) {
		// TODO Write a java program to capitalize each word in string?
		String a ="vijayalakshmi";
		System.out.println(a + "-----" +a.toUpperCase());
		System.out.println("-------------------------------------");
		
		//Write a program to check two string values are same or not?
		String b =               "vijayalakshmi";
		System.out.println(b.trim());
		System.out.println("-------------------------------------");
		
		//Write a java program for removing the preceeding space from a string ?
		String j = "apple";
		String s = "banana";
		String k = "apple";
		String l = "banana";
		
		System.out.println(j.equals(s));
		System.out.println(j.equals(k));
		System.out.println(j.equals(l));
		System.out.println("-------------------------------------");
		
		//	Write a program to split a string?
		String V = "hi i am fine , how are you";
		String v []= V.split(" ");
		for(String S:v)
		{
			System.out.println(S);
		}
		System.out.println("-------------------------------------");
		
		//write a program to find the length of the following
		String A = "ramakrishnaparamahamsa";
		System.out.println("lenght of " + A +" is "+ A.length());
	
		
		
		

	}

}
