package lesson.java.classes;

import java.util.Random;

public class Leejunho {
	public static void main(String[] args) {
		String[] items = {"이준호", "여의도", "선생님", "배민", "코테"};
		
		Random ran = new Random();
		
		int ranNum = ran.nextInt(5);
		for(int i = 0; i < 5; i++) {
			if(i != 3) {
			}
		}
		System.out.println(items[ranNum]);
	}
}
