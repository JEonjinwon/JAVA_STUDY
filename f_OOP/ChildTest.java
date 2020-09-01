package f_OOP2;

public class ChildTest {

	public static void main(String[] args) {
		//1.
		Child c = new Child();
		c.volume=10; //자식이 우선 
		c.volumeUp();//자식의 채널 +1
		System.out.println(c.volume);//자식의 채널 출력
		c.channel=15;//자식의 채널을 15로 
		c.channelUp();//부모의 채널을 +1 
		System.out.println(c.channel);//자식의 채널 출력
		
		
		
		
	}

}

class Parent{
	int channel;
	void channelUp(){
		channel++;
	}
}
class Child extends Parent{
	int volume;
	int channel;
	void volumeUp(){
		volume++;
	}
}