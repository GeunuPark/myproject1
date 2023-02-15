package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 생성자맛보기2 {
	
	static int food1 = 0;
	static int food2 = 0;
	static int food3 = 0;
	static int food1price = 7000;
	static int food2price = 8000;
	static int food3price = 6000;
	static int food1totalprice = food1 * food1price;
	static int food2totalprice = food2 * food2price;
	static int food3totalprice = food3 * food3price;
	static int allprice = food1totalprice + food2totalprice + food3totalprice;
	
	public static void main(String[] args) {
		
		
		JFrame f = new JFrame();
		f.setSize(600, 550);
		f.getContentPane().setBackground(Color.BLACK);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("궁서", Font.BOLD, 30);
		
		
		ImageIcon icon1 = new ImageIcon("짬뽕.png");
		ImageIcon icon2 = new ImageIcon("우동.png");
		ImageIcon icon3 = new ImageIcon("짜장면.png");
		

		
			
		
		JLabel l1 = new JLabel("주문한 갯 수 : ");
		l1.setForeground(Color.yellow);
		JLabel img = new JLabel(icon1);
		JTextField l2 = new JTextField(10);
		JLabel foodcount = new JLabel
				("짬뽕" + food1 + "개, 우동" + food2 + "개, 짜장면" + food3  + "개");
		foodcount.setFont(font);
		foodcount.setForeground(Color.yellow);
		
		JLabel price = new JLabel("결제 금액 : ");
		price.setFont(font);
		price.setForeground(Color.RED);
		JTextField totalpriceField = new JTextField(5);
		totalpriceField.setFont(font);
		
		JButton b1 = new JButton("짬뽕");
		b1.setFont(font);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				food1 = food1 + 1;
				img.setIcon(icon1);
				int totalfood = food1 + food2 + food3;
				l2.setText(totalfood + "그릇");
				foodcount.setText
				("짬뽕" + food1 + "개, 우동" + food2 + "개, 짜장면" + food3  + "개");
				food1totalprice = food1 * food1price;
				food2totalprice = food2 * food2price;
				food3totalprice = food3 * food3price;
				allprice = food1totalprice + food2totalprice + food3totalprice;
				totalpriceField.setText(allprice + "원");
			}
		});
		JButton b2 = new JButton("우동");
		b2.setFont(font);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				food2 = food2 + 1;
				img.setIcon(icon2);
				int totalfood = food1 + food2 + food3;
				l2.setText(totalfood + "그릇");
				foodcount.setText
				("짬뽕" + food1 + "개, 우동" + food2 + "개, 짜장면" + food3  + "개");
				food1totalprice = food1 * food1price;
				food2totalprice = food2 * food2price;
				food3totalprice = food3 * food3price;
				allprice = food1totalprice + food2totalprice + food3totalprice;
				totalpriceField.setText(allprice + "원");
			}
		});
		JButton b3 = new JButton("짜장");
		b3.setFont(font);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				food3 = food3 + 1;
				img.setIcon(icon3);
				int totalfood = food1 + food2 + food3;
				l2.setText(totalfood + "그릇");
				foodcount.setText
				("짬뽕" + food1 + "개, 우동" + food2 + "개, 짜장면" + food3  + "개");
				food1totalprice = food1 * food1price;
				food2totalprice = food2 * food2price;
				food3totalprice = food3 * food3price;
				allprice = food1totalprice + food2totalprice + food3totalprice;
				totalpriceField.setText(allprice + "원");
			}
		});
				
		int totalfood = food1 + food2 + food3;
		l2.setText(totalfood + "그릇");
		totalpriceField.setText(allprice + "원");
		
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(img);
		f.add(foodcount);
		f.add(price);
		f.add(totalpriceField);
		
		f.setVisible(true);
	}
}
