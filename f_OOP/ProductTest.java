package f_OOP2;

import java.util.Vector;

public class ProductTest {

   public static void main(String[] args) {
      System.out.println("┌─────────────────────────────────┐");
      System.out.println("│                                 │");
      System.out.println("│         Jeon's Market           │");
      System.out.println("│                                 │");
      System.out.println("└─────────────────────────────────┘\n\n");
      NoteBook n = new NoteBook("mac", 300);
      Styler s = new Styler("LG", 200);
      Fridge f = new Fridge("SamSung", 500);
      

      Buyer b = new Buyer("이순신", 10000);
      Buyer c = new Buyer("홍길동", 20000);
      b.buy(f);
      b.buy(n);
      b.buy(n);
      b.summary();
      b.refund(f);
      System.out.println("\n\n\n\n\n\n");
      c.buy(f);
      c.buy(s);
      c.summary();
      c.refund(s);
      

      
      
   }
}

class Product {
   // 제품이름
   String name;
   // 가격
   int price;
   // 보너스 포인트
   int p_point;
   
   Prodnum pd = new Prodnum();
   Product(String name, int price) {
      this.name = name;
      this.price = price;
      p_point = price / 10;
      
      pd.setProdPluse(name);
   
   }

}

class NoteBook extends Product {

   NoteBook(String name, int price) {
      super(name, price);
   }

   @Override
   public String toString() {
      return "NoteBook";
   }
}

class Styler extends Product {

   Styler(String name, int price) {
      super(name, price);
   }

   @Override
   public String toString() {
      return "Styler";
   }
}

class Fridge extends Product {

   Fridge(String name, int price) {
      super(name, price);

   }

   @Override
   public String toString() {
      return "Fridge";
   }

}

class Buyer {
   String name;
   int money;
   int mileage;
   User u = new User();
   
   
   Vector item = new Vector(); // 10개를 담을 수 있는 배열 생성된것
   Prodnum pd = new Prodnum();
   Buyer(String name, int money) {
      this.name = name;
      this.money = money;
      u.setUser(name);
   }
   
   void buy(Product nb) {
      if (money < nb.price) {
         System.out.println("거지련");
         return;
      }
      pd.setProdbuy(nb.name);
      money -= nb.price;
      mileage += nb.p_point;
      item.add(nb);
      String uName = u.getUser();
      System.out.println(uName + "고객님  " + nb.name + " " + nb
            + "를 구매해주셔서 감사합니다." );
      int NoteBookNum = pd.noteBook_num;
      int fridgeNum = pd.fridge_num;
      int stylerNum = pd.styler_num;
      System.out.println("노트북 제고량 : "+NoteBookNum);
      System.out.println("냉장고 제고량 : "+fridgeNum);
      System.out.println("스타일러 제고량 : "+stylerNum);
      
   }

   // 1.summary
   /*
    * 영 수 증 구매목록 NoteBook 300만원 Styler 200만원 총합 500만원
    * 
    * xxx고객님의 남은돈은 xxx이고 마일리지는 xxx입니다. 오늘도 좋은하루 보내세요.
    */

   void summary() {
      System.out.println("───────────────────────────────────────");
      System.out.println("\t영\t수\t증");
      System.out.println("구매목록");
      int totalPrice = 0;
      for (int i = 0; i < item.size(); i++) {
         if (item.get(i) instanceof Product) {
            Product f = (Product) item.get(i);
            System.out.println("\t" + f.name + "\t\t" + f.price +"만원");
            totalPrice += f.price;
         }
      }
      String uName = u.getUser();
      System.out.println("\n총합\t\t\t" + totalPrice +"만원");
      System.out.println(uName + " 고객님의 남은돈은 " + money + "만원 이고 마일리지는 "
            + mileage + "만원 입니다.");
      System.out.println("오늘도 좋은 하루 보내세요.");
      System.out.println("───────────────────────────────────────");

   }

   // 2. refund (반품)
   /*
    * 1.고려사항 - 물건을 산 내역이 없을때 - 내가 산 물건만 반품
    */
   void refund(Product nb) {
      if (item.isEmpty()) {
         System.out.println("물건을 산 내역이 없습니다.");
		}
		if (item.remove(nb)) {
			money += nb.price;
			mileage -= nb.p_point;
			String uName = u.getUser();
			System.out.println("\n\n반품 영수증 출력");
			System.out.println(uName + " 고객님  " + nb.name + " " + nb
					+ "를 반품하셨습니다");
			summary();
			pd.setProdPluse(nb.name);
			int NoteBookNum = pd.noteBook_num;
			int fridgeNum = pd.fridge_num;
			int stylerNum = pd.styler_num;
			System.out.println("노트북 제고량 : " + NoteBookNum);
			System.out.println("냉장고 제고량 : " + fridgeNum);
			System.out.println("스타일러 제고량 : " + stylerNum);
		} else {
			System.out.println("구매 하신 물건이 아닙니다.");
		}
	}
}

// 3. 물품의 수량을 관리
class Prodnum {
   // 제고
   int noteBook_num=10;
   int styler_num=10;
   int fridge_num=10;

   public int setProdPluse(String name){
      switch(name) {
      case "mac":
         return  noteBook_num++;
      case "LG":
         return  styler_num++;
      case "SamSung":
         return fridge_num++;
      default:
         return 0 ;
      }
   }
   public int setProdbuy(String name){
	   
      switch(name) {
      case "mac":
    	  if(noteBook_num >0){
    		  return  noteBook_num--; 
    	  }else{
    		  System.out.println("노트북의 제고가 없습니다.");
    	  }
    	  	
      case "LG":
    	  if(styler_num>0){
    		  return  styler_num--;
    	  }else{
    		  System.out.println("스타일러의 제고가 없습니다.");
    	  }
      
      case "SamSung":
         if(fridge_num>0){
        	 return fridge_num--;
         }else{
   		  System.out.println("냉장고의 제고가 없습니다.");
   	  }
      default:
         return 0 ;
      }
   }
   
   public int getNoteBook(){
      return noteBook_num; 
   }
   
   public int getStyler(){
      return styler_num;
   }
   
   public int getFridge(){
      return fridge_num;
      
   }

}

// 4. 고객의 목록을 관리해주세요.
// 고객등록 -> 누가 뭐를 몇개 샀는지 누가 뭐를 반품하는지 알아야됨
class User{
    String name;
    
    void setUser(String name){
       this.name = name;       
    }
    String getUser(){
       return name;
    }
}



