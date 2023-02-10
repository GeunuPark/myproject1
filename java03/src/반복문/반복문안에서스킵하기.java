package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터중에 짝수만 출력하기
		for (int i = 1; i <= 10; i++) {
			if (i%2 != 0) { // 2로 나눠서 나머지가 0이면 짝수겠죠?
				continue;   // 해당값만 출력중지 (따라서 짝수를 출력하려면
						    // 홀수만 출력을 하지 않게 설정하므로 if를 홀수값으로 설정한다.
			}
			System.out.println(i);
		}
		
	}

}
