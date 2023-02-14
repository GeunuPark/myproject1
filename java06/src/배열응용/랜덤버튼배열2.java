package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임을 생성하자.
		JFrame f = new JFrame();

		// 2. 프레임을 설정하자.
		f.setSize(2000, 1000);
		f.setLayout(null);

		// 3. 버튼을 넣을 배열을 만들자. 500개
		JButton[] buttons = new JButton[100000];

		// 4. 버튼을 500개 만들어서 배열에 집어넣자.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "번 버튼");
		}

		// 심화 1. 버튼 색을 몇 가지 지정해서 임의로 설정, 힌트 Color 배열.
		Color[] colors = { Color.cyan, Color.red, Color.red, Color.green, Color.blue, Color.black };

		Random randomcolor = new Random();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBackground(colors[randomcolor.nextInt(colors.length)]);
		}

		// 심화 2. f에 배경색을 집어넣자.
		f.setBackground(Color.black);

		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정후, f에 붙여넣자.
		Random r = new Random();

		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(2000); // 버튼 무작위 위치 x값
			int y = r.nextInt(1000); // 버튼 무작위 위치 y값
			buttons[i].setBounds(x, y, 8, 8);
			f.add(buttons[i]);
		}

		f.setVisible(true);
	}

}
