package oops;
class food
{
	void chappathi()
	{
		System.out.println(" panner butter masala ");
	}
	
}
 
class drinks extends food
{
	void coffee()
	{
		System.out.println(" cold coffee");
	}
}

class Snack extends food
{
	void rolls()
	{
		System.out.println(" egg and chicken roll");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack kk = new Snack();
		kk.rolls();
		drinks ll = new drinks();
		ll.coffee();
		ll.chappathi();
		
	

	}

}
