package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(500, 700);
		f.getBackground(Color.GRAY);
		
		
		Font font1 = new Font("굴림", Font.BOLD, 40);
		Font font2 = new Font("굴림", Font.BOLD, 60);
		
		
		JLabel label1 = new JLabel("회원가입화면");
		label1.setFont(font2);
		JLabel label2 = new JLabel("아이디");
		label2.setFont(font1);
		JLabel label3 = new JLabel("패스워드");
		label3.setFont(font1);
		JLabel label4 = new JLabel("이      름");
		label4.setFont(font1);
		JLabel label5 = new JLabel("전화번호");
		label5.setFont(font1);
		
		
		JTextField field1 = new JTextField(10);
		field1.setFont(font1);
		JTextField field2 = new JTextField(10);
		field2.setFont(font1);
		JTextField field3 = new JTextField(10);
		field3.setFont(font1);
		JTextField field4 = new JTextField(10);
		field4.setFont(font1);
		
		
		JButton button1 = new JButton("회원가입 처리");
		JButton button2 = new JButton("회원탈퇴 처리");
		
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		
		f.add(label1);
		f.add(label2);		f.add(field1);
		f.add(label3);		f.add(field2);
		f.add(label4);		f.add(field3);
		f.add(label5);		f.add(field4);
		f.add(button1);
		f.add(button2);
		
		f.setVisible(true);
	}

}
