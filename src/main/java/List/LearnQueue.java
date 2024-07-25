package List;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
	
	public static void main(String[] args) {
		
		//Interface             //class
		Queue<Integer> qu = new LinkedList<>();               //Arraylist also be connect with interface Queue
		
		qu.offer(12);                                         //offer (to add kind of)
		qu.offer(24);
		qu.offer(36);
		
		System.out.println(qu);                               //1st in 1st out        //Example:Train Ticket
		
		System.out.println(qu.poll());                        //poll (to remove kind off) //if the list empty then it will return null
		System.out.println(qu);
		
		System.out.println(qu.peek());                        //peek is kind of it just let us know which element is on 1st index   //if list is empty then it will return null
		System.out.println(qu);
	
	}

}
