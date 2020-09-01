package g_exception;

public class Exception_03 {

	public static void main(String[] args) {
		
		Exception e1 = new Exception("지각하지마");
		RuntimeException e2 = new RuntimeException();

		try{
			throw e1;
		}catch(Exception e){
			System.out.println("예외 발생시키기 성공.");
			e.printStackTrace();
			System.out.println(e.getMessage());//이유만 뽑아오는 것 
		}
		RuntimeException re = new RuntimeException("아아아ㅏㅏㅏㅏ");
		try{
			throw re;
			
		}catch(RuntimeException e){
			e.printStackTrace();
			System.out.println("예외 2번 성공");
		}
		/*
		컴파일러가 예외 처리를 강제하지 않는 경우
			- RuntimeException과 그 자손들
			- Error
			이 두가지를 'unChecked'예외라고 부른다.
		*/
	}
}
