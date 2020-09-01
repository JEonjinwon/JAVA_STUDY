package f_OOP2;

public class AbsTest {

	public static void main(String[] args) {
	}

}
abstract class Unit{
	int x; 
	int y;
	
	abstract void move(int x, int y);// 유닛이 이동은 해야하지만 이동하는 방식은 달라서 추상메서드로 작성

	void stop(){
		
	}
}



class Marine extends Unit{
	void stimPack(){
		
	}

	@Override
	void move(int x, int y) {
	
		
	}
}
class Tank extends Unit{
	void changeMode(){
		
	}

	@Override
	void move(int x, int y) {
		
	}
}

class DropShip extends Unit{
	void load(){
		
	}

	@Override
	void move(int x, int y) {
		
	}
}









































