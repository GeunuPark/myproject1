package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		int[] score = {10, 20, 30, 40};
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println("전체갯수 : " + score.length); //스코어의 갯수가 총 몇개인지 뛰우기
		
		
		
		score[0] = 100;
		System.out.println(score[0]);
		
		// ============================================
		int[] score2 = new int[4];
		score2[0] = 200;
		System.out.println(score2[0]);
		
	}

}
