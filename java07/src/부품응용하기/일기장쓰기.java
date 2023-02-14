package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	// 멤버변수 = 지금은 안써도됨
	// 멤버메서드
	public void open() {
		// jframe 화면이 보이게 하자.
		System.out.println("화면을 오픈합니다.");
		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인하기");
		f.setSize(500, 800);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", 1, 30);

		JLabel day = new JLabel("오늘의 날짜 : ");
		JLabel title = new JLabel("오늘의 제목 : ");
		JLabel content = new JLabel("오늘의 내용 : ");
		day.setFont(font);
		title.setFont(font);
		content.setFont(font);

		JTextField daytext = new JTextField(10);
		JTextField titletext = new JTextField(10);
		daytext.setHorizontalAlignment(JTextField.CENTER);
		titletext.setHorizontalAlignment(JTextField.CENTER);
		daytext.setFont(font);
		titletext.setFont(font);

		JTextArea contenttext = new JTextArea(5, 10);
		contenttext.setFont(font);

		JButton btn = new JButton("파일을 일기에 저장");
		btn.setFont(font);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 날짜, 제목, 내용 입력한 것을 가지고와서 저장하기.
				String day2 = daytext.getText();
				String title2 = titletext.getText();
				String content2 = contenttext.getText();
				System.out.println("입력한 날짜는 " + day2);
				System.out.println("입력한 제목은 " + title2);
				System.out.println("입력한 내용은 " + content2);
				// 파일도 만들어주고, 자바프로그램과 file간의 연결통로 stream를 생성
				try {
					FileWriter file = new FileWriter(day2 + ".txt");
					file.write(day2 + "\n");
					file.write(title2 + "\n");
					file.write(content2 + "\n");
					file.close();
				} catch (IOException e1) {
					System.out.println("파일로 저장하는 중 문제발생");
				}
				// 외부에 있는 네트워크, 파일, cpu등을 자바에 연결할 때는 위험한 상황으로 인식한다.
				// 위험한 상황에서는 문제가 발생하면 어떻게 처리할지 반드시 작성
				
			}
		});
		

		f.add(day);
		f.add(daytext);
		f.add(title);
		f.add(titletext);
		f.add(content);
		f.add(contenttext);
		f.add(btn);

		f.setVisible(true);
	}

}