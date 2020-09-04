package project;

import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ViewClass {

	
	private IServise service = new IServiceImpl();
	private String login_id;
	void startMethod() {


		System.out.println("어서오세요");
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.끝내기");
		
		// 고르기
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
 		//메서드 이동
		switch (input) {
		case 1:
			//회원가입
			createMember();
			break;
		case 2:
			//로그인
			LogIn();
			break;
		case 3:
			//종류
			break;

		default:
			
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		
		
	}

	private void LogIn() {
		//id.pw 
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String mem_id = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String mem_pass = sc.next();
		Map<String,String> parms = new HashMap<>();
		parms.put("mem_id",mem_id );
		parms.put("mem_pass",mem_pass );
		
		String login_id = service.log_in(parms);
		
		if(login_id ==null){
			System.out.println("그런사람 없다");
		}else {
			System.out.println(login_id+"회원님 어서오세요");
			System.out.println("1.상세검색\t 2.정보 수정\t3.회원 삭제");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				showMemList(mem_id,mem_pass);
				break;
			case 2:
				reviseMember(mem_id,mem_pass);
				break;
			case 3: 
				deleteMember(mem_id,mem_pass);
				break;
			default:
				System.out.println("볼 자격도 없는 련 다시 로그인해라!!");
				LogIn();
				break;
			}
		}
	}
	
	//수정
	private void reviseMember(String mem_id, String mem_pass){
		Scanner sc =new Scanner(System.in);
		System.out.println("수정 사항을 입력해 주세요.");
		String mem_revise = sc.nextLine();
		Map<String,String> params = new HashMap<>();
		params.put("mem_id",mem_id );
		params.put("mem_pass",mem_pass );
		params.put("mem_revise",mem_revise );
		String login_id = service.revise(params);
		LogIn();
	}
	
	//회원탈퇴
	private void deleteMember(String mem_id, String mem_pass){
		Scanner sc =new Scanner(System.in);
		System.out.println("회원 탈퇴를 하시겠습니까?\n 1.삭제\t2.취소");
		int num = sc.nextInt();
		if(num==1){
			Map<String,String> params = new HashMap<>();
			params.put("mem_id",mem_id );
			params.put("mem_pass",mem_pass );
			String login_id = service.delete(params);
		}else if(num==2){
			System.out.println("취소 됩니다. 재로그인 하세요");
			LogIn();
		}else{
			System.out.println("다른키 눌렀으니깐 취소 됩니다. 재로그인 하세요");
			LogIn();
		}
	}
	
	
	
	//상세검색
	private void showMemList(String mem_id, String mem_pass) {
		
		
		Map<String,String> params = new HashMap<>();
		params.put("mem_id",mem_id );
		params.put("mem_pass",mem_pass );
		
			
		
		
		String login_id = service.list_detail(params);
	}
	//회원가입
	private void createMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String mem_id = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String mem_pass = sc.nextLine();
		System.out.println("비고 입력 ");
		String mem_detail = sc.next();
		
		
		
		Map<String,String> params = new HashMap<>();
		params.put("mem_id",mem_id );
		params.put("mem_pass",mem_pass );
		params.put("mem_detail",mem_detail );

		
		String login_id = service.cr_id(params);
	
		
		
		
	}

}


