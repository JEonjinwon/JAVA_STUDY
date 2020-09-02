package h_javaLang;

public class StringTest {

	public static void main(String[] args) {
		//String(String s)
		//주어진 문자열(s)을 갖는 String인스턴스를 생성한다.
		String s = new String("Hello");
		System.out.println(s);
	
		//char charAt(int index)
		//지정된 위치(index)에 있는 문자열을 알려준다.
		String s2 = "Hello";
		char c = s2.charAt(1);
		System.out.println(c);
		
		//int compareTo(String str)
		//문자열(str)과 사전순서를 비교한다. 
		//같으면 0을 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("aab");
		System.out.println(i +"  "+ i2);
		
		//String concat(String str)
		//문자열(str)을 뒤에 덧붙인다.
		String s3 = "Hello";
		String s4 = s3.concat(" Oracle");
		System.out.println(s4);
 
		//boolean contains(CharSequence s)
		//지정된 문자열(s)이 포함되었는지 검사한다.
		String s5 = "JavaSoEz";
		boolean b = s5.contains("S");
		System.out.println(b);
		
		//boolean endsWith(String suffix)
		//지정된 문자열(suffix)로 끝나는지 검사한다.
		String s6 = "JavaSoEz,java";
		boolean b2 = s6.endsWith("java");
		System.out.println(b2);
		
		//boolean equals(Object obj)
		//매개변수로 받은 문자열(obj)과 String인스턴스 의 문자열을 비교한다.
		//obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
		String s7 = "Java";
		boolean b3 = s7.equals("java");
		System.out.println(b3);
		
		//int indexOf(int ch)
		//주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 
		//못 찾으면 –1을 반환한다.
		String s8 = "Hello";
		int b4 = s8.indexOf('l');
		System.out.println(b4);
		
		//int lastIndexOf(int ch)
		//지정된 문자열을 인스턴스의 문자열 끝에서 부터 찾아서 위치(index)를 알려준다.
		//못찾으면 –1을 반환
		String s9 = "Hello";
		int b5 = s9.lastIndexOf('l');
		System.out.println(b5);
		
		//int length()
		//문자열의 길이를 알려준다.
		String s10 = "My Length";
		int b6 = s10.length();
		System.out.println(b6);
		
		//String replace(CharSequence old, CharSequence new)
		//문자열 중의 문자열(old)을 새로운 문자열(nw)로 모두 바꾼 문자열을 반환한다.
		String s11 = "Hello Oracle";
		String b7 = s11.replace("Oracle","Java");
		System.out.println(b7);
		
		//String[] aplit(String regex)
		//문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
		String s12 = "dog-cat-snake";
		String[] sArr = s12.split("-");
		System.out.println(sArr[0]);
		System.out.println(sArr[1]);
		System.out.println(sArr[2]);

		//String substring(int begin, int end)
		//주어진 시작위치(begin)부터 끝 위치(end)범위에 포함된 문자열을 더는다. 
		//이 때, 시작위치듸 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.
		String s13 = "I Love Java";
		String b8 = s13.substring(2,6);
		System.out.println(b8);
		
		//String toLowerCase()
		//String인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환한다.
		String s14 = "I Love Java";
		String b9 = s14.toLowerCase();
		System.out.println(b9);
		
		//String toUpperCase()
		//String인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환한다.
		String s15 = "I Love Java";
		String b10 = s15.toUpperCase();
		System.out.println(s15);
		
		//String trim()
		//문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 
		//이 때 문자열 중간에 있는 공백은 제거되지 않는다.
		String s16 = "  My   Trim  ";
		String b11 = s16.trim();
		System.out.println(b11);

		//static String valueOf(boolean b)
		//지정된 값을 문자열로 변환하여 반환한다.
		//참조변수의 경우, toString()을 호출한 결과를 반환한다.
		//(매개변수로 모든 타입이 올 수 있다.)
		String b12 = String.valueOf(true);
		String c1 = String.valueOf(100);
		String d1 = String.valueOf('a');
		System.out.println(b12);
		System.out.println(c1);
		System.out.println(d1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
