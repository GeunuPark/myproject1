package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 --> 처리 --> 출력
		// 두개의 숫자를 입력 받아서 처리하고 출력
		// 손으로 치는 모든 값은 String이다.
		// 램에 저장공간을 만드는 것 --> 선언
		// 선언할 때 램에 저장공간인 변수가 생성된다.
		
		// 입력
		String n1 = JOptionPane.showInputDialog("숫자1입력");
		String n2 = JOptionPane.showInputDialog("숫자2입력");
		
		// 처리
		// 정수로 바꾸고 싶으면 부품처리하기
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		// 출력
		System.out.println((double)n11 / n22);

	}

}
