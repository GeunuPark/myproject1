package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in); // in 키보드(콘솔)
		// 자바와 콘솔간에 통로개척
		// 연결종료 = stream
		// stream은 무조건 직접 닫아줘야함

		
		
		System.out.println("요일을 입력 : 1.주중  2.주말");
		int data = sc.nextInt();
		if (data == 1) {
			System.out.println("열심히 달리자");
		} else {
			System.out.println("푹 쉬자");
		}
		
		System.out.print("주말에 뭐할까?");
		String data2 = sc.next();
		System.out.println("나는 주말에 " + data2 + "를 할거야");
		
		sc.close();
	}

}
