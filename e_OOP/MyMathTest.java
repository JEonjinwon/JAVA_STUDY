package e_OOP;

public class MyMathTest {

	public static void main(String[] args) {
		MethodTest.add01();
	
		int result2 = MethodTest.add02(5);//가져가는 값 인자값
		
		System.out.println(result2);
		
		MethodTest mt = new MethodTest();
		
		int result3 = mt.add03(5);
		System.out.println(result3);
		int result4=mt.add04();
		System.out.println(result4);
	}

}
 class MethodTest{
	static int a=10;
	static int b=10;
	int c=50;
	static void add01() {
		System.out.println(a+b);
	}
	
	static int add02 (int c){
		int result = a+b+c;
		return result;
	}
	int add03 (int c){
		//MethodTest mt = new MethodTest();
		int result = this.c + c;
		return result;//c의 값이 겹치기 때문에 this.c로 구분 지어줌
	}
	int add04 (){
		//MethodTest mt = new MethodTest();
		int result =c + (int)(Math.random()*101);
		return result;
		
	}
	
	
	
}
