package List;

import java.util.Stack;

public class LearnStack {
//its kind of when you add values like in order 1,2,3,4 then it will come as in index order 4,3,2,1
//means 1st added it goes to last index and last one come at 1st
	
	public static void main(String[] args) {
//stack is a class which give sus methods push(to add in the list),peek(to get from the list index-wise),pop(to remove from the list index-wise)
		Stack<String> animals = new Stack<>();
	
		animals.push("Lion");    //push-to add like
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		
		System.out.println(animals);  //it will show the list but not in the correct index-wise
		//peek-to get index-wise
		System.out.println(animals.peek());  // it will give correct index wile data
		
		animals.pop();  // remove index-wise //here removed cat
		System.out.println(animals.peek());  // it will give correct index wise data
		
		System.out.println(animals); 
		
		
		
		
		
	}
}
