package String;

public class cantains_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String hari = "boys school";
		String mathu = "girls school";
		String priya = "girls school";
        String jagan = "boys school";
        
        System.out.println(hari.equals(priya));
        System.out.println(hari.equals(mathu));
        System.out.println(hari.equals(jagan));
        
        String stroy ="the cow was eating grass";
        System.out.println(stroy.contains("ass"));
	}

}
