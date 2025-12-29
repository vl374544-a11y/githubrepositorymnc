package constructor;

public class Defaultcons {
	int count ;
	String name;
	
		Defaultcons()
	{
		System.out.println(" i am here");
	}
	
	void menu()
	{
		System.out.println(count);
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defaultcons w1 =new Defaultcons();
		w1.menu();		
				
	}

}
