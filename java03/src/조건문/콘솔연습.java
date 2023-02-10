package 조건문;

import java.util.Scanner;

public class 콘솔연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나의 이름은?");
			String name = sc.next();
		System.out.print("나의 나이는?");
			String age = sc.next();
		System.out.print("나의 취미는?");
			String hobby = sc.next();
		
		System.out.print("나의 이름은 " + name + "입니다.");
		System.out.print("나의 나이는 " + age + "입니다.");
		System.out.print("나의 취미는 " + hobby + "입니다.");
		
		
		
		
		
		
		sc.close();
	}

}
