package g_exception;

import java.sql.SQLException;


public class Exception_04 {

	public static void main(String[] args) {
		Controller.idCheck();
	}
}
class Controller{
	static void idCheck(){
		Service.idCheck();
	}
	
}
class Service{
	static void idCheck(){
		try {
			Dao.idCheck();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
class Dao{
	static void idCheck() throws SQLException{
		SQLException sql = new SQLException("ORA-0001");
		throw sql;
	}
}








