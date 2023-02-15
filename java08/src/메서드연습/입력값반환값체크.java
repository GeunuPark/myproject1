package 메서드연습;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력값반환값체크 {
	public static void main(String[] args) {
		Random r = new Random();
		//int date1 = r.nextInt(5); // 0~4, 3
		String data2 = JOptionPane.showInputDialog("이름입력"); // str으로 반환값 입력
		JOptionPane.showMessageDialog(null, data2); //void
		
	}
}
