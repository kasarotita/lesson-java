package lesson.java.classes;

public class TV {
	// 필드
	String channel;
	String color;
	int size;
	int volume;
	
	// 생성자
	public TV (String channel, String color, int size, int volume) {
		this.channel = channel;
		this.color = color;
		this.size = size;
		this.volume = volume;
	}
	
	// onoff 메소드
	public void onoff() {
		if("채널을 켜주세요".equals(channel)) {
			System.out.println("채널을 켰습니다");
		}else if("채널을 꺼주세요".equals(channel)){
			System.out.println("채널을 껐습니다");
		}
	}
}
