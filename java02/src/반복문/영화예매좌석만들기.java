package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매좌석만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		for (int i = 0; i < 2000; i++) {
			JButton button1 = new JButton("●");
			button1.setBackground(Color.yellow);
			f.add(button1);
		}
		f.setVisible(true);
	}

}
