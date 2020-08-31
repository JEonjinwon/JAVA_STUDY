package z_exam;

public class TotalTest {//TotalTest 클래스가 생성 되어 메소드영역에 로드된다 클래스 변수와 메서드가 같이 로드 되어야한다.
	public static void main(String[] args) { // main()메소드가 생기면서 콜스텍 영역에 로드된다.

		TvMaker.color = "Blue"; // 대입연사자가 나오면 왼쪽부터 실행 ->TvMaker클래스가 호출 -> 메서드 에어리어에 있는지 확인 없으면 클래스 로드  -> TvMaker안에 color라는 클래스 변수에 "Blue"값으로 초기화 
		TvMaker tm = new TvMaker(); // 대입연산자가 나오면 왼쪽부터 -> 콜스텍에  main()메서드에 tm이라는 지역변수 선언 ->  인자 값이 없는 TvMaker()메서드를 인스턴스화 해준다. -> 힙영역에 인스턴스화 해준 객체의 주소를 tm에 저장 
		tm.age = 30; //tm의 인스턴스 변수 age를 30으로 초기화 -> 실행이 끝나면 TvMake()메서드를 콜스텍에서 퇴근 
		// 3. 메서드 호출
		// 3.1 클래스의 인스턴스변수의 값을 받아와 처리
		System.out.println(TvControll.channel);// 출력 ->15 TvControll클래스에 인스턴스 변수channel의 값 15를 반환 받아온다.
		TvControll.volumeDown();//TvControll클래스 호출 -> 메서드영역에 클래스가 있는지 확인후 없으니깐 로드 시키고 volumeDown()메서드를 콜스텍에 로드 시킨다. TvControll클래스에 volumDown()메서드를 가서 channel++를 해준다.
		System.out.println(TvControll.channel);//출력  ->16 TvControll클래스에 인스턴스 변수channel의 값 16를 반환 받아온다.

		// 3.2 인스턴스 메서드를 받아와 처리
		TvControll tc; // 콜스텍에  main()메서드에 지역변수 tc를 선언 
		tc = new TvControll(); //대입연산자 나오면 왼쪽부터, 왼쪽에 tc변수 -> 오른쪽, 인자 값이 없는 TvControll()메서드를 인스턴스화 해준다. -> -> 힙영역에 인스턴스화 해준 객체의 주소를 tc에 저장 
		System.out.println(tc.volume); //출력 -> 99 힙영역에 인스턴스화된 tc의  인스턴스 변수 volume의 값을 받온다.
		tc.volumeUp();//힙영역에 인스턴스화된 tc의 인스턴스 메서드 voluemUp()가 호출된다. -> volume++가 실행되어 volume값을 다시 반환 받는다.
		System.out.println(tc.volume);//출력 -> 100 힙영역에 인스턴스화된 tc의  인스턴스 변수 volume의 값을 받온다.
		tc.volumeUp();;//힙영역에 인스턴스화된 tc의 인스턴스 메서드 voluemUp()가 호출된다. -> 'volume == MAX_VOLUME'이므로 'volume = MIN_VOLUME'가 실행되어 volume값을 다시 반환 받는다.
		System.out.println(tc.volume);//출력 -> 0 힙영역에 인스턴스화된 tc의  인스턴스 변수 volume의 값을 받온다. -> 실행이 끝나면 TvControll()메서드를 콜스텍에서 퇴근 

		//메서드의 이름이 같아도 인자값의 타입이나 갯수가 다르면 아래 클래스에 선언해준 메서드의 매개변수의 타입과 갯수가 같은 곳으로 가서 처리 
		Calc cc = new Calc();// 대입연산자가 나오면 왼쪽부터 -> 콜스텍에  main()메서드에 cc이라는 지역변수 선언 ->  인자 값이 없는 Calc()메서드를 인스턴스화 해준다. -> 힙영역에 인스턴스화 해준 객체의 주소를 cc에 저장 
		System.out.println(cc.add(Integer.MAX_VALUE, 4));//출력 -> -2147483645  힙영역에 인스턴스화된 cc의  인스턴스 변수 add의 값을 받온다. -> 인자값이 (int,int)이므로 인자값의 타입과 갯수가 동일한 메소드를 반환해 온다 -> 반환타입 int 
		System.out.println(cc.add(3L, Integer.MAX_VALUE));//출력 -> 2147483650  힙영역에 인스턴스화된 cc의  인스턴스 변수 add의 값을 받온다. -> 인자값이 (long,int)이므로 인자값의 타입과 갯수가 동일한 메소드를 반환해 온다 -> 반환타입 long

	}//수행이 끝나면 main()메서드가 콜스텍영역에서 퇴근 ㅂㅈㅈㅂ	
}

