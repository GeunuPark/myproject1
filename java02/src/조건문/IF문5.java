package 조건문;

public class IF문5 {

	public static void main(String[] args) {
		String ssn = "1810121"; //주민번호 뒷자리
		
		// String 은 기본형데이터가 아니라 명령어를 사용해야 한다.
		if (ssn.equals("1810121")) {
			System.out.println("동일한 지역에서 태어나셨군요!");
		} else {
			System.out.println("동일한 지역에서 태어나지 않으셨군요!");
		}
		
		char gender = ssn.charAt(0); //첫번쨰 자리에 있는 문자 추출
		switch (gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		}
	
	}

}
