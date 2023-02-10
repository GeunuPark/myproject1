package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lesserafim = 0;
		int newjeans = 0;
		int itzy = 0;
		
		while (true) {
			System.out.print("인기투표 시스템 \n(1.르세라핌  2.뉴진스 3.ITZY 4.종료)\n번호를 입력하세요. ==>  ");
			int choose = sc.nextInt();
			if (choose == 1) {
				lesserafim = lesserafim + 1;
			} else if (choose == 2) {
				newjeans = newjeans + 1;
			} else if (choose == 3) {
				itzy = itzy + 1;
			} else if (choose == 4) {
				System.out.println("시스템을 종료합니다.");
				System.out.println("투표 결과는 르세라핌 " + lesserafim + "표, 뉴진스 " + newjeans + "표, ITZY " + itzy + "표 입니다.");
				break;
			} 
			
		}
		
		sc.close();
	}

}
