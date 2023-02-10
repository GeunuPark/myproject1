package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
		// 10명에게 배부른사람?? 물어보기
		// 배부른 사람과 배 안부른사람 숫자세기
		int full = 0;
		int hungry = 0;
		int fail = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른사람? 부르면 1, 안부르면2 누르셈.");
			if (data.equals("1")) {
				full = full + 1;
			} else if (data.equals("2")) {
				hungry = hungry + 1;
			} else {
				fail = fail + 1;
			}
		}
		
		System.out.println("배부른 사람은 " + full + "명 입니다.");
		System.out.println("배가 안부른 사람은 " + hungry + "명 입니다.");
		System.out.println(fail + "명은 무효처리 되었습니다.");
		
		
		
		
		
		
		

	}

}
