package y_project;

import java.util.Vector;

public class DBClass { //테이블 스페이스 
	private Vector<ProductVo> proList = new Vector<>();//물품들 저장하는 것  // 테이블 

	public boolean addProduct(String name, int price) {
		ProductVo pv1 = new ProductVo(name, price);
		boolean result = proList.add(pv1);
		return result;
	}
	
	
	
	
	
}
