package Set;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

	public static void main(String[] args) {
		//Orders Wise data [20, 40, 60, 90]

		Set<Integer> set = new TreeSet<>();
		set.add(40);
		set.add(20);
		set.add(60);
		set.add(90);
		set.add(20);
		System.out.println(set);    //it will give you in order wise ascending[20, 40, 60, 90]
System.out.println(set.size());  //gives count and ignore duplicate one
		
		System.out.println(set.contains(40)); //if contains true else false
		
		System.out.println(set.isEmpty());
		set.remove(20);
		System.out.println(set);
		
		set.clear(); //use to clear
		
	}

}
