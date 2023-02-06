package 제어문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 프로그램 순서 짜기
		// 1. 입력 : 데이터를 가지고 오기
		// 2. 처리 : 가지고온 데이터로 특정 작업을 수행한다
		// 3. 출력 : 처리한 내용 보여주기
		
		//입력
		String name = JOptionPane.showInputDialog("어머님이 누구시니");
		
		//처리
		String result = "나의 이름은 " + name + "입니다.";
		
		//출력
		System.out.println(result);
		
	}

}
