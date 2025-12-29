package constructor;

public class constructor_overload {
       int id , age ;
       String menus;
        
       constructor_overload (int id , String menu)
       {
    	  id=id;
    	  menu = menu; 
    	  System.out.println(id+ "  "+ menu);
       }
       constructor_overload (int id, String menu ,int age)
       {
    	    this.id = id;
    	    this.menus = menus;
    	    this.age = age ;
    	    System.out.println(id+ " "+ menu + age );
       }
	void yeah()
	{
		System.out.println(id + menus + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 constructor_overload s1 = new constructor_overload(2,"hi");
 constructor_overload s2 = new constructor_overload(4,"ji",20);
         s1.yeah();
         s2.yeah();
	}

}
