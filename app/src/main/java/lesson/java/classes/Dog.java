package lesson.java.classes;

		//- 필드 : 이름, 종류(치와와, 말라뮤트), 분양가격, 주인이름, 울음소리
		// => 울음소리 : 치와와는 왈왈, 말라뮤트는 멍멍을 출력한다.

public class Dog {
	// 필드
	String name;
	String kind;
	int price;
	String ownerName;
	
	// 생성자
	public Dog(String name, String kind, int price, String ownerName) {
		this.name = name;
		this.kind = kind;
		this.price = price;
		this.ownerName = ownerName;
	}
	
	// 메소드
	public void howling() {
		if("chi".equals(this.kind)) {
			System.out.println("walwal");
		}else if("mal".equals(this.kind)) {
			System.out.println("mal");
		}
	}
}
