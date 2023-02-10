package 배열;

public class 배열개념문제1 {

	public static void main(String[] args) {
		// 1번
		int[] week = { 1, 2, 3, 4, 5, 6, 7 };

		// 2번
		System.out.println("첫번째 숫자는 " + week[0]);
		System.out.println("두번째 숫자는 " + week[1]);
		// 3번
		System.out.println("배열안의 숫자는 총 " + week.length + "개");
		// 4번
		week[2] = 10;
		week[4] = 12;
		// 5번
		System.out.println("변경된 세번째 숫자는 " + week[2] + ", 그리고 다섯뻔째 숫자는 " + week[4]);

		// 6번
		int[] tour = new int[4];
		// 7번
		tour[0] = 20;
		tour[2] = 30;
		System.out.println("변경된 첫번째 숫자는 " + tour[0] + ", 그리고 세번째 숫자는 " + tour[2]);
		// 8번
		System.out.println("이 변수의 총 갯수는 " + tour.length + "개 입니다.");
		
	}

}
