package 배열복습;

public class 스트링과배열문제1 {

	public static void main(String[] args) {
		// 전화번호 입력 	011-254-1234
		String tel = "	011-254-1234	";
		
		// 1. 양쪽의 공백을 제거하세요
		System.out.println(tel.trim());
		String tel2 = tel.trim();
		
		// 2. -을 기준으로 분리하세요
		String[] tel3 = tel2.split("-");
		for (int i = 0; i < tel3.length; i++) {
			System.out.println(tel3[i]);
		}
		
		// 3. 첫번째 문자열이 011이면 sk, 019이면 lg, 나머지면 apple로 출력하세요.
		if (tel3[0].equals("011")) {
			System.out.println("통신사는 SK입니다.");
		} else if (tel3[1].equals("019")) {
			System.out.println("통신사는 LG입니다.");
		} else {
			System.out.println("통신사는 APPLE 입니다.");
		}
		
		// 4. 두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
		if (tel3[1].length() >= 4) {
			System.out.println("최신폰 입니다.");
		} else {
			System.out.println("올드폰 입니다.");
		}
		
		// 5. 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호 아니면 유효하지 않은 전화번호
		if ((tel3[0] + tel3[1] + tel3[2]).length() >= 10) {
			System.out.println("유효한 전화번호입니다.");
		} else {
			System.out.println("유효하지 않은 전화번호입니다.");
		}
		
		
		
	}

}
