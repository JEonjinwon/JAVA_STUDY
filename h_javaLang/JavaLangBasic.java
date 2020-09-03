package h_javaLang;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaLangBasic {

	public static void main(String[] args) {
		/*
		1. java.lang 패키지
			- java프로그램에서 기본적으로 필요한 클래스를 모아놓은 패키지이다.
			- String, Objects, System, .....
		2. objects
			- Objects 클래스는 멤버변수 없이 11개의 메서드로 되어있다.
			
			- equals()
				: 두 객체의 내용이 같은지 확인하는 Method이다.
				: 참조변수가 가르키는 주소를 비교한다.
				: 주소가 아닌 변수의 해당 인스턴스가 가지고 있는 값을 비교하게 하려면
				 	equals()를 오버라이드 해야한다.
				: equals()가 오버라이드 되어있는 클래스
				 	-> String, File, Date,...... 
			- hashCode() - 10진수로 이루어져 있다.
				: 두 객체가 같은 객체인지 확인하는 Method이다.
				: 객체의 주소에서 해시코드를 만들어 반환한다.
				: String클래스는 같은 문자열을 가지고 있다면 동일한 
					해시코드를 반환하게 만들어져 있다.
			- toString()
				: 인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의한 Method이다.
				: Object의 toString()
					-> return getClass().gerName()+"@"+Integer.toHexString(hashCode());
				: toString()가 오버라이딩 되어있는 클래스 
				 	-> String,.....
			- getClass()
				: 클래스의 정보를 얻어올때 사용한다.
					(1)생성된 객체로 부터 얻는 방법
						Class obj = new Person().getClass();
					(2)클래스 리터럴로부터 얻는 방법
						Class obj = Person.class;
					(3)클래스의 이름으로 부터 얻는 방법
						Class obj = Class.forName("Person");
						  -> ClassNotFoundException이 발생할 수 있다.
		
		3. String
			- 다른 언어에서는 문자열을 char형 배열로 다룬다. 
				하지만 java에서는 문자열을 다룰 수 있는 String 클래스를 제공한다.
			- 문자열을 합칠때는 합쳐진 문자열을 저장할 인스턴스 새로 생성된다.
			- 문자열 비교
				: 문자열 리터럴을 만드는 방법과, 객체의 생성자를 이용할수 있다.
			- 인코딩 변환
				: 이클립스의 기본 인코딩 방식은 "MS949"
				: 한글 윈도우의 기본 인코딩 방식은 "CP949"
				: 우리가 사용하는 인코딩 방식은 "UTF-8"
			- 문자열 format
				:기본형 타입을 String타입으로 변환 
					1)빈 문자열을 더하는 방식
					 	int a = 10;
					 	String b = a+"";
					2)valueOf메서드 
					 	String b = String.valueOf(a);
				: String 타입을 기본형으로 변환
					1)wrapper클래스를 이용하는 방식
						String b = "123";
						int c = Integer.parseInt(b);
						int c = Integer.valueOf(b); //모든 wrapper공통으로 사용 
					2)wrapper클래스의 진수
						String b ="234";
						int c = Integer.parseInt(b,8); //b가 8진수로 써있다는 것
		
		4. StringBuffer, StringBuilder 
			- 문자열을 합치기 위해서 사용한다.
		
		5. wrapper클래스
			- 자바는 모든 것을 객체로 다루어야 한다.
			기본형 		│	wrapper클래스
			boolean		│	boolean
			char		│	Character
			byte		│	Byte
			short		│	Short
			int			│	Integer
			long		│	Long
			float		│	Float
			double		│	Double
		
			- 기본형 타입 -> wrapper클래스 : auto-Boxing
			- wrapper클래스 -> 기본형 타입 : unBoxing
		
		6. 정규식(Regular Expression)
			- 텍스트 데이터에서 원하는 형태의 문장을 찾기 위해 만들어 졌다.
			- 정규식 순서
				: 패턴정의
					-> Pattern클래스를 이용하여 패턴을 정의한다.
					Pattern p = Pattern.compile("[a-z]*");
				: 텍스트와 비교
					-> Matcher클래스를 이용하여 패턴과 텍스트를 비교한다.
					Matcher m = p.matcher("text");
					m.matcher(); //boolean타임
			- 정규식 문법
				^  : 문자열 시작
				&  : 문자열 종료
				.  : 임의의 한 문자, 역슬러시는 포함되지 않는다.
				*  : 앞 문자가 없을 수도 무한정 많을 수도 있음 
				+  : 앞문자가 하나 이상 
				?  : 앞문자가 거나없 하나 있음
				() : 문자열을 하나의 문자로 인지한다.
				{} : 반복횟수를 지정한다. {3,5} 3번 4번 5번 중에 반복 
				[] : 범위를 지정할때 사용한다. [abc] abc중에 하나, or은 생략된다.
				|  : OR연산을 수행할때 사용
				\s : 공백문자
				\S : 공백을 제외한 모든 문자
				\w : 알파벳이나 숫자 [A-Za-z0-9]와 같은 의미 
				\W : 알파벳 숫자를 제외한 나머지 문자
				\d : 숫자를 의미 [0-9]와 같은 의미
				\D : 숫자를 제외한 모든 문자
		*/

		Pattern p = Pattern.compile("[a-z]*");
		Matcher m = p.matcher("text");
		

		
	}

}
