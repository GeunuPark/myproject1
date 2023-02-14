package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		// 배열에는 기본형만 들어가는 것이 아니고. 참조형도 가능하다.
		// 정수, 실수, 문자1, 논리 + Str, Jbutton, ...
		// 기본형은 변수에 값이 저장됨
		// 참조형은 무조건 주소가 저장됨

		JFrame f = new JFrame();
		f.setSize(800, 800);
		// 버튼 200개 들어갈 배열을 생성하자.
		// 랜덤을 이용하자.
		// 버튼을 랜덤으로 200개 생성해서 배열에 저장하자.
		JButton[] buttons = new JButton[8000];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i + "번");
		} // for

		// 위치를 지정해서 집어넣자.
		f.setLayout(null);// 위치를 자동으로 잡아주는 부품을 안씀.
		Random r1 = new Random();
		for (int i = 0; i < buttons.length; i++) {
			// null => 조립해서 넣을 부품의 주소가 없음.
			// 첫번째 버튼 | 위치 : 가로 500, 세로 500 | 크기 : 100 * 50
			int x = r1.nextInt(800);
			int y = r1.nextInt(700);

			buttons[i].setBounds(x, y, 100, 50);
			// buttons[1].setBounds(300, 300, 100, 50);
			// f에 올리자.
			f.add(buttons[i]);
		} // for

		// f.add(buttons[1]);

		f.setVisible(true);

	}

}
