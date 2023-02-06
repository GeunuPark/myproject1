package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자(사칙연산, 나누기에서 몫과 나머지 구하기)
		int x = 20;
		int y = 10;
		
		// ()를 쒸우지 않고 문자와 같이 사용하면 문자로 인식하여 연산이 안됨
		// 문자랑 같이 쓸때는 소괄호로 먼저 연산을 하게끔 하기!!
		System.out.println("더한 값은 " + (x + y));
		System.out.println("뺀 값은 " + (x - y));
		System.out.println("곱한 값은 " + (x * y));
		System.out.println("나누고 난 몫은 " + (x / y));
		System.out.println("나머지 값은 " + (x % y));
	}

}
