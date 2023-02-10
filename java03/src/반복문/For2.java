package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (;;) {// 무한루프 반복
			System.out.println("잘쓰지않음");
			String data = JOptionPane.showInputDialog("종료할까요? y를 입력");

			// == 연산자는 기본데이터만 가능
			if (data.equals("y")) {
				System.out.println("종료합니다.");
				break; // for문의 브레이크임

			}

		}

	}

}
