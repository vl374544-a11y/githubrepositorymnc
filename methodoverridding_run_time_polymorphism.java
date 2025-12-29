package oops;

class animalcat 
{
	void eat()
	{
		System.out.println("it will drink milk");
	}
}
class cow extends animalcat
{
	void eat()
	{
		System.out.println(" it eat grass and drink water");
	}
}
class donkey extends animalcat
{
	void eat ()
	{
		System.out.println("it will eat paper ");
	}
}
class monkey extends animalcat
{
	void eat()
	{
		System.out.println(" it will eat banana");
	}
}
public class methodoverridding_run_time_polymorphism {
	public static void main (String[]args) {
		monkey s = new monkey();
		s.eat();
		donkey k = new donkey();
		k.eat();
		cow j = new cow();
		j.eat();
		animalcat m= new animalcat();
		m.eat();
	}

}
