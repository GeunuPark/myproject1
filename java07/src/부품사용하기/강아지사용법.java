package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용법 {

	public static void main(String[] args) {
		강아지 dog1 = new 강아지();
		dog1.weight = 20;
		dog1.age = 3;
		dog1.breed = "허스키";
		System.out.println("이 강아지의 무게는 " + dog1.weight + "kg 입니다.");
		System.out.println("이 강아지의 나이는 " + dog1.age + "살 입니다.");
		System.out.println("이 강아지의 품종은 " + dog1.breed + "종 입니다.");
		dog1.배변하다();

		강아지 dog2 = new 강아지();
		dog2.weight = 10;
		dog2.age = 5;
		dog2.breed = "말티즈";
		System.out.println("이 강아지의 무게는 " + dog1.weight + "kg 입니다.");
		System.out.println("이 강아지의 나이는 " + dog1.age + "살 입니다.");
		System.out.println("이 강아지의 품종은 " + dog1.breed + "종 입니다.");
		dog2.물어뜯다();

	}
}
