package Set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

	
	public static void main(String[] args) {
   //set means it contain unique value		
		
		Set<Integer> set = new HashSet<>();
		set.add(40);
		set.add(20);
		set.add(60);
		set.add(90);
		set.add(20);
		System.out.println(set);
		
		System.out.println(set.size());  //gives count and ignore duplicate one
		
		System.out.println(set.contains(40)); //if contains true else false
		
		System.out.println(set.isEmpty());
		set.remove(20);
		System.out.println(set);
		
		set.clear(); //use to clear
	}
}
