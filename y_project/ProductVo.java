package y_project;

public class ProductVo {
	private String name;      //컬럼
	private int price;		  //컬럼
	private int bonusPoint;   //컬럼
	
	public String getName() {
		return name;
	}
	public ProductVo(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
}
