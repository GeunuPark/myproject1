package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.FlowView;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주써서 RAM에 언제든 사용가능하게 준비되어있음.
		// 부품명.기능()
		
		// 2. 쓸때마다 제공되는 틀을 이용해서 찍어내어
		// 저장해두고 사용하는 벽돌들
		// JFrame f = new JFrame();
		
		JFrame f = new JFrame();
		f.setSize(400, 300);
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요");
		JTextField text = new JTextField();
		JButton b = new JButton();
		b.setText("숫자 맞추기 게임");
		FlowLayout flow = new FlowLayout();
		Font font = new Font("굴림", 1, 20);
		Font font2 = new Font("굴림", 1, 30);
		
		
		f.setLayout(flow);
		f.add(l);
		f.add(b);
		
		f.setBackground(Color.green);
		
		l.setFont(font);
		l.setForeground(Color.red);
		
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		b.setFont(font2);
		
		text.setBackground(Color.cyan);
		text.setForeground(Color.BLUE);
		text.setFont(font2);
		
		
		
		
		
		
		//출력이라 맨 아래로
		f.setVisible(true);
		
	}

}
