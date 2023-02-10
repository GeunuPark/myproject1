package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		// 아무값이나 생성해서 출력하기
		Random r = new Random();
		
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호 :" + (r.nextInt(45) + 1));
			// 0~9까지의 Int를 총 6개 생성
		}
		
		
		
		// 2 ~ 10
		Random r1 = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호 1 : " + (r.nextInt(9)+2));
		}
		
		//
		
		
	}

}
