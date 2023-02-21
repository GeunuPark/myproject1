package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 네이버주식정보시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 450);
		f.getContentPane().setBackground(Color.GREEN);
		f.setLayout(new FlowLayout());
		Font font = new Font("굴림", Font.BOLD, 40);
		
		JButton b1 = new JButton("삼성 전자");
		JButton b2 = new JButton("POSCO");
		JButton b3 = new JButton("NAVER");
		JButton b4 = new JButton("크롤링 시작");
		
		b1.setFont(font);
		b1.setBackground(Color.YELLOW);
		b2.setFont(font);
		b2.setBackground(Color.YELLOW);
		b3.setFont(font);
		b3.setBackground(Color.YELLOW);
		b4.setFont(font);
		b4.setBackground(Color.RED);
		b4.setForeground(Color.WHITE);
		
		JLabel label = new JLabel("CODE");
		label.setFont(font);
		
		JTextField text = new JTextField(7);
		text.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링2 c1 = new 네이버증권크롤링2();
				c1.naver("005930");				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링2 c1 = new 네이버증권크롤링2();
				c1.naver("005490");				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링2 c1 = new 네이버증권크롤링2();
				c1.naver("035420");				
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링2 c1 = new 네이버증권크롤링2();
				c1.naver(text.getText());				
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);
		
		f.setVisible(true);
	}

}
