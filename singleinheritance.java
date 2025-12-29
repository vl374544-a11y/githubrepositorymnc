package oops;

class subjects
{
	void types1()
	{
		System.out.println(" there is 5 main subjects in school");
	}
   void types2	()
 {
	 System.out.println(" there are 2 sub-subjects in school");
 }
   
} 
class totalsubjects extends subjects
{
	void total()
	{
		System.out.println(" totaly there are 7 subject in school ");
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		totalsubjects kk = new totalsubjects ();
				kk.types2();
				kk.types1();

	}

}
