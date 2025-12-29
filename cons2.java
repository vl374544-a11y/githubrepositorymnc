package constructor;

public class cons2 {
	int id =90;
	String name;
	float age;            
	
	void display()
	{
		System.out.println(id+ "  "+name + "  " + age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons2 e = new cons2();
		cons2 m = new cons2();
		e.display();
		m.display();
		
		

	}

}
