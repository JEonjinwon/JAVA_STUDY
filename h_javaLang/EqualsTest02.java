package h_javaLang;

import java.io.Serializable;

public class EqualsTest02 {

	public static void main(String[] args) {
		Person p1 = new Person(960707L);
		Person p2 = new Person(960707L);
		System.out.println(p1 == p2);	//주소비교해서 false
		System.out.println(p1.equals(p2)); //오버라이드 해서 비교 해야 값을 비교
//		String a = null;
//		System.out.println(a.equals(null)); // 앞에가 null이 오면  안된다.
		System.out.println(p1);
		System.out.println(p1.hashCode());
	}
}
class Person implements Serializable{
	long regNo;
	public Person(long regNo) {
		this.regNo = regNo;
	}
	@Override
	public boolean equals(Object obj) {
		Boolean result = false;
		if(obj instanceof Person && obj != null){
			 result = this.regNo == ((Person)obj).regNo;
		}
		return result;
		
	}
	@Override//단축키 : 알트 + 쉬프트 + s => s => 엔터
	public String toString() {
		return "Person [regNo=" + regNo + "]";
	}
	
}

























