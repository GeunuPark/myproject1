package 복습;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77;
		int me = 88;
		
		if (target == me) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}
		
		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답이다!!");
			break;
		case "신나":
			System.out.println("오답이다!!");
			break;
		default:
			System.out.println("그만해!!");
			break;
		}
		
		
	}

}
