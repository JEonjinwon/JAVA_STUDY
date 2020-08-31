package D_array;

public class Array_01 {

	public static void main(String[] args) {
		// 1.배열(array)이란
		// -같은 타입의 여러변수를 하나의 묶음으로 다루는 것.
		// 2.배열 선언
		// -원하는 타입의 변수를 선언하고 변수 또는 타입의 배열임을 의미하는 []를 붙인다.
		// 변수타입[]변수명; int[]arr;
		// 변수타입 변수명 []; int arr[]
		/*
		 * 3.배열의 생성 -배열을 선언한 다음에는 배열을 생성해야 한다. -배열을 생성하기 위해서는 연산자 'new'와 함께 배열의
		 * 타입과 크기를 지정해 주면된다. ex)변수명 = new 변수타입[n]; 
		 * 변수명 = new 변수타입[]{값,값,값,값,......,값}; 변수타입 변수명[] = {값,값,....값};
		 * 
		 * 4.배열의 초기화 -배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화 된다.
		 */
		// 1. int형 값을 4개 저장할 수 있는 변수 arr을 선언 및 생성해 주세요.
		/*
		 * int arr[] = new int[4];//{0,0,0,0} for(int i=0;i<arr.length;i++){
		 * System.out.println(arr[i]); }
		 */
		// 2. arr의 0번 index에 10,arr의 1번 index에 20,arr의 2번 index에 30, arr의 3번
		// index에 40
		/*
		 * arr[0] =10; arr[1] =20; arr[2] =30; arr[3] =40;
		 */
		int arr[] = new int[4];// {0,0,0,0}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 10 + 10;
			System.out.println(arr[i]);
		}
		int arr2[] = new int[] { 3, 2, 1 };
		int arr3[] = { 1, 3, 5, 7, 9 };

		// 3.arr3의 모든 방의 합계를 구하여라.
		int sum3 = 0;

		for (int i = 0; i < arr3.length; i++) {
			sum3 += arr3[i];
		}
		System.out.println(sum3);

		//1. 6과목의 점수를 저장할 수 있는 변수 score를 선언 및 생성
		int[] score = new int[6];
		//2. score의 각 방을 0~100사이의 임의의 정수값으로 변경하여라.
		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 101);
		}
		System.out.println();
		//3. score의 각방의 값을 출력하여라
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		System.out.println();
		//4. score의 각방의 합계를 구하세요
		int sum_1 = 0;
		for (int i = 0; i < score.length; i++) {
			sum_1 += score[i];
		}
		System.out.println(sum_1);
		
		//5. score의 각방의 평균을 구하세요
		float avg = 0f;
		avg = (int) ((float) sum_1 / score.length * 100 + 0.5) / 100f;
		System.out.println(avg);
		
		//6. score의 각방 중 최대값을 구하세요
		int max = score[0];
		for (int i = 1; i < score.length; i++) {
			if(max<score[i]){
				max=score[i];
			}
		}System.out.println(max);
		
		//7. score의 각방 중 최솟값을 구하세요
		int min = score[0];
		for (int i = 1; i < score.length; i++) {
			if(min>score[i]){
				min=score[i];
			}
		}System.out.println(min);
	}

}
