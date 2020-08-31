package a_variable;
import java.util.Scanner;

public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        for(int i = 0;i<n;i++){
            answer[i]=x*(i+1);
        }

        return answer;
    }

	 
	 public static void main(String[] args) {
//		// 별찍기
//		 	int i=0;
//		 	int j=0;
////			for (i = 0; i < 5; i++) {
////				for (j = 0; j <= i; j++) {
////					System.out.print("*");
////				}
////				System.out.println("");
////			}
//	
//		 	 Scanner sc = new Scanner(System.in);
//		        int a = sc.nextInt();
//		        int b = sc.nextInt();
//		        int n=0;
//		        int m=0;  
//		        for(m=1;m<=b;m++){
//		            for(n=1;n<=a;n++)
//		            	if(n<a){
//		                System.out.print("*");
//		                }else{
//		                	System.out.println("*");
//		                }
//		        }
	 }		
 
	 
	 
	 
}