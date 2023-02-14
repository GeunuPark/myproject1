package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		// 입력 : 많은 양의 저장공간 (배열 2개)
		//		랜덤으로 데이터를 입력하기 (랜덤으로 생성)
		//		반복문으로 배열 위치(인덱스)를 옯기면서 데이터 입력
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
//		System.out.println(답안지.length);
//		System.out.println(내답안.length);
//		System.out.println(답안지);
//		System.out.println(내답안);
		
		Random r = new Random(); // 데이터값이 정해져있는 랜덤(42)		
		
		for (int i = 0; i < 내답안.length; i++) {
			답안지[i] = r.nextInt(4) + 1;
			내답안[i] = r.nextInt(4) + 1;			
		}//for
		System.out.println("번호\t:\t답안\t\t내답");
		System.out.println("===================================");
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println(i + "\t:\t" + 답안지[i] + "\t<=>\t" + 내답안[i]);
		}
		
		// 처리
		// 같은 인덱스의 두개 배열값을 비교해보자
		// 동일하면 1점씩 획득
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (답안지[i] == 내답안[i]) {
				jumsu = jumsu + 1;
			}//if
		}//for
		
		// 출력
		System.out.println("토익점수는 " + jumsu + "점 입니다.");
		
		
		
		
		
		

	}

}
