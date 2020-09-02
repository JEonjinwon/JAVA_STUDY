package h_javaLang;

public class StringText01 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1 == str2); //true
		System.out.println(str1.equals(str2)); //true
		String str3 = new String("abc"); 
		String str4 = new String("abc");
		System.out.println(str3 == str4); //false
		System.out.println(str3.equals(str4)); //true //equals()가 오버라이드 되어 있어 true
		System.out.println(str2.equals(str3));//true
		
		
	}
}
