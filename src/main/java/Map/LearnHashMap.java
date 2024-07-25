package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LearnHashMap {

	public static void main(String[] args) {
		//map are used to store the key and its value
		//Map<String, Integer> numbers = new LinkedHashMap<>();   //if linked hash map is used it will give the values in ascending orders
		Map<String, Integer > numbers = new HashMap<>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		
		//if key is same then it will print one time even if the value different
		
		System.out.println(numbers);
		
		

	}

}
