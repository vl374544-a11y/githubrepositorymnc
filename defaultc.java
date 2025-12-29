package constructor;

public class defaultc {
		int count = 1;
		String name ;
		float age ;
		
		defaultc()
		{
			System.out.println(count);
		}
		
		void menu()
		{
			System.out.println(count +"+ " + name +" add"+ age );
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			defaultc w1 =new defaultc();
			w1.menu();		
					
		}

	}

