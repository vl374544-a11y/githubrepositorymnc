package oops;
interface names 
{
	void samyu();
}
interface Address 
 {
	 void MTP();
 }
interface family
{
	 void dad();
}

public class Multipleinheritance implements names, Address, family{
	public void samyu()
	{
		System.out.println("my name is samyu");
	}
 public void MTP()
 {
	 System.out.println("81/D kendaiyur,3rd street, mettupalayam");
 }
  public void dad()
  {
	  System.out.println("i like my dad so much ");
  }
 static void mom()
  {
	  System.out.println("i like my mom so much");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipleinheritance ll = new Multipleinheritance ();
		ll.samyu();
        ll.MTP();
        ll.dad();
        ll.mom();
		
		
	}

}
