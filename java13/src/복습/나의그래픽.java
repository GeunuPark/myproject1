package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 이벤트 처리");
		f.setSize(300, 200);
		
		JButton b = new JButton("나를 눌러주세요");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리할 내용을 코딩
				System.out.println("버튼이 클릭되었습니다.");
				
			}
		});
		
		f.add(b);
		
		f.setVisible(true);
	}

}
