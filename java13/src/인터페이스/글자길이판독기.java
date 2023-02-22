package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.xml.soap.Text;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("글자길이판독기");
		f.setSize(400, 500);
		f.getContentPane().setBackground(Color.GRAY);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font1 = new Font("궁서체", Font.BOLD, 40);
		Font font2 = new Font("궁서체", Font.BOLD, 30);
		Font font3 = new Font("궁서체", Font.BOLD, 20);
		
		
		JLabel label1 = new JLabel("문장을 넣으세요");
		label1.setFont(font1);
		label1.setForeground(Color.RED);
		
		
		JTextArea area1 = new JTextArea(10, 30);
		area1.setBackground(Color.BLACK);
		area1.setForeground(Color.WHITE);
		area1.setFont(font3);
		
		
		JButton button1 = new JButton("글자수 카운트");
		button1.setFont(font2);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String textlength1 = area1.getText();
				JOptionPane.showMessageDialog(f, "글자수는 " + textlength1.length());
				area1.setText("");
			}
		});
		
		JButton button2 = new JButton("배경색 바꾸기");
		button2.setFont(font2);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				area1.setBackground(Color.YELLOW);
				
			}
		});
		
		JButton button3 = new JButton("글자색 바꾸기");
		button3.setFont(font2);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				area1.setForeground(Color.RED);
				
			}
		});
		
		
		
		f.add(label1);
		f.add(area1);
		f.add(button1);
		f.add(button2);
		f.add(button3);
		
		
		f.setVisible(true);
	}

}
