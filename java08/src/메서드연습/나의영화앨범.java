package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 나의영화앨범 {
	
	static int index = 0;
	
	public static void main(String[] args) {
		// 배열설정
		String[] title = { "아메리칸 스나이퍼", "론 서바이버", "미드웨이", "존윅3:파라벨룸", "제로다크서티" };
		String[] img = { "001.jpg", "002.jpg", "003.jpg", "004.jpg", "005.jpg" };
		double[] jumsu = { 8.71, 9.04, 8.79, 7.98, 8.25 };
		
		
		
		// 기본설정
		JFrame f = new JFrame();
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.GRAY);
		
		ImageIcon icon = new ImageIcon(img[0]);
		
		Font font = new Font("굴림", Font.BOLD, 50);
		
		
		
		// 라벨
		JLabel movietitle = new JLabel(title[0]);
		movietitle.setHorizontalAlignment(0); // 가운데정렬
		movietitle.setFont(font);
		movietitle.setForeground(Color.BLUE);
		f.add(movietitle, BorderLayout.NORTH);
		
		JLabel imglabel = new JLabel(icon);
		imglabel.setFont(font);
		f.add(imglabel, BorderLayout.CENTER);
		
		JLabel jumsulabel = new JLabel("평점 : " + jumsu[0]);
		jumsulabel.setHorizontalAlignment(0); // 가운데정렬
		jumsulabel.setFont(font);
		jumsulabel.setForeground(Color.yellow);
		f.add(jumsulabel, BorderLayout.SOUTH); // 위치설정
		
		
		
		// 버튼
		// 버튼에 액션처리하기!
		// 1.액션기능을 추가하자, 2.클릭할 때 처리할 부품만들자, 3. 어떻게 처리할지 코딩하자
		JButton leftbtn = new JButton("  <  ");
		leftbtn.setFont(font);
		leftbtn.setBackground(Color.LIGHT_GRAY);
		f.add(leftbtn, BorderLayout.WEST);
		leftbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					movietitle.setText(title[index - 1]);
					jumsulabel.setText("평점 : " + jumsu[index - 1]);
					ImageIcon icon1 = new ImageIcon(img[index - 1]);
					imglabel.setIcon(icon1);
					index = index - 1;
				} else {
					movietitle.setText(title[index = 4]);
					jumsulabel.setText("평점 : " + jumsu[index = 4]);
					ImageIcon icon1 = new ImageIcon(img[index = 4]);
					imglabel.setIcon(icon1);
					index = 4;
					
				}
			}
		});
		
		JButton rightbtn = new JButton("  >  ");
		rightbtn.setFont(font);
		rightbtn.setBackground(Color.LIGHT_GRAY);
		f.add(rightbtn, BorderLayout.EAST);
		rightbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (index < 4) {
					movietitle.setText(title[index + 1]);
					jumsulabel.setText("평점 : " + jumsu[index + 1]);
					ImageIcon icon2 = new ImageIcon(img[index + 1]);
					imglabel.setIcon(icon2);
					index = index + 1;
				} else {
					movietitle.setText(title[index = 0]);
					jumsulabel.setText("평점 : " + jumsu[index = 0]);
					ImageIcon icon1 = new ImageIcon(img[index = 0]);
					imglabel.setIcon(icon1);
					index = 0;
				}
			}
		});
		
		
		// 프로그램이 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}