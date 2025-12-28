package POCORE;

public class SwitchotherMethodDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fastival = "deepavali";
		String month ;
		switch(fastival)
		{
		case "onam" : month = "sept";
				break;
		case "pongal" : month = "jan";
		       break;
		case "deepavali" : month = "oct";
		       break;
		case "christmas": month = "dec";
		       break;
		default : month = "no cele";
		
		}
 System.out.println(fastival+ " is celebrated in " +month);

	}

}
