package 조건문;

import java.util.Date;

public class IF문6 {

	public static void main(String[] args) {
		Date date = new Date();
		
		// 현재 년도를 구해서,
		// 2000년도 이상이면 밀레니엄 세대시군요.
		// 아니면 밀레니엄 세대가 아니시군요.
		int year = date.getYear() + 1900;
		if (year >= 2000) {
			System.out.println("밀레니엄 세대시군요.");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요.");
		}
		
		
		
		// 요일을 구해서,
		// 토, 일은 쉬~~~~~~자 프린트
		// 나머지 요일은 열~~~심히 공부하자 프린트
		int day = date.getDay();
		switch (day) {
		case 0: case 6:
			System.out.println("쉬~~~~~~자");
			break;
		default:
			System.out.println("열~~~심히 공부하자");
			break;
		}
		
		
		
		// 달을 구해서
		// 2월은 28일까지
		// 4,6,7,11월은 30일까지,
		// 나머지는 31일까지 프린트
		int month = date.getMonth() +1;
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.err.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
		
	}

}
