package i_collcetion;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,Integer> param = new HashMap<>(); //Object, Object => String, Integer 

		//C, U
		param.put("홍길동", 50); //put가 insert 겸 update라 처음에는 null 그 키값에 넣어줬으면 그 전값
		param.put("홍길은", 60);
		param.put("홍길금", 15);
		param.put("홍길플", 20);
		
		//R
		int hong = param.get("홍길동");
		System.out.println(hong);
		System.out.println(param);
		//D
		param.remove("홍길동");
		System.out.println(param);
		
		Map<String, String> mem = new HashMap<>();
		mem.put("mem_id", "a001");
		mem.put("mem_pw", "asdfasdf");
		
		String r=mem.get("mem_id");
		System.out.println(r);
		//select
		//FROM	MEMBER
		//WHERE	MEM_ID = mem.get("mem_id");
		//AND	MEM_PW = mem.get("mem_pw");
		
		
		
	}
}
