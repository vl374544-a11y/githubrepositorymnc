package POCORE;

public class IfelseifDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 99;
		if(mark<=40)
		{
			System.out.println("failed");
		}
else if (mark>=41 && mark<=60)
{
	System.out.println("C grade");
}
else if (mark>=61 && mark<80)
{
	System.out.println("B grade");
}
else if (mark>=81 && mark<100)
{
	System.out.println("A grade");
}
else
{
	System.out.println("invaild mark");
}
			

	}

}
