package lesson.java.classes;

public class Car {
	// 필드
	String name;
	String color;
	int price;
	
	// 생성자
	public Car() {
		this.name = name;
		this.color = color;
		this.price = price;

	}
	
	public void Drive() {
		if("run".equals(this.name)) {
			System.out.println("달려요");
		}else if("stop".equals(this.name)) {
			System.out.println("멈춰요");
		}
	}
}
