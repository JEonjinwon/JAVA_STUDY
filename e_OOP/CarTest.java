package e_OOP;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("Red", "Auto",2);
		Car car3 = new Car("Red");
		System.out.println(car3.color);
		System.out.println(car3.gearType);
		System.out.println(car3.door);
		
	}
}
class Car{
	String color;
	String gearType;
	int door;
	Car(){
		color = "Black";
		gearType = "Auto";
		door = 2;
	}

	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	Car(String color){
		this();// 생성자의 첫줄에만 넣어라
		this.color = color;
	}
	
}






