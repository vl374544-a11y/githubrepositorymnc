package arraylist_Collection;

import java.util.HashSet;

public class Hashset_set {

	public static void main(String[] args) {
		// Declaration
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		
		//HashSet<Integer> myset = new HashSet<Integer>();
		
		//adding elements in to hashset 
		myset.add(100);
		myset.add(10.5);
		myset.add('A');
		myset.add("java");
		myset.add(null);
		
		//printing hashset
		System.out.println(myset);
		
		//removing elements
		myset.remove('A');
		// in arraylist we use index num for remove(insertion maintained) ,but in hashset not have index(no insertion order)
	System.out.println("after remove"+myset);
	
	
	
	
	
	}

}
