package 조건문;

import java.util.Scanner;

public class 기본데이터확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 ==>");
		String name = sc.next(); // 한단어
		System.out.print("나이를 입력하세요 ==>");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 ==>");
		double height = sc.nextDouble();
		System.out.print("저녁을 드셨나요?(true or false) ==>");
		boolean meal = sc.nextBoolean();
		System.out.print("올해의 목표는? ==>");
		sc.nextLine();
		String goal = sc.nextLine(); 
		
		System.out.println("======================");
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println("저는 내년에 " + (age + 1) + "살 입니다.");
		System.out.println("제 키는 " + height + "입니다.");
		if (meal ) {
			System.out.println("배가 부르시겠군요");
		} else {
			System.out.println("배가 고프시겠군요");
		}
		System.out.println("올해에는 꼭 " + goal + " 성공하세요!");
		
		
		sc.close();
	}

}
