package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		// 자바 연산시 주의점
		int x = 20;
		int y = 30;
		
		System.out.println(x / y);
		System.out.println(x % y);
		// 소수점까지 구하고싶을 때는 사용하지 말것
		// 정수와 정수의 계산 결과는 무조건 정수로 나온다.
		// 계산시 하나라도 실수가 있으면 결과는 실수로 나온다.
		
		int x2 = 20;
		double y2 = 30; // 30이여도 double로 정의하면 실수로 처리한다.
		
		System.out.println(x2 / y2);
		
		// 이미 정수로 저장된 값을 cpu가 가져다 실수 연산을 하고 싶은 경우,
		// cpu가 정수를 실수로 변환하게 할 수 있다.
		System.out.println(x / (double)y);
		

	}

}
