package project;

import java.util.Map;

public interface IDao {

	String logIn(Map<String, String> params);

	String cr_id(Map<String, String> params);
	

	String list_detail(Map<String, String> params);

	String revise(Map<String, String> params);

	String delete(Map<String, String> params);

}
