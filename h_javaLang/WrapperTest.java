package h_javaLang;

public class WrapperTest {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1);//주소가 아니라 값이 나온게 toString()이 오버라이딩 되어있음
		System.out.println(i2);//wrapper클래스 모두 toString()오버라이딩
		
		System.out.println(i1 == i2);//false
		System.out.println(i1.equals(i2));//true ,wrapper클래스 모두 equals()오버라이딩
		
		Integer[] intArr = new Integer[3];
		intArr[0] = new Integer(5);
		intArr[1] = new Integer(10);
		intArr[2] = new Integer(40);
		
		intArr[0] = 5;	//Auto Boxing  자동으로 포장
		intArr[1] = 10;
		intArr[2] = 40;
		
		int b =	intArr[0]; //unBoxing  자동으로 열어준다.
		
		
		
		
	}

}
