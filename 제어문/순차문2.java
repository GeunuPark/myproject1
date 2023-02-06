package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 입력 : 당신이 좋아하는 운동은? 헬스
		// 당신이 좋아하는 요일은? 금요일
		// 입력하기
		String exercise = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String day = JOptionPane.showInputDialog("당신이 좋아하는 요일은?");
		// 처리
		String result = "좋아하는 운동은 " + exercise + "이고, 요일은 " + day + " 입니다.";
		// 출력
		System.out.println(result);
		
	}

}
