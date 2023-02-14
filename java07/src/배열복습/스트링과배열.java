package 배열복습;

public class 스트링과배열 {

	public static void main(String[] args) {
		// 스트링의 일부추출, 확인하는 메서드
		String s = "나는 프로그래머야";
		String s2 = "진짜!!";
		System.out.println(s + s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));
		char c = s.charAt(0); // 한문자만 추출
		System.out.println(s.endsWith("야")); // True, false
		boolean result = s.endsWith("야");
		String result2 = s.substring(3); // 인덱스 3부터 끝까지 추출하세요
		String result3 = s.substring(3, 8); // 3부터 7까지 출력
		boolean result4 = s.contains(s2); // s2의 boolean 추출
		int index = s.lastIndexOf("프"); //프의 인덱스값 추출 (마지막)
		System.out.println(s.toUpperCase()); // 대문자로 변환
		System.out.println(s.toLowerCase()); // 소문자로 변환
		System.out.println(s.length()); // 글자갯수
		s.replace("나", "너"); // 나를 너로 변환 비파괴함수
		System.out.println(s);
		
		
		

	}

}
