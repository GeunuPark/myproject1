package 순차문;

import javax.swing.JOptionPane;

public class 순차문확인1 {

	public static void main(String[] args) {
		// BMI 계산기 ( 체질량 = 체중kg / 키m / 키m)
		// 입력
		String weight = JOptionPane.showInputDialog("체중을 입력하세요. (단위 : Kg)");
		String height = JOptionPane.showInputDialog("키를 입력하세요. (단위 : M)");
		
		// 처리
		double kg = Double.parseDouble(weight);
		double m = Double.parseDouble(height);
		double bmi_result = kg / (m * m);
		
		// 출력
		System.out.println("당신의 BMI지수는 " + bmi_result + "입니다.");
		JOptionPane.showMessageDialog(null, "당신의 BMI지수는 " + bmi_result + "입니다.");
	}

}
