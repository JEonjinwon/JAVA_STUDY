package f_OOP2;

public class OverTest {

	public static void main(String[] args) {
		OverGo og = new OverGo() ;
		String og2 =  og.overMethod();
		System.out.println(og2);
		System.out.println(og.value);
		int og3 =og.getOverUpvalue();
		System.out.println(og3);
	}
}
class Overup{
	int value=10;
	String overMethod(){
		return "OverUp Method";
	}
	
}

class OverGo extends Overup{
	int value=20;
	
	@Override
	String overMethod(){
		return "OverGo Method";
	}
	String overMethod(int k){
		
		return k+"OverGo Method";
	}
	int getOverUpvalue(){
		return super.value;
	}
	
}




