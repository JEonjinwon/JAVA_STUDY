package i_collcetion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//C
		list.add(new Integer(5));
		list.add(2); //Auto-Boxing
		list.add(3);
		list.add(1);
		list.add(4);
		
		List<Integer> list2 = new ArrayList<>(list.subList(1, 4));
		System.out.println(list);
		System.out.println(list2); //toString 오버라이딩
		
		//R
		int a = list.get(2); //unBoxing
		System.out.println(a);// 3
		
		//D
		list.remove(2);
		System.out.println(list);// 5 2 1 4 
		
		//U
		int change = new Integer(10);
		int after = list.set(1, change);
		System.out.println("바뀌기전 : "+after+", 바뀐값 : "+change);
		
		System.out.println(list); //5 10 1 4
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
		
		
	
	}
}
