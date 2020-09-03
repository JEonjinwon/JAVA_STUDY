package i_collcetion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
//		s.add(5);
//		s.add(2);
//		s.add(3);
//		s.add(1);
//		s.add(4);
		for (int i = 0; i < 10; i++) {
		int random  = (int)(Math.random()*35+1);
		boolean re =s.add(random);
		System.out.println(re);
	}
		//정렬 set -> list
		System.out.println(s);
		List<Integer> ss = new ArrayList<>(s);
		Collections.sort(ss);
		System.out.println(ss);
	
	}
}
