package f_OOP2;

public class PolyTest {

	public static void main(String[] args) {
		//SmartTv 3대를 저장해주세요
		SmartTv st1 = new SmartTv();
		SmartTv st2= new SmartTv();
		SmartTv st3= new SmartTv();
		SmartTv[] st ={st1,st2,st3};
		//AfreecaTv 2대를 저장해주세요
		AfreecaTv at1 = new AfreecaTv();
		AfreecaTv at2 = new AfreecaTv();
		AfreecaTv[] at = {at1,at2};
		//DMBtTv 2대를 저장해주세요
		DMBTv dt1=new DMBTv();
		DMBTv dt2=new DMBTv();
		DMBTv[] dt = {dt1,dt2};
		
		Tv[] t = new Tv[]{st1, st2, st3, at1, at2, dt1, dt2};
		//'t[2] = (TV)stv3;' 생략   
		Tv t2 =t[3]; // up-casting
		
		SmartTv st4 = (SmartTv)t2;
		SmartTv tt = (SmartTv)new Tv(); 
		// 업케스팅 후 다운케스팅은 가능 
		//업케스팅 없이 바로다운케스팅은 안됨
		
		
	}

}

class Tv{
	int volum;
	String color;
	void changeColor(String color){
		this.color=color;
	}
}
class SmartTv extends Tv{
	void internet(){
		
	}
}
class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}
class DMBTv extends Tv{
	void antenna(){
		
	}
}




























