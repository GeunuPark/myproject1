package 조건문;

public class IF문1 {

	public static void main(String[] args) {
		int x = 0;
		
		// 조건은 비교하는것만 쓰고, 결과는 무조건 T나 F
		// 비교연산자로 비교할 수 있는 것은 무조건 기본형 데이터만 가능
		if (x == 0) {
			System.out.println("나는 True일때 나오지!");			
		} else {
			System.out.println("나는 false일때 나오지!");
		}
		if (x == 1) {
			System.out.println("내가 과연 나올까?");
		}

	}

}
