package D_array;

import java.util.Arrays;

public class Array_02 {

	public static void main(String[] args) {

		// 1.정렬(sort)
		// -어떤 데이터를 빠르고 쉽게 찾을 목적으로 일정한 순서대로 데이터를 가지런히 나열하는작업.
		// -버블정렬, 선택정렬, 삽입정렬
		//
		// 2.버블정렬(bubble sort)
		// -인접한 데이터 간에 교환이 계속해서 일어난다.
		// -한 회전이 끝나면 가장 큰값이 뒤쪽에 확정된다.
		// -갯수보다 1번 적은 회전 해야 순차적으로 작성됨
		// -0 1 인덱스 비교 =>큰것 뒤로 =>1,2인덱스 비교=>큰것 뒤로 해서 마지막까지 한개 1회전
		//
		int[] num = { 5, 2, 3, 1, 4 };
		for (int k = 1; k < num.length; k++) { // 회전
			System.out.println("\n"+k + "회전");

			for (int i = 0; i < num.length -k; i++) {//회전마다 처리해주는 곳
				int num2 = num[i];		//첫 num[]의 값을 num2에 저장
				if (num2 > num[i + 1]) {//num2의 값과 그다음 num[]의 값을 비교해서 num2가 크면 
					num[i] = num[i + 1];//num[i]의 값에 num[i+1]값으로 바꾼다. 
					num[i + 1] = num2;	//num[i+1]값은 num2의 값으로 바꾼다
				}
				for (int j = 0; j < num.length; j++) { //회전 글자 출력해주는 곳
					System.out.print(num[j]);
				}
				System.out.println();
			}
			
		}
		//3. 선택 정렬(select sort)
		//	-한 회전이 끝나면 가장 작은 값이 앞쪽에 확정된다.
		//	-회전수 = 인텍스값 -1
		//
		//5 2 3 1 4 
		//1회전(기준 0번 index)
		//1. 기준방에서 부터 최소값을 가지고 있는 index를 찾는다. (3)
		//2. 기준 index와 최소값이 있는 index의 값을 바꿔준다.
		//1 2 3 5 4
		//2회전 (기준 1번 index)
		//1. 기준방에서 부터 최소값을 가지고 있는 index를 찾는다. (1)
		//2. 기준 index와 최소값이 있는 index의 값을 바꿔준다.
		//1 2 3 5 4 
		//3회전 (기준 2번 index)
		//1. 기준방에서 부터 최소값을 가지고 있는 index를 찾는다. (2)
		//2. 기준 index와 최소값이 있는 index의 값을 바꿔준다.
		//1 2 3 5 4 
		//4회전 (기준 3번 index)
		//1. 기준방에서 부터 최소값을 가지고 있는 index를 찾는다. (4)
		//2. 기준 index와 최소값이 있는 index의 값을 바꿔준다.
		//1 2 3 4 5 
		
		//int num[] = { 5, 2, 3, 1, 4 };
/*		1회전
		int min = num[0];
		int minbang = 0;
	
		for (int i = 0+1; i < num.length; i++) {
			
			if (min > num[i]) {
				min = num[i];
				minbang = i;
				}
		}
		int temp = num[0];
		num[0]=num[minbang];
		num[minbang]= temp;
		System.out.println(Arrays.toString(num));*/
	
		//시작 :0, 끝 : num.length-1, 증가량  : 1
		for (int j =0 ; j<num.length-1;j++){
			int min = num[j];
			int minbang = j;
		
			for (int i = j+1; i < num.length; i++) {
				
				if (min > num[i]) {
					min = num[i];
					minbang = i;
					}
			}
			int temp = num[j];
			num[j]=num[minbang];
			num[minbang]= temp;
			System.out.println(Arrays.toString(num));
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
