package String;

public class string_buf_bul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "vijayalakshmni";
		StringBuffer buf = new StringBuffer(name);
        buf.reverse();
        System.out.println( name  + "------" + buf );
        
        String product = "rosepowder";
        StringBuilder pro = new StringBuilder(product);
        pro.reverse();
        System.out.println(product + "-----" + pro);
        
        String n ="saru";
        String l = "";
        		for(int i=n.length()-1;i>=0;i--)
        		{
        			l=l+n.charAt(i);
        		}
        System.out.println(l);
	}

}
