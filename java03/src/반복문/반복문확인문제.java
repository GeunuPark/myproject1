package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문확인문제 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		Font font = new Font("굴림", 1, 16);
		FlowLayout flow = new FlowLayout();
		
		
		
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.green);
		
		// 버튼에 글자넣기
		b1.setText("별 10개");
		b2.setText("커피 5개");
		b3.setText("커피*우유 3개");
		b4.setText("짱!");
		// 버튼에 폰트넣기
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		// 버튼에 색깔넣기
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		
		f.setLayout(flow);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
				
		// 버튼에 액션추가하기
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 액션을 어떻게 할지 세부내용 입력
				System.out.println("b1을 클릭했음");
				for (int i = 0; i < 10; i++) {
					System.out.println("*");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 액션을 어떻게 할지 세부내용 입력
				System.out.println("b2을 클릭했음");
				for (int i = 0; i < 5; i++) {
					System.out.println("커피*");
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 액션을 어떻게 할지 세부내용 입력
				System.out.println("b3을 클릭했음");
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 액션을 어떻게 할지 세부내용 입력
				System.out.println("b4을 클릭했음");
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + ": 짱!");
				}
			}
		});
		// 클릭액션 시, 처리하기
		
		
		f.setVisible(true);
		
		
		
		
		
	}

}
