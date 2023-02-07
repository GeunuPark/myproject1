package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.management.modelmbean.RequiredModelMBean;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기 {

	public static void main(String[] args) {
		// 자주 사용하지 않는 부품 한번 만들어보기
		// 틀이 있기 때문에 찍어내면 된다.
		// new = 틀을 가지고 찍어낼때 사용하는 명령어
		// new JFrame = jframe이라는 도구를 가져와서 찍어낸다.
		// f라는 변수를 만들어서 jframe이 저장되어야 한다.
		JFrame f = new JFrame();
		f.setSize(500, 300);
		
		// JFrame과 같이 JButton을 가져온것
		// b1에 text를 set 셋팅한다.
		
		// 물흐르듯이 순서대로 배치해 주는 부품
		// FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// 버튼기능 생성하기
		JButton b1 = new JButton();
		b1.setText("나는 버튼 1");
		
		JButton b2 = new JButton();
		b2.setText("나는 버튼2");
		
		// 글자 출력하기
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		
		//글자 넣는 텍스트 만들기
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		//글자폰트 만들기
		Font font = new Font("굴림", 1, 24);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		// 배경색
		b1.setBackground(Color.red);
		b2.setBackground(Color.red);
		// 글자색
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		
		// 이미지첨부하기 (imageicon을 new로가져오기)
		ImageIcon icon = new ImageIcon("감자튀김.jpg");
		ImageIcon icon2 = new ImageIcon("라코스테 후드티.png");
		// 적용하기
		b1.setIcon(icon);
		b2.setIcon(icon2);
		
		
		
		// F(위에 Jframe 정의했던거)에 b1(JButton)을 집어넣는다.
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		//출력
		// F(JFrame)을 눈에 보이게 만들어준다.
		f.setVisible(true);
	}

}
