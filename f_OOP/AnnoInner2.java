package f_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInner2 {

	public static void main(String[] args) {
		Button b1 = new Button();
		b1.addActionListener(new ActionListener() { //익명클래스  -> 1회용  
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번 버튼 눌림");
			}
		});
	}

}
