package 연산자;

public class 비교연산자2 {

	public static void main(String[] args) {
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		System.out.println(id == id2);
		System.out.println(pw == pw2);
		
		//&& and 조건, 두가지 다 맞아야 맞다고 판단한다.
		System.out.println(id == id2 && pw == pw2);
		
		int mem1 = 111; // =는 대입연산, ==는 비교연산
		int mem2 = 222;
		
		// ||는 둘 중 하나만 맞아도 맞다고 판단한다.
		System.out.println(mem1 == 111 || mem2 == 223);
	}

}
