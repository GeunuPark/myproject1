package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// 자바는 변수를 만들 때, 데이터의 타입을 미리 정한다.
		// 타입 쓰고 변수명을 적기 = *선언* , 변수를 생성한다.
		int num = 100; // 정수
		double num2 = 22.2; //실수 (실수는 정수 포함)
		char c = '한'; // 글자 *1글자* ==> ''
		boolean b = true; //true 나 false!!
		num = 200; //ok!!
		//b = 300; 안
		System.out.println("정수 값은 " + num);
		System.out.println("실수 값은 " + num2);
		System.out.println("글자 값은 " + c);
		System.out.println("논리 값은 " + b);
	}

}