class TvMaker { // TvMaker클래스가 메서드 영역에 로드 된다  -> static가 붙은 클래스변수, 클래스 메소드가 같이 로드된다
	// 1.전역변수 
	// 1.1 클래스 변수 선언 -> static이 붙으면 클래스 변수 , 클래스 메서드
	static String color;// 클래스 변수 선언, 메서드영역에 클래스 아래에 같이 로드
	static int inch;// 클래스 변수 선언, 메서드영역에 클래스 아래에 같이 로드
	// 1.2인스턴스 변수 선언 및 초기화
	String name = "";// 인스턴스 변수 선언과 초기화, 힙영역에 로드 
	int age; // 인스턴스 변수 선언  , 힙영역에 로드

	// 2.생성자 
	// 2.1 클래스명과 동일한 메서드 생성 
	TvMaker() { //클래스명과 같은 명칭으로 생성자 생성, 매개변수가 없다
		this("man", 25);//this()로 TvMaker의 인스턴스 변수를 초기화해줌 
	}

	// 2.2위의 만든 생성자와 동일한 메서드명이지만 매개변수 갯수와 타입이 달라서 다른 메서드이다. -> 오버로딩
	TvMaker(String name, int age) {//클래스명과 같은 명칭으로 생성자 생성 매개변수가 String, int 2개  -> 위의 생성자와 타입이다르다.
		this.name = name;//매개변수와 구별해주는 위에 서 받아오는 name을 this.name으로 선언 
		this.age = age;//매개변수와 구별해주는 위에 서 받아오는 age을 this.age으로 선언 
	}
}

class TvControll {
	final int MAX_VOLUME = 100;//인스턴스 변수 선언과 초기화, 힙영역에 로드
	final int MIN_VOLUME = 0;//인스턴스 변수 선언과 초기화, 힙영역에 로드
	static final int MAX_CHANNEL = 50;//클래스 변수 선언과 초기화 메서드영역에 클래스 아래에 같이 로드
	static final int MIN_CHANNEL = 1;//클래스 변수 선언과 초기화 메서드영역에 클래스 아래에 같이 로드

	static int channel = 15;//클래스 변수 선언과 초기화 메서드영역에 클래스 아래에 같이 로드
	int volume = 99;//인스턴스 변수 선언과 초기화, 힙영역에 로드

	// 4. return문
	int volumeUp() { // volumeUp의 인스턴스 메서드가 호출되면 콜스텍영역에 로드 되고  return 타입이 int로 수행문을 수행해서 volume를 반환한다. , 힙영역에 로드
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}

	static int volumeDown() { // 메서드영역에 클래스 아래에 같이 로드 ,volumeDown의 클래스메서드가 호출되면 콜스텍영역에 로드 되고  return 타입이 int로 수행문을 수행해서 channel을 반환한다.
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc {
	// 5.매개변수 타입과 개수는 같지만 반환타입이 다른 메서드를 오버로딩 해준것 
	// 힙영역에 로드
	int add(int a, int b) { 
		return a + b;
	}
	// 힙영역에 로드
	long add(long a, int b) {
		return a + b;
	}
	// 힙영역에 로드
	int minus(int a, int b) {
		return a + b;
	}
}
//수행이 전부 끝나면 콜스텍과 메서드영역이 퇴근하고 GC가 힙영역 퇴근 시킨다.














