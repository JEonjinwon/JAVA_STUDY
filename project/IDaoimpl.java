package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class IDaoimpl implements IDao {

	@Override
	public String logIn(Map<String, String> params) {
		String mem_id = params.get("mem_id");
		String mem_pass = params.get("mem_pass");
		
		
		Connection conn =null;
		Statement st = null;
		ResultSet rs = null;
		
		String login_ID = null;
		
		//1. 드라이버 로딩
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 접속
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String id = "JEON";
			String pw = "java";
			conn = DriverManager.getConnection(url, id, pw);
			st= conn.createStatement();
			
			String sql ="SELECT ID "
	                 + "FROM   TMEMBER2 "
	                 + "WHERE  ID = '"+mem_id
	                 +"' AND PW = '"+mem_pass+"'"; 
			rs = st.executeQuery(sql);
			while (rs.next()) {
				login_ID = rs.getString("ID");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속실패");
		}finally{
			try{
				if(rs !=null){
					rs.close();
				}
				
				if(st !=null){
					st.close();
				}
				
				if(conn !=null){
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		}
		return login_ID;
	}

	@Override
	public String cr_id(Map<String, String> params) {
		String mem_id = params.get("mem_id");
		String mem_pass = params.get("mem_pass");
		String mem_detail = params.get("mem_detail");
		Connection conn =null;
		Statement st = null;
		
		
		String login_ID = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 접속
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String id = "JEON";
			String pw = "java";
			conn = DriverManager.getConnection(url, id, pw);
			st= conn.createStatement();
			
			String sql ="INSERT INTO TMEMBER2(ID,PW,DETAIL) "
					 +" VALUES('"+mem_id+"','"+mem_pass+"','"+mem_detail+"')";
	                
			 st.executeUpdate(sql);
		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속실패");
			
			
		}finally{
			try{
				
				if(st !=null){
					st.close();
				}
			
				if(conn !=null){
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		}
		
		
		return login_ID;
	}

	@Override
	public String list_detail(Map<String, String> params) {
		String list_detail = params.get("list_detail");
		String mem_id = params.get("mem_id");
		String mem_pass = params.get("mem_pass");
		
		
		Connection conn =null;
		Statement st = null;
		ResultSet rs = null;
		
		String login_ID = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 접속
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String id = "JEON";
			String pw = "java";
			conn = DriverManager.getConnection(url, id, pw);
			st= conn.createStatement();
			String sql ="SELECT DETAIL "
	                 + "FROM   TMEMBER2 "
	                 + "WHERE  ID = '"+mem_id
	                 +"' AND PW = '"+mem_pass+"'"; 
			rs = st.executeQuery(sql);
			while (rs.next()) {
				login_ID = rs.getString("DETAIL");
				System.out.println(login_ID);
			}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속실패");
		}finally{
			try{
				if(rs !=null){
					rs.close();
				}
				
				if(st !=null){
					st.close();
				}
				
				if(conn !=null){
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		}
		return login_ID;
	}

	@Override
	public String revise(Map<String, String> params) {
		String mem_id = params.get("mem_id");
		String mem_pass = params.get("mem_pass");
		String mem_revise = params.get("mem_revise");
		
		

		Connection conn =null;
		Statement st = null;
		ResultSet rs = null;
		
		String login_ID = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 접속
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String id = "JEON";
			String pw = "java";
			conn = DriverManager.getConnection(url, id, pw);
			st= conn.createStatement();
			String sql ="UPDATE TMEMBER2 "
	                 + "SET   DETAIL = '"+mem_revise+"'"
	                 + "WHERE  ID = '"+mem_id
	                 +"' AND PW = '"+mem_pass+"'"; 
			 st.executeUpdate(sql);
			
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속실패");
		}finally{
			try{
				if(rs !=null){
					rs.close();
				}
				
				if(st !=null){
					st.close();
				}
				
				if(conn !=null){
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		}
		return login_ID;
	}

	@Override
	public String delete(Map<String, String> params) {
		String mem_id = params.get("mem_id");
		String mem_pass = params.get("mem_pass");
	
		
		

		Connection conn =null;
		Statement st = null;
		ResultSet rs = null;
		
		String login_ID = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 접속
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String id = "JEON";
			String pw = "java";
			conn = DriverManager.getConnection(url, id, pw);
			st= conn.createStatement();
			String sql ="DELETE FROM TMEMBER2 "
	                 + "WHERE  ID = '"+mem_id
	                 +"' AND PW = '"+mem_pass+"'"; 
			 st.executeUpdate(sql);
			
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속실패");
		}finally{
			try{
				if(rs !=null){
					rs.close();
				}
				
				if(st !=null){
					st.close();
				}
				
				if(conn !=null){
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		}
		return login_ID;
	}

}
