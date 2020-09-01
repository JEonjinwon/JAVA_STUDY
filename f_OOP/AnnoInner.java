package f_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInner {

	public static void main(String[] args) {
		Button bt1 = new Button();
		ActionListener e1 = new EvenHandler();
		//인터페이스 타입의 참조변수로 그를 구현한 구현체의 인터페이스를 참조할 수 있다.
		//버튼이 많아지거나 동적이면 비현실적이라 익명 클래스를 구현해줘서 해결해야한다.
		bt1.addActionListener(e1);
	}
}
class EvenHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("1번 버튼 눌림");
	}
	
}