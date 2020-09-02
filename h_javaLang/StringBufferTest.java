package h_javaLang;

public class StringBufferTest {

	public static void main(String[] args) {
		/*
		 String str = "a";
		 str +="a";
		 str +="a";
		 str +="a";
		 str +="a";
		 str +="a";
		 
		 String str = "a";
		 str = new StringBuffer(str).append("a").toString();
		 str = new StringBuffer(str).append("a").toString();

		 */
		String str = "a";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			str+="a";
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		long start2 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		for (int i = 0; i < 30000; i++) {
			sb.append("a");
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
	
		long start3 = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("a"); //StringBuilder은 동기화를 보장하지 않아서 더 빠르다.
		for (int i = 0; i < 30000; i++) {
			sb.append("a");
		}
		long end3 = System.currentTimeMillis();
		System.out.println(end3-start3);
	
	
	
	
	}

}
