package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddRemoveValue {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); //boundary has not defined it will be increases until we stop to adding data
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		//if you want to add the value in between the list
		list.add(1, 200);
		System.out.println(list);
		
		List<Integer> newlist = new ArrayList<>();
		newlist.add(50);
		newlist.add(500);
		newlist.add(1000);
		
		System.out.println(newlist);
		
		//if wanna add to list together
		list.addAll(newlist);
		System.out.println(list);
		
		//if u wanna update the value of index not to add
		list.set(3, 40);
		System.out.println(list);
		
		//if you wanna remove the value from the list 
		list.remove(1);
		System.out.println(list);
		
		//if wanna remove by value not index
		list.remove(Integer.valueOf(20));
		System.out.println(list);
		
		// it will clear list wise data
		list.removeAll(newlist);
		System.out.println(list);
	
		//to check value present of not in the list
		System.out.println(list.contains(20));   //if present then true else false (return type is boolean)
		
		//to get all the values from the list (for loop)
		for(int i=0; i<=list.size()-1; i++) {
			System.out.println("the elements are " + list.get(i));
		}
		
		//by using for each loop
		for(Integer elements: list) {
			System.out.println("for each elements are " + elements);
		}
		
		//Iterator loop
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {                                //hasNext return type is boolean
			System.out.println("Iterator :"+ it.next());
		}
		
		//it will all the list
	      list.clear();
				System.out.println(list);
	}
}
