package List;


import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.google.common.collect.Comparators;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		System.out.println("smaller value at 1st");
		Queue<Integer> pq = new PriorityQueue<>() ;   //it will decide priority //by default smaller number will come at first 
		pq.offer(24);
		pq.offer(40);
		pq.offer(12);                                       
		pq.offer(36);
		
		System.out.println(pq);  //it will give you ans [12, 36, 24, 40] even if u added randomly
      //here 1st index will be lowest 
		
		pq.poll();
		System.out.println(pq); 
		
		System.out.println(pq.peek());
		//run the class you will get know
		
		
		//If you want lager at 1st 
		System.out.println("larger value at 1st");
		Queue<Integer> rev = new PriorityQueue<>(Comparator.reverseOrder()) ;
		rev.offer(24);
		rev.offer(40);
		rev.offer(12);                                       
		rev.offer(36);
		System.out.println(rev);
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.add(20);
		adq.addFirst(22);
		adq.addLast(40);
		System.out.println(adq);                //same as queue but they are provide fist last element method as well
		adq.peekFirst();
		adq.peekLast();
		adq.pollFirst();
		adq.pollLast();
		//like these nothing more difference
	}

}
