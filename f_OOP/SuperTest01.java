package f_OOP2;

public class SuperTest01 {

	public static void main(String[] args) {

		
		
		
		
	}
}
class Parent2{
	int value =40;
	void method(){
		System.out.println("Parent");
	}
}
class child2 extends Parent2{
	int value = 30;
	void method(){
		System.out.println(value);
		System.out.println(this.value);
		System.out.println(super.value);
		super.method();
	}
}









