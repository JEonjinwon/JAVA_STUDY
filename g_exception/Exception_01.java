package g_exception;

public class Exception_01 {

	public static void main(String[] args) {
/*
		1. 프로그램 오류
			- 프로그램이 실행중에 어떤 이유로 인해 오작동을 하거나 비정상적으로 종료되는 경우
			- 컴파일 오류 : 컴파일중에 발생하는 오류
			- 런타임 오류 : 프로그램 실행중에 발생하는 오류
			- 오류의 종류 
				: 에러  -> 프로그램 코드를 이용하여 수숩될수 없는 심각한 오류 
				: 예외  -> 프로그램 코드를 이용하여 수습될수 있는 경미한 오류
			
		2. RuntimeException과 그외 Exception
			- 모든 예외의 최고 조상은  Exception이다.
			- RuntimeException은 주로 프로그래머의 실수로 발생하는 예외
				: indexOutOfBoundException, NullPointException...
			- 그외 Exception들은 주로 외부의 영향에 의해서 발생하는 예외 
				: ClassNotFoundException, FileNotFoundException
			
		3. try-catch	
			- 프로그램 실행시 발생할수 있는 예외에 대비한 코드를 작성하는 것
			- 작성방법
				try{
					//예외가 발생할수 있는 코드
				}catch(Exception1 e){
					//수행한 코드에서 Exception1이라는 예외가 발생했을 때  처리하는 문장
				}catch(Exception2 e){
					//수행한 코드에서 Exception2이라는 예외가 발생했을 때  처리하는 문장
				}
			
			- 발생한 종류의 예외와 일치하는 하나의 catch만 수행된다.
		4. 예외 발생 시키기 
			- 연산자 new를 이용하여 벌생시키고자 하는 예외의 객체를 만든다.
			- 예약어 throw()를 이용하여 예외를 발생시킨다.
				Exception e1 = new Exception();
				throw.e1;
				->	throw new Exception();
			- 컴파일러가 예외 처리를 강제하지 않는 경우
				- RuntimeException과 그 자손들
				- Error
				이 두가지를 'unChecked'예외라고 부른다.
			
		5. 예외 던지기(throws)
			- 메서드의 예외 선언하기
				: 메서드의 선언부 마지막에 예약어 throws와 함꼐 예외 종류를 적어주기만 하면된다.
				: 예외의 처리는 해당메서드를 호출한 쪽에서 처리하면 된다.
		6. finally
			- try-catch 블럭에 상관없이 수행되어야 할 코드를 포함한다.
			- 작성방법 
				try{
					//예외가 발생할수 있는 코드
				}catch(Exception1 e){
					//수행한 코드에서 Exception1이라는 예외가 발생했을 때  처리하는 문장
				}catch(Exception2 e){
					//수행한 코드에서 Exception2이라는 예외가 발생했을 때  처리하는 문장
				}finally{
					//예외발생에 상관없이 수행되어야 할 코드 
				}
				
			
			
*/				
		
	}

}
