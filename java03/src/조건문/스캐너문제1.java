package 조건문;

import java.util.Scanner;

public class 스캐너문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. ID와 PW를 입력하여 
		//    ID가 root이고, PW가 1234면 로그인 성공! 아니면 로그인 실패!
		System.out.print("ID를 입력하세요 =>");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 =>");
		String pw = sc.next();
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		
		
		
		// 2. 사과 구매 갯수, 사과 한 개당 가격을 입력하고
		//    딸기 구매 갯수, 딸기 한 개당 가격을 입력하여
		//    사과 구매 가격은 5500원 입니다.
		//    딸기 구매 가격은 4500원 입니다.
		//    전체 구매 가격은  10000원 입니다.
		System.out.print("사과를 몇개 사시나요?(5숫자로입력) =>");
		int apple1 = sc.nextInt();
		System.out.print("사과는 얼마인가요?(1100숫자로입력) =>");
		int apple2 = sc.nextInt();
		System.out.print("딸기를 몇개 사시나요?(5숫자로입력) =>");
		int berry1 = sc.nextInt();
		System.out.print("딸기는 얼마 인가요?(900숫자로입력) =>");
		int berry2 = sc.nextInt();
		
		
		int appletotal = apple1 * apple2;
		int berrytotal = berry1 * berry2;
		
		System.out.println("사과의 구매 가격은 총 " + appletotal + "원 입니다.");
		System.out.println("딸기의 구매 가격은 총 " + berrytotal + "원 입니다.");
		System.out.println("전체 구매 가격은 총" + (appletotal + berrytotal) + "원 입니다.");
		
		
		// 3. 시작값과 종료값을 입력한다
		//    시작값부터 종료값까지 모두 더해서 출력
		System.out.print("시작값을 입력하세요 =>");
		int first1 = sc.nextInt();
		System.out.println("종료값을 입력하세요 =>");
		int last1 = sc.nextInt();
		
		int result1 = 0;
		
		for (int i = first1; i <= last1; i++) {
			result1 = result1 + i;			
		}
		System.out.println("전체 값의 합은 " + result1 + "입니다.");
		
		 
		// 4. 시작값, 종료값, 점프값을 입력한다.
		//    시작값부터 종료값까지 점프값만큼 증가하면서 더한 후 출력
		//    더한 값이 100을 넘으면 프로그램을 종료
		System.out.print("시작값을 입력하세요. =>");
		int first2 = sc.nextInt();
		System.out.print("종료값을 입력하세요. =>");
		int last2 = sc.nextInt();
		System.out.print("점프값을 입력하세요. =>");
		int jump2 = sc.nextInt();
		
		int result2 = 0;
		
		for (int i = first2; i <= last2; i = i + jump2) {
			result2 = result2 + i;
			if (result2 >= 100) {
				System.exit(0);;
			}
		}
		
		
		System.out.println("전체 값의 합은 " + result2 + "입니다.");
		
		
		
		sc.close();

	}

}
