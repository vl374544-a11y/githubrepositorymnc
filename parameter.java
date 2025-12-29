package constructor;

public class parameter {
	int id; 
	String name ;
	parameter(int id, String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("hi");
	}
void ans()
{
         System.out.println(id + name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameter s1 = new parameter(123,"viji");
		parameter s2 = new parameter(33,"mkj ");
		s1.ans();
		s2.ans();
		
		
		
		
		
		

	}

}
