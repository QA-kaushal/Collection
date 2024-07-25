package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {

	public static void main(String[] args) {
		//Treemap is use to define ascending order by keys
		
		Map<String, Integer> numbers = new TreeMap<>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		
		//if key is same then it will print one time even if the value different
		
		System.out.println(numbers);
		
		numbers.remove("two");
		System.out.println(numbers);         //remove by keys not values

	}

}
