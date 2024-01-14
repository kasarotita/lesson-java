package lesson.java.classes;

public class Main {
	public static void main(String[] args) {
		// String name, String kind, int price, String ownerName
		// name = 준호 
		Dog chi = new Dog("junho", "chi", 1, "alz");
		
		chi.howling();
		
		Dog mal = new Dog("chulsu", "mal", 2, "vnd");
		
		mal.howling();
		
	}
}
