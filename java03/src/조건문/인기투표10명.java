package 조건문;

import javax.swing.JOptionPane;

public class 인기투표10명 {

	public static void main(String[] args) {
		
		// 인기투표 해보기
		// 1.아이유   2.유재석   3.BTS
		
		int iuvote = 0;
		int yjsvote = 0;
		int btsvote = 0;
		int fail = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표! 1번아이유 2번유재석 3번BTS");
			if (data.equals("1")) {
				iuvote = iuvote + 1;
			} else if (data.equals("2")) {
				yjsvote = yjsvote + 1;
			} else if (data.equals("3")) {
				btsvote = btsvote + 1;
			} else {
				fail = fail + 1;
			}
		}
		
		System.out.println("인기투표 결과, 아이유는 " + iuvote + "표, 유재석은 "
		+ yjsvote + "표, BTS는 " + btsvote + "표, 무효표는 " + fail + "표 입니다.");
	}

}
