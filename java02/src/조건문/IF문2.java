package 조건문;

public class IF문2 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		// x와 y가 같은지 비교해보자.
		// 같으면 동일합니다. 프린트
		// 다르면 동일하지 않습니다. 프린트
		if (x == y) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않아요.");
		}
		
		int id1 = 1111;
		int id2 = 2222;
		// id 2개가 같은지 비교해보고
		// 같으면 로그인 성공 프린트
		// 다르면 로그인 실패 프린트
		if (id1 == id2) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패 ㅠㅠ");
		}
		
	}

}
