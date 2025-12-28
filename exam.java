package String;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String a ="hello world";
		System.out.println(" lenght of hello world is "+ a.length());
		System.out.println("---------------------------------");
		
		String b ="deepAi";
		System.out.println("character of index " + b.charAt(4));
		System.out.println("---------------------------------");
		
		String k = "abc";
		String f = "l";
		String g = "abc";
		
		System.out.println(k.contains(k));
		System.out.println(k.contains(f));
		System.out.println(k.contains(g));
		System.out.println("---------------------------------");
		
		String s = "good";
		String m = "morning";
		System.out.println(s.concat(m));
		System.out.println("---------------------------------");
		
		String furit = "Apple banana cherry ";
		String p[] = furit.split(" ");
		for(String ss:p)
		System.out.println(ss);
		System.out.println("---------------------------------");
		
		String A = "python";
		String B =" ";
		for(int i=A.length()-1;i>=0;i--)
		{
			B=B+A.charAt(i);
		}
		System.out.println(B);
		System.out.println("---------------------------------");
		
		
		
		
		
		
		
}
}