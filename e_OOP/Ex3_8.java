package e_OOP;

public class Ex3_8 {

	public static void main(String[] args) {

		ExTest01 e1 = new ExTest01();
		ExTest02 e2 = new ExTest02(0);

	}
}

class ExTest01 {
	int value;
}

class ExTest02 {
	int value;
	ExTest02(int value) {
		this.value = value;
	}
}
