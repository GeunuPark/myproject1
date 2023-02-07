package 조건문;

import javax.swing.JOptionPane;

public class IF문7 {

	public static void main(String[] args) {
		//1. 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
		String num11 = JOptionPane.showInputDialog("Q1.첫번째 숫자를 입력하세요.");
		String num12 = JOptionPane.showInputDialog("Q1.두번째 숫자를 입력하세요.");
		String cal1 = JOptionPane.showInputDialog("Q1.사칙연산 입력하세요. (+, -, *, /)");
		
		double data11 = Double.parseDouble(num11);
		double data12 = Double.parseDouble(num12);
		double resultQ1 = 0;
		
		switch (cal1) {
		case "+":
			resultQ1 = data11 + data12;
			break;
		case "-":
			resultQ1 = data11 - data12;
			break;
		case "*":
			resultQ1 = data11 * data12;
			break;
		case "/":
			resultQ1 = data11 / data12;
			break;		
		}
		System.out.println("연산 결과는 " + resultQ1 + "입니다.");
		
		
		
		//2. 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
		String num21 = JOptionPane.showInputDialog("Q2.첫번째 숫자를 입력하세요.");
		String num22 = JOptionPane.showInputDialog("Q2.두번째 숫자를 입력하세요.");
		int data21 = Integer.parseInt(num21);
		int data22 = Integer.parseInt(num22);
		double resultQ2 = (double)data21/data22;
		
		System.out.printf("%,2f", resultQ2);
		
	}

}
