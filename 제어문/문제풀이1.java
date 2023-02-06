package 제어문;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		// 오늘은 무슨 요일인가요? 월요일
		// 수업을 끝내고 무엇을 하실 예정인가요? 운동
		// 오늘 월요일의 수업을 끝낸 후 나는 운동을 할 예정입니다.
		
		// 입력
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String whattodo = JOptionPane.showInputDialog("수업을 끝내고 무엇을 하실 예정인가요?");
		
		// 처리
		String result = "오늘 " + day + "의 수업을 끝낸 후, 나는 " + whattodo + "을 할 예정 입니다.";
		
		//출력
		
		System.out.println(result);
		

	}

}
