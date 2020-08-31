package D_array;

public class Array_03 {

	public static void main(String[] args) {
		//1.다차원 배열
		//	-자바에서는 1차원 배열 뿐만 아니라 다차원 배열 도 허용한다.
		
		//2. 이차원 배열의 선언
		//	-변수타입[][] 변수명; int[][] arr;
		//	-변수타입 변수명[][]; 
		//	-변수타입[] 변수명[];
	
		//3. 이차원 배열의 생성
		//	-변수명 = new 변수타입[크기1][크기2];
		int[][] arr = new int[1][2] ;
		// {
		// {0,0,0},
		// {0,0,0}
		// }
		//arr.length
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.print(arr[0][0]);
		System.out.print(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.print(arr[1][0]);
		System.out.print(arr[1][1]);
		System.out.println(arr[1][2]);
		for (int h = 0; h < arr.length; h++) {
			for (int y = 0; y < arr[h].length; y++) {
				System.out.println(arr[h][y]);
			}
		}
	
	
		int[][] arr2 = {
					{10,20,30},
					{40,50,60}
					};
		for (int h = 0; h < arr2.length; h++) {
			for (int y = 0; y < arr2[h].length; y++) {
				System.out.println(arr2[h][y]);
			}
		}		
		int[][] arr3 = new int[3][];
		/*{
			null,
			null,
			null
		}*/
		arr3[0] = new int[2];
		/*{
			{0,0},
			null,
			null
		}*/
		arr3[1] = new int[3];
		/*{
			{0,0},
			{0,0.0},
			null
		}*/
		arr3[2] = new int[4];		
		/*{
			{0,0},
			{0,0.0},
			{0,0.0,0}
		}*/
		
		//3. 변수 names를 선언하고 주변 친구 6명의 이름으로 초기화 하여라 
		String[] names = { "전진원", "김선준", "김성준", "박찬", "서대철", "이재형" };
		//4. subjects 7과목 국영수사과 자바 오라클을 만들고 선언
		String[] subjects = { "국어", "영어", "수학", "사회", "과학", "자바", "오라클" };
		//1. 6명의 7과목을 저장할 수 있는 배열 score를 선언 및 생성해주세요.
		int[][] score = new int[names.length][subjects.length];
		
		//2. score 각 방을 0~100점 사이의 임의의 정수 값을 저장 하여라.
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 101);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//5. 사람별 합계 
		int[] nameshab = new int[names.length];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				nameshab[i] += score[i][j];
			}
		}
		
		//6. 사람별 평균  소숫점 3번쨰에서 반올림해서 소숫점 2자리만 
		float[] namesavg = new float[names.length];
		for (int i = 0; i < score.length; i++) {
			namesavg[i] = (int) ((float) nameshab[i] / score[i].length * 100 + 0.5) / 100f;
		}
		
		//7. 과목별 합계 
		int[] subhab = new int[subjects.length];
		for (int i = 0; i < subjects.length; i++) {
			for (int j = 0; j < names.length; j++) {
				subhab[i] += score[j][i];
			}
		}

		//8. 과목별 평균 소숫점 3번쨰에서 반올림해서 소숫점 2자리만 
		float[] subavg = new float[subjects.length];
		for (int i = 0; i < subjects.length; i++) {
			subavg[i] = (int) ((float) subhab[i] / names.length * 100 + 0.5) / 100f;
		}
		
		//9. 사람별 석차  합계 기준 
		int[] rank = new int[names.length];
		
		for (int i = 0; i < score.length; i++) {
			rank[i]++;
			for (int j = 0; j < score.length; j++) {
				if(nameshab[i]<nameshab[j]){
					rank[i]++;
				}
			}
			
			
		}
		
		
		//0. 아래와 같이 출력해 주세요.
		for (int k = 0; k < subjects.length; k++) {
			System.out.print("\t" + subjects[k]);
		}
		System.out.println("\t합계\t평균\t석차");
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(nameshab[i] + "\t" + namesavg[i]+"\t"+rank[i]);
			System.out.println();
		}
		System.out.print("합계\t");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subhab[i] + "\t");
		}
		System.out.println();
		System.out.print("평균\t");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subavg[i] + "\t");
		}
		System.out.println();
		
		
		
		
		//10.성적순으로 sort하여라 hab기준 (버블소트 활용함)
		for (int k = 1; k < score.length; k++) {
			for (int i = 0; i < score.length - k; i++) {
				if (nameshab[i] < nameshab[i + 1]) {
					int namehabsort = nameshab[i];//합계
					nameshab[i] = nameshab[i + 1];
					nameshab[i + 1] = namehabsort;
					
					float avgsort = namesavg[i];//평균
					namesavg[i] = namesavg[i + 1];
					namesavg[i + 1] = avgsort;
					
					int ranksort = rank[i];//석차
					rank[i] = rank[i + 1];
					rank[i + 1] = ranksort;
					
					String namesort=names[i];//이름
					names[i]=names[i+1];
					names[i+1] = namesort;
					
					for (int j = 0; j < score.length; j++) {
						int scoresort= score[i][j];//각 점수
						score[i][j]=score[i+1][j];
						score[i+1][j]=scoresort;
					}
				} 
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("========================================= sort 후 ================================");
		for (int k = 0; k < subjects.length; k++) {
			System.out.print("\t" + subjects[k]);
		}
		System.out.println("\t합계\t평균\t석차");
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(nameshab[i] + "\t" + namesavg[i]+"\t"+rank[i]);
			System.out.println();
		}
		System.out.print("합계\t");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subhab[i] + "\t");
		}
		System.out.println();
		System.out.print("평균\t");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subavg[i] + "\t");
		}
		System.out.println();
	}

}
