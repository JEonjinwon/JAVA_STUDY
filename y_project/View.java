package y_project;

import java.util.Scanner;

public class View {

	public void startMethod() {
		System.out.println("어서오세요 고객님. Jeon's Mark 입니다.");
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		System.out.println("1. 물품 추가");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			addProduct();
			break;
		case 2:
//			logIn();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("1,2,3 중에 선택해 주세요.");
			break;
		}
	}
	private void addProduct() {
		//이름, 가격
		Scanner sc = new Scanner(System.in);
		System.out.println("물건의 이름을 입력해주세요.");
		String name = sc.next();
		System.out.println("물건의 가격을 입력해주세요.");
		int price = sc.nextInt();
		
		Service sv = new Service();
		boolean result = sv.addProduct(name, price);
		if(result){
			System.out.println("물품 등록에 성공 하였습니다.");
		}
	}
}
