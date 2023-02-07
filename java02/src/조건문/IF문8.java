package 조건문;

import javax.swing.JOptionPane;

public class IF문8 {

	public static void main(String[] args) {
		// 1~2번 문제 equals 사용하기
		
		
		// 1. 암호를 대시오 입력 ==> pass 입력
		// 암호가 맞으면 "들어오세요" 프린트
		// 암호가 틀리면 "나가세요" 프린트
		String password = JOptionPane.showInputDialog("암호를 대시오!");
		if (password.equals("pass")) {
			System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}
				
		
		// 2. 당신이 먹고싶은 저녁 메뉴는 (짜장면, 라면, 회)에서 선택
		// 짜장면이면 "중국집으로 가세요" 프린트
		// 라면이면 "분식직으로 가세요" 프린트
		// 회이면 "횟집으로 가세요" 프린트
		// 3개중 없으면 "그냥 먹지마세요" 프린트
		String menu = JOptionPane.showInputDialog("먹고싶은 저녁메뉴가 뭔가요?");
		switch (menu) {
		case "짜장면":
			System.out.println("중국집으로 가세요~");
			break;
		case "라면":
			System.out.println("분식집으로 가세요~");
			break;
		case "회":
			System.out.println("횟집으로 가세요~");
			break;
		default:
			System.out.println("그냥 먹지마^^");
			break;
		}		
		
		
		// 3. JOptionPane을 사용
		// 두개의 정수를 입력 받으세요. 누가 더 큰지 출력
		String num1 = JOptionPane.showInputDialog("정수를 입력하세요. (1차)");
		String num2 = JOptionPane.showInputDialog("정수를 입력하세요. (2차)");
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		if (num11 > num22) {
			System.out.println(num11 + "이(가) 더 큰 숫자 입니다.");
		} else if (num11 < num22) {
			System.out.println(num22 + "이(가) 더 큰 숫자 입니다.");
		} else {
			System.out.println("같은 숫자입니다.");
		}
			
		
		// 4. 사원번호 ==> String no = "A100EZ";
		// 맨 앞에 있는 글자를 추출 no.charAt(0)을 이용
		// A면 기획부 프린트, B면 총무부 프린트, C이면 개발부 프린트, 아니면 해당부서없음 프린트
		String no = JOptionPane.showInputDialog("사원번호를 입력하세요.");
		char division = no.charAt(0);
		switch (division) {
		case 'A':
			System.out.println("소속 : 기획부");
			break;
		case 'B':
			System.out.println("소속 : 총무부");
			break;
		case 'C':
			System.out.println("소속 : 개발부");
			break;
		default:
			System.out.println("사원번호를 다시 입력 해주세요.");
			break;
		}
		
		
		
	}

}
