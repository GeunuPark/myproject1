package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
//		int[] x = new int[10];
//		x[0] = 10;
//		x[1] = 20;
//		x[2] = 30;
		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		
//		for (int i = 0; i < 9; i++) {
//			System.out.println(x[i]);
//		}
		
		// 우리 가족 성별을 char[]로 저장. 프린트
		char[] gender = {'남', '여', '남', '여'};
		for (int i = 0; i < 4; i++) {
			System.out.println(gender[i]);
		}
		
		// 우리 가족 이름을 str로 저장, 프린트
		String[] name = {"박현기", "한정숙", "박근우", "박나은"};
		for (int i = 0; i < 4; i++) {
			System.out.println(name[i]);
		}
		
		// 우리 가족 시력을 double로 저장, 프린트
		double[] eyes = {0.01, 0.4, 0.03, 0.08};
		for (int i = 0; i < 4; i++) {
			System.out.println(eyes[i]);
		}
		
		// 우리 가족 사람들이 점심을 먹었는지 저장 프린트
		boolean[] lunch = {true, true, true, false};
		for (int i = 0; i < 4; i++) {
			System.out.println(lunch[i]);
		}
		

	}

}