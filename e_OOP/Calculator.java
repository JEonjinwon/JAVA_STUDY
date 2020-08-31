package e_OOP;

import java.util.Scanner;

public class Calculator {

	 public static void main(String[] args) {

	      //5. 사용자로부터 정수를 입력 받아 변수 firstNum에 저장 하여라
	      Scanner sc = new Scanner(System.in);
	      System.out.println("첫 번째 숫자를 입력하세요");
	      int firstNum = sc.nextInt();
	      
	      //6. 사용자로부터 부호를 입력받아 변수 buho에 저장 하여라
	      System.out.println("부호를 입력하세요");
	      String buho = sc.next();
	      
	      
	      //7. 사용자로부터 정수를 입력 받아 변수 secondNum에 저장 하여라
	      System.out.println("두 번째 숫자를 입력하세요");
	      int secondNum = sc.nextInt();
	      
	      //8.. buho에 저장된 값이 '+'이면 add 메서드, '-'이면 substract 메서드
	      //'*'이면 multiply메서드, '/'이면 divide 메서드를 호출하고 결과를 출력하여라
	      // 단, buho에 저장된 값이 위의 4가지 경우가 아니라면 '연산종료'를 출력하여라.
	         
	      Clac cc = new Clac();
	      if("+".equals(buho)){
	         int add = cc.add(firstNum, secondNum);
	         System.out.println(add);
	      } else if ("-".equals(buho)) {
	         int substract = cc.substract(firstNum, secondNum);
	         System.out.println(substract);
	      } else if ("*".equals(buho)){
	         long multiply = cc.multiply(firstNum, secondNum);
	         System.out.println(multiply);
	      } else if ("/".equals(buho)) {
	         float divide = cc.divide(firstNum, secondNum);
	         System.out.println(divide);
	      } else {
	         System.out.println("연산 종료");
	      }
	      
	      
	      
	      
	      
	      
	   }

	}

	class Clac{
	   
	   //1. 두 개의 int 타입을 입력받아 두 인자의 합의 결과를 반환하는 인스턴스메서드 add를 구현하라
	   int add(int a, int b){
	      int result = a+b;
	      return result;
	   }
	   
	   //2. 두 개의 int 타입을 입력받아 앞의 인자에서 뒤의 인자를 뺸 결과를 반환하는 인스턴스 메서드 substract를 구현하여라\
	   int substract(int a, int b){
	      int result = a - b;
	      return result;
	   }
	   
	   //3. 두 개의 int 타입 입력받아 두 인자의 곱을 결과를 반환하는 인스턴스 메서드 multiply를 구현하라
	   // 단, overflow 고려하라
	   
	   long multiply(int a, int b){
	      int result = a*b;
	      return result;
	   }
	   
	   
	   //4. 두 개의 int 타입 입력받아 앞의 인자를 뒤의 인자로 나누기한 결과를 반환하는 인스턴스 메서드 divide를 구현하라
	   // 단, 결과는 소수점 두 번째 자리에서 반올림하여 첫 번째 자리까지 표현 하여라
	   
	   float divide(int a, int b){
	      float result = (int)((float)a/b*10+0.5)/10f;
	      return result;
	   }
	   
	}