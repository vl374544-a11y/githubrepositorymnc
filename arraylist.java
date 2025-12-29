package arraylist_Collection;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList mylist  = new ArrayList();
		
		//adding a data in to arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add('A');
		mylist.add("welcome");
		mylist.add(null);
		mylist.add(null);
		mylist.add(100);
		
		//size of arraylist
		System.out.println("size of array" + mylist.size());
		//in array there was lenght method , but array list size method
		
		//printing arry list
		System.out.println(mylist);
		
		//remove object, item, elements, all same
		mylist.remove(5);
		System.out.println("after remove" + mylist);
		
        //insert element in arraylist
		
		mylist.add(2,"java");
		System.out.println(mylist);
		// when you insert a element by using index value it will add in mentioned index and data moves to next index
		
		//modify element in the arraylist (modify,replace,change)
		mylist.set(2,"python");
		System.out.println("after replace "+ mylist);
		
		//access a spcific element or get specific element from array list
		System.out.println(mylist.get(3));
	}

}
