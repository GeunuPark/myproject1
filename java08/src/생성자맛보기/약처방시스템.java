package 생성자맛보기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class 약처방시스템 {

	static int m11 = 0;
	static int m22 = 0;
	static int m33 = 0;
	static String name11 = null;
	
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500,900);
		f.getContentPane().setBackground(Color.lightGray);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("굴림", Font.BOLD, 60);
		Font font2 = new Font("굴림", Font.BOLD, 30);
		
		JLabel title = new JLabel("약처방시스템");
		title.setForeground(Color.BLUE);
		title.setFont(font1);
		
		JLabel name = new JLabel("환자명 : ");
		name.setFont(font2);
		JTextField name1 = new JTextField(10);
		name1.setFont(font2);
		
		ImageIcon icon1 = new ImageIcon("아스피린.jpg");
		ImageIcon icon2 = new ImageIcon("우루사.jpg");
		ImageIcon icon3 = new ImageIcon("나프록센.jpg");
		ImageIcon icon4 = new ImageIcon("reset.png");
		
		JLabel m1p = new JLabel(icon1);
		JLabel m2p = new JLabel(icon2);
		JLabel m3p = new JLabel(icon3);
		JLabel m1 = new JLabel("아스피린");
		m1.setFont(font2);
		JLabel m2 = new JLabel("우 루 사 ");
		m2.setFont(font2);
		JLabel m3 = new JLabel("나프록센");
		m3.setFont(font2);
		

		JLabel final1 = new JLabel("처방내역");
		final1.setFont(font1);
		JTextArea mfinal1 = new JTextArea(10, 15);
		mfinal1.setFont(font2);
		mfinal1.setText("환자 이름 : " + "" + 
				"\n아스피린 " + m11 + 
				"개\n우루사 " + m22 + 
				"개\n나프록센 " + m33 + "개");
		
		JButton b1 = new JButton("처방하기");
		b1.setFont(font2);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m11 = m11 + 1;
				name11 = name1.getText();
				mfinal1.setText("환자 이름 : " + name11 + 
						"\n아스피린 " + m11 + 
						"개\n우루사 " + m22 + 
						"개\n나프록센 " + m33 + "개");
			}
		});
		
		JButton b2 = new JButton("처방하기");
		b2.setFont(font2);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m22 = m22 + 1;
				name11 = name1.getText();
				mfinal1.setText("환자 이름 : " + name11 + 
						"\n아스피린 " + m11 + 
						"개\n우루사 " + m22 + 
						"개\n나프록센 " + m33 + "개");
				
			}
		});
		
		
		JButton b3 = new JButton("처방하기");
		b3.setFont(font2);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m33 = m33 + 1;
				name11 = name1.getText();
				mfinal1.setText("환자 이름 : " + name11 + 
						"\n아스피린 " + m11 + 
						"개\n우루사 " + m22 + 
						"개\n나프록센 " + m33 + "개");
				
			}
		});
		
		JButton finish = new JButton("처방 완료");
		finish.setFont(font1);
		finish.setForeground(Color.RED);
		finish.setBackground(Color.white);
		finish.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, mfinal1);
				try {
					FileWriter file
					= new FileWriter(name11 + "처방내역.txt");
					file.write("환자 이름 : " + name11 + 
								"\n아스피린 " + m11 + 
								"개\n우루사 " + m22 + 
								"개\n나프록센 " + m33 + "개");
					file.close();
				} catch (Exception e2) {
					JOptionPane.showConfirmDialog(f, mfinal1);
				}
				f.setVisible(false);
			}
		});
		
		JButton reset = new JButton(icon4);
		reset.setFont(font1);
		reset.setForeground(Color.RED);
		reset.setBackground(Color.white);
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				name1.setText("");
				mfinal1.setText("");
			}
		});
		
		
		f.add(title, BorderLayout.NORTH);
		f.add(name); f.add(name1);
		f.add(m1p); f.add(m1); f.add(b1);
		f.add(m2p); f.add(m2); f.add(b2);
		f.add(m3p); f.add(m3); f.add(b3);
		f.add(final1);;
		f.add(mfinal1);;
		f.add(finish); f.add(reset);
		f.setVisible(true);
	}

}