package 제어문;

public class 문제풀이3 {

	public static void main(String[] args) {
		// double x = 33.3
		// double y = 22.2
		// x와 44.2 동일비교, x와 y의 동일비교, y가 55보다 큰지 비교

		double x = 33.3;
		double y = 22.2;
		System.out.println("x값은 " + x + "입니다.");
		System.out.println("ㅛ값은 " + y + "입니다.");
		System.out.println("x와 44.2는 동일합니다. =>  " + (x == 44.2));
		System.out.println("x와 y는 동일합니다. =>  " + (x == y));
		System.out.println("y는 55보다 큽니다. =>  " + (y > 55));
		
	}

}
