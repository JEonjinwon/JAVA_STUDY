package i_collcetion;

public class Collection_01 {

	public static void main(String[] args) {
		/*
		1.collection framework
		 - Collection
		 	: 데이터 그룹 
		 - Framework
		 	: 일하기 위한 틀 
			: 표준화가 가능하다.
		 - Collections ─┬──── collection ─┬──── List(순서가 있어서 데이터 중복 O)─── Vector<>, Stack, ArrayList
		   			    │ 			      │
					    │				  └──── Set(순서가 없어서 데이터 중복 X)─── HashSet, TreeSet
					    └──── Map(<키, 값>, 순서 X, 키는 중복 X, 값은 중복O)─── HashMap, TreeMap, HashTable, Properties
		
		2. 핵심 interface
		 - List
		 	: 순서가 있다.
		 	: 데이터의 중복을 허용한다.
		 	: 구현체 :Vector, Stack, ArrayList, LinkedList, .....
		 	: 예) 대기표 명단.
		 	
		 - Set
		 	: 순서가 없다
		 	: 데이터 중복을 허용하지 않는다.
		 	: 구현체 : HashSet, TreeSet,.....
		 	: 예) 정수의 집합
		 - Map
		 	: 키(key)와 값(value)으로 이루어져있다.
			: 순서가 없다.
			: 키는 중복을 허용하지 않는다.
			: 값은 중복을 허용한다.
			: 구현체 : HashTable, HashMap, TreeMap, Properties,....
		 	: 예) 지역번호(전화번호), 우편번호
		 	
		3. ArrayList
		 - 배열을 사용하였을 때 길이를 한번 정하면 변경이 불가한 단점을 보완하기 위해 만들어졌다.
		 - 메서드들
		 	: add() 	  	 -> 객체를 추가한다.
			: remove() 		 -> 객체를 제거한다.
			: get(int index) -> 지정된 index번째 객체를 얻어온다.
			: set(int index, Object obj) -> 지정된 index번째 객체를 교체한다. 값의 요소가 아닌 주소를 바꾸는 것 
			
		4. LinkedList
		 - 자신의 데이터와 다음 데이터의 주소를 가짖고 있다.
		 - 이전 요소를 찾을 수가 없다 .
		 
		5. DoubleLinkedList
		 - 자신의 데이터와 이전데이터의 주소, 다음 데이터의 주소를 가지고 있다. 
		
		6. Stack
		 - First In Last Out : FILO
		 - push()  	: 객체 추가
		 - pop()	: 추출
		 - serch()	: 원하는 객체를 찾는다.
		 - peak()	: 가장위의 객체를 가져온다.
		
		7. Queue
		 - First IN First Out : FIFO
		 - offer()	: 추가
		 - poll()	: 추출
		 
		8. HashSet
		 - 새로운 요소를 추가하기 위해 add, addAll메서드를 사용할 때 중복추가 될때 실패하게 된다.
		  
		9. HashMap<Object, Object>
		 - 키(key)와 값(value)로 이루어져 있다.
		 - 순서가 없기 때문에 키는 중복을 비허용, 값은 중복을 허용 한다.   
		 - 키와 값의 타입으로 Object형태이지만 일반적으로는 키의 경우 String으로 사용한다.
		 - method들
		  	: put()		-> 객체를 추가
		  	: get(키)	-> 원하는 객체의 값을 가져온다.
		  	: remove(키)	-> 객체를 지운다. 
		  
		  
		  
		  
		  
		  
			
			
			
			
			
			
			
			
			
			
			
			
			
			
                                                                                                       			
			
			
			
			
			
			
			
			
			
		*/
		
	}

}
