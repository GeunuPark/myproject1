package 순차문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 기본 순차문  :  입력  => 처리  => 출력
		// 입력 - 부품사용, 언제나 바로 사용가능한 것들
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오 -1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오 -2");
		
		// 처리 - 글자 연결하기 ( +연산자 이용하기, 결합연산자 이용하기)
		// 데이터 하나라도 String이 있으면 결과는 무조건 String이다.
		int data11 = Integer.parseInt(data1); // String이였던 data1을 int로 변환하고,
		int data22 = Integer.parseInt(data2); // data11을 int로 정의한다! *****
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		int result = data11 + data22;
		double result2 = data33 + data44;
		
		
		// 처리 - 화면(콘솔)에 보이게 하기
		System.out.println(result);
		System.out.println(result2);
	}

}
