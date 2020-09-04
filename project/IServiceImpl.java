package project;
import java.util.Map;

public class IServiceImpl implements IServise {
	
	private IDao dao = new IDaoimpl();
	

	@Override
	public String log_in(Map<String, String> params) {
		String mem_id = dao.logIn(params);
		return mem_id;
	}


	@Override
	public String cr_id(Map<String, String> params) {
		
		return dao.cr_id(params);
	}





	@Override
	public String list_detail(Map<String,String> params) {
		
		return dao.list_detail(params);
	}


	@Override
	public String revise(Map<String, String> params) {
		
		return dao.revise(params);
	}


	@Override
	public String delete(Map<String, String> params) {
		
		return dao.delete(params);
	}


	
}
