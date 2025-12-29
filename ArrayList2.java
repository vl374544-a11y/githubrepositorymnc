package arraylist_Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		//reading all the elements from array list
ArrayList mylist  = new ArrayList();
		
		//adding a data in to arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add('A');
		mylist.add("welcome");
		mylist.add(null);
		mylist.add(null);
		mylist.add(100);
		
		//simple for loop
		for(int i = 0 ; i<=mylist.size()-1; i++)
		{
			System.out.println(mylist.get(i));
		}//size is used in array list, lenght is used in array and string

		//for each
		for(Object x : mylist)
		{
		System.out.println(x);
		}
		
		//remove all data from array list
		mylist.clear();
		System.out.println(mylist);
		
	}

}
