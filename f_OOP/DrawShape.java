package f_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame {
	public static void main(String[] args) {
		DrawShape ds = new DrawShape();
		//ds.paint(g);

	}

	DrawShape() {
		super("여기는 제목 부분 ");// 제목
		setSize(1000,1000);// 프레임 크기 지정
		setBackground(Color.pink);
		setVisible(true);// 프레임 보이는 여부
		setResizable(false);//창 크기 조절 여뷰
	}

	@Override
	public void paint(Graphics g){
		//1.매개변수가 2개인 생성자를 이용하여 Circle객체를 만들어주세요
		Point pt = new Point(100,100);
		Circle c= new Circle(50,pt);
		//2. g.drawOval() 원을 그려주세요
		g.drawOval(c.center.x, c.center.y,  2*c.r, 2*c.r);
		//3. 매개변수가 하나인 생성자를 이용하여 Triangle 객체를 만들어주세요
		//100,100 200,200 200,100
		Point[] pp = {
				new Point(100,100),
				new Point(200,200),
				new Point(200,100)
		};
		Triangle tr = new Triangle(pp);
		//4. g.drawLine() 3개를 이용하여 삼각형을 그려주세요
		g.drawLine(tr.p[0].x, tr.p[0].y, tr.p[1].x,tr.p[1].y);
		g.drawLine(tr.p[1].x, tr.p[1].y, tr.p[2].x,tr.p[2].y);
		g.drawLine(tr.p[2].x, tr.p[2].y, tr.p[0].x,tr.p[0].y);
		
	}
	
}

/**
 * 
 * @author PC-17
 * @since 2020.08.24
 */
class Point {
	int x; // 점의 x좌표
	int y; // 점의 y좌표

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

class Circle {
	// 1. 반지름(정수)을 저장할 수 있는 변수 r을 선언하시오.
	int r;
	// 2. 점 하나를 저장할 수 있는 변수 center를 선언하시오.
	Point center;
	// 3. 매개변수가 2개인 생성자를 이용하여 r과 center을 초기화해주시요.
	Circle(int r, Point center) {
		this.r = r;
		this.center = center;	
	}
	// 4. 기본생성자를 만들어주세요.
	// 단 매개변수가 2개인 생성자를 호출하여 좌표는 100,100 반지름은 50으로 초기화하시오
	Circle() {
		this(50,new Point(100,100));
	}
}

class Triangle {
	// 1. 점3개를 저장할 수 있는 변수 p를 선언해주세요.
	Point[] p;

	// 2. 매개변수가 하나인 생성자를 만들어주세요.
	Triangle(Point[] p){
		this.p=p;
	}

	// 3. 매개변수가 3개인 생성자를 만들어주세요.
	Triangle(Point a,Point b, Point c){
		p=new Point[3];
		p[0]=a;
		p[1]=b;
		p[2]=c;
	}
}















