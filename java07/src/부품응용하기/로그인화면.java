package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		// jframe, imageicon, imagelabel
		// idlabel, passwordlabel, idtext입력칸
		// loginbutton, resetbutton
		// font, flow
		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인하기");
		f.setSize(500, 800);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("돋움", 1, 30);
		
		JLabel top = new JLabel();
		JLabel id = new JLabel("아 이 디  :");
		JLabel pw = new JLabel("패스워드 :");
		id.setFont(font);
		pw.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("ok.jpg");
		ImageIcon icon3 = new ImageIcon("reset.jpg");
		top.setIcon(icon1);
		
		JTextField idtext = new JTextField(10);
		JTextField pwtext = new JTextField(10);
		idtext.setFont(font);
		pwtext.setFont(font);
		idtext.setHorizontalAlignment(JTextField.CENTER);
		pwtext.setHorizontalAlignment(JTextField.CENTER);
		idtext.setBackground(Color.cyan);
		pwtext.setBackground(Color.cyan);
		
		
		
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.GREEN);
		reset.setBackground(Color.GREEN);
		
		// 1. 버튼에 액션을 add하자
		// 2. 클릭했을 때, 어떤 부품이 처리르 담당할지 new만들기
		// 3. 클릭했을 때, 어떻게 처리할지 코딩하기.
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// idtext, pwtext에 입력한 값을 가지고 오기
				String id2 = idtext.getText();//"root"
				String pw2 = pwtext.getText();//"1234"
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					System.out.println("로그인 성공");
					//일지장쓰기 부품에서 open기능을 싱행하자.
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
					f.setVisible(false);
					
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
					System.out.println("로그인 실패");
					idtext.setText("");
					pwtext.setText("");
				}
			}
		});
		
		
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// reset를 눌렀을 때, idtext, pwtext에 공백을 넣자.
				idtext.setText("");
				pwtext.setText("");
			}
		});
		
		
		
		f.add(top);
		f.add(id); f.add(idtext);
		f.add(pw); f.add(pwtext);
		f.add(login); f.add(reset);
		
		
		f.setVisible(true);
	}

}
