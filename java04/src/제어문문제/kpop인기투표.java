package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class kpop인기투표 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 800);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("궁서", 1, 50);
		Font font2 = new Font("돋움", 1, 30);
		
		JTextField text = new JTextField();
		
		JLabel t1 = new JLabel();
		JLabel l1= new JLabel();
		JLabel l2= new JLabel();
		JLabel l3= new JLabel();
		JLabel l4= new JLabel();
		JLabel l5= new JLabel();
		JLabel l6= new JLabel();
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		ImageIcon i1 = new ImageIcon("안티프레자일.jpg");
		Image img1 = i1.getImage();
		Image chg1 = img1.getScaledInstance(150, 150, Image.SCALE_AREA_AVERAGING);
		ImageIcon icon1 = new ImageIcon(chg1);
		
		ImageIcon i2 = new ImageIcon("하입보이.jpg");
		Image img2 = i2.getImage();
		Image chg2 = img2.getScaledInstance(150, 150, Image.SCALE_AREA_AVERAGING);
		ImageIcon icon2 = new ImageIcon(chg2);
		
		ImageIcon i3 = new ImageIcon("cheshire.jpg");
		Image img3 = i3.getImage();
		Image chg3 = img3.getScaledInstance(150, 150, Image.SCALE_AREA_AVERAGING);
		ImageIcon icon3 = new ImageIcon(chg3);
		
		
		
		
		t1.setText("K-POP 인기투표");
		t1.setFont(font1);
		
		l1.setText("1. 르세라핌");
		l1.setFont(font2);
		
		l4.setFont(font2);
		
		l2.setText("2. 뉴진스");
		l2.setFont(font2);
		l5.setFont(font2);
		
		l3.setText("3. ITZY");
		l3.setFont(font2);
		l6.setFont(font2);
		
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		
		

		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int lesserafim = 0;
				lesserafim = lesserafim + 1;
				l4.setText(lesserafim + "표");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int newjeans = 0;
				newjeans = newjeans + 1;
				l5.setText(newjeans + "표");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int itzy = 0;
				itzy = itzy + 1;
				l6.setText(itzy + "표");
				
			}
		});
		
		
		
		
		
		
		f.add(t1);
		f.add(b1);
		f.add(l1);
		f.add(l4);
		f.add(b2);
		f.add(l2);
		f.add(l5);
		f.add(b3);
		f.add(l3);
		f.add(l6);
		
		
		f.setVisible(true);
	}

}
