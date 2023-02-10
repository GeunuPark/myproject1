package 제어문문제;

import java.util.Random;
import java.util.Scanner;


public class 정답맞추기게임 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int target = random.nextInt();
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("당신이 생각한 정답은?");
			int data = sc.nextInt();
			if (data == target) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("오답입니다.");
				if (data > target) {
					System.out.println("너무 커요.");
				} else {
					System.out.println("너무 작아요.");
				}
			}
		}
		
		
		
		
		
		sc.close();
	}

}
