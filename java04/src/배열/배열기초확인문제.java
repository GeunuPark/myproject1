package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// int 크기 5인 배열을 생성해보세요
		int[] a1 = new int[5];

		// 배열의 크기를 프린트 해보세요
		System.out.println(a1.length);

		// 배열의 첫번째 위치에서 100을 넣어서 프린트하세요
		a1[0] = 100;
		System.out.println(a1[0]);

		// 배열의 마지막 위치에 500을 넣어서 프린트하세요
		a1[4] = 500;
		System.out.println(a1[4]);

		// 배열의 3번째 위치에 200을 넣어서 프린트하세요
		a1[3] = 200;
		System.out.println(a1[3]);

		// 배열의 전체 데이터를 프린트하세요
		for (int i = 0; i < 5; i++) {
			System.out.println(a1[i]);
		}

		// 배열의 전체 데이터를 인덱스와 함께 프린트하세요
		for (int i = 0; i < 5; i++) {
			System.out.println("배열의 " + (i + 1) + "번째 데이터는 " + a1[i] + "입니다.");
		}

	}

}
