package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		// 배열을 만들 때 이미 알고 있는 경우
		int[][] n1 = {
				{1, 2, 3},
				{4, 5, 6, 7}
		};
		System.out.println(n1.length);
		System.out.println(n1[1][2]);
		
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.println(n1[i][j]);
			}// j(열)
		}// i(행)
		
		// 배열을 만들 때 아지 모르고 있는 경우, 공간을 먼저 만든다.
		// int[][] n2 = new int[2][3];
		
		
		
		
		
		
		
		
		
	}

}
