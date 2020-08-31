package z_2;

public class Test2 {

	public static void main(String[] args) throws Exception {
		/*try{//에러가 발생할 수 있는 코드
			throw new Exception();//강제 에러
		}catch(Exception e){//에러시 수행 
			e.printStackTrace();//오류 출력(방법 여러가지)
			throw e;//최상위 클래스가 아니라면 무조건 던져주자
		}finally{//에러가 아닐시 수행 
			System.out.println("수행");
		}*/
		try {
			System.out.println("1");
			System.out.println(1/0);
			System.out.println("2");
		} catch (Exception e) {
			System.out.println("3");
		}finally{
			System.out.println("4");
		}
		
		
		
		
		
	}
}
