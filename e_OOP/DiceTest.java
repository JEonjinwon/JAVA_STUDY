package e_OOP;

public class DiceTest {

	public static void main(String[] args) {
		System.out.println("\t  주사위 게임 ");
		System.out.println();
		DoubleDice td = new DoubleDice();
		int result = td.throwDice((int)(Math.random()*6+1), (int)(Math.random()*6+1));
		System.out.println();
		System.out.println(result+"칸 앞으로 전진");
		for (int i = 0; i < result; i++) {
			String num = "■";
			System.out.print(num);
		}
		String num2 = "□";
		for (int j = 0; j < 30-result; j++) {
			System.out.print(num2);
		}

	}
}
class DoubleDice{
	//인스턴스 메서드명 throwDice
	//	주사위 2개를 던진다.
	//	던진 주사위 2개의 합을 반환 
	//	단 주사위의 눈이 같은 수이면 한번더 던진다 
	//	재귀호출을 이용해서 만드시오.
	//	1. 매개변수 2개 ?
	int result = 0;
	int throwDice(int a, int b) {
		a = (int) (Math.random() * 6 + 1);
		b = (int) (Math.random() * 6 + 1);
		switch(a){
		case 1:
			System.out.println("\t a 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │        ●        │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
		case 2:
			System.out.println("\t a 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
		case 3:
			System.out.println("\t a 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │        ●        │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
		case 4:
			System.out.println("\t a 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
		case 5:
			System.out.println("\t a 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │        ●        │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
		case 6:
			System.out.println("\t a 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●   ●   ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●   ●   ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
			
		}switch(b){
		case 1:
			System.out.println("\t b 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │        ●        │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
		case 2:
			System.out.println("\t b 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
		case 3:
			System.out.println("\t b 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │        ●        │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
		case 4:
			System.out.println("\t b 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
		case 5:
			System.out.println("\t b 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │        ●        │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●       ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
		case 6:
			System.out.println("\t b 주사위");
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│    ┌─────────────────┐    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●   ●   ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │    ●   ●   ●    │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    │                 │    │");
			System.out.println("│    └─────────────────┘    │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
			break;
			
		}
		if (a == b) {
			System.out.println("a : " + a + " b: " + b);
			result += (a + b);
			System.out.println("한번더 ~~!!");
			System.out.println();
			throwDice(a,b);

		} else {
			System.out.println("a : " + a + " b: " + b);
			result += a + b;
		}
		
		
		
		
		
		return result;
	}
	
}