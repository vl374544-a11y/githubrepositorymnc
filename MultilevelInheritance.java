package oops;
class naruto 
{
	void leafvillage()
	{
		System.out.println("i like is ithachi  ");
	}
	
	void leafvillage2()
	{
		System.out.println("i like itachi and his younger brother sasuke");
	}
}

class narutofans extends naruto
{
	void leafvillage3()
	{
		System.out.println("i like naruto");
		System.out.println(" kakashi");
	}
	
}

class sandvillage extends narutofans
{
	void god_of_sandvillage()
	{
		System.out.println(" i like Gaara");
	}
}
 class myalltimefav extends sandvillage
 {
	 void favlist()
	 {
		 System.out.println("1 place is obito and itachi");
		 System.out.println("2 place is Naruto , kakshi, sasuke");
		 System.out.println("3 place is gara,hinata,rock lee");
	 }
 }


public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myalltimefav uu = new myalltimefav();
		uu.favlist();
		uu.leafvillage();
		uu.leafvillage2();
		uu.leafvillage3();
		uu.god_of_sandvillage();
		
		
		

	}

}
