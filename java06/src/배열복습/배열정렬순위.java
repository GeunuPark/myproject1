package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렬을 할 때는 Arrays 사용
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1;
		}//for
		
		for (int x : jumsu) { //알아서 위치값을 옮겨주면서 하나씩 꺼내오기
			System.out.println(x); //출력용!!
		}
		
		
		// 배열 정렬하기
		// 오름차순 (작 => 큰)
		Arrays.sort(jumsu);
		// 정렬 후 확인하기
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		// 정렬 후, 최댓값과 최솟값을 출력하자
		System.out.println("최소값 : " + jumsu[0]);
		System.out.println("최댓값 : " + jumsu[jumsu.length - 1]);
		
		// 상위 30프로, 인원 3000명 높은 점수부터 역순으로 3000명 가져오기
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i];
		}
		System.out.println(sum30 / 3000.0);
		
		// 하위 30프로 평균
		int sum0 = 0;
		for (int i = 0; i < 3000; i++) {
			sum0 = sum0 + jumsu[i];
		}
		System.out.println(sum0 / 3000.0);
		
		String result = Arrays.toString(jumsu); //비파괴 STR
		System.out.println(result);
		
		

	}

}
