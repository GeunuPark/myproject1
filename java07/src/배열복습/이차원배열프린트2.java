package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		// 꼭 먹고 싶은 것 9가지를 작성해서, 전체를 프린트하자.
		
		String[][] s = {
				{"짜장면", "짬뽕", "탕수육"},
				{"광어", "연어", "참치"},
				{"페퍼로니피자", "고구마피자", "불고기피자"},
		}; // 전체를 프린트!
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
			
	}

}
