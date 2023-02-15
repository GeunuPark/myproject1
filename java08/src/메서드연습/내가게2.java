package 메서드연습;

public class 내가게2 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		int result1 = cal2.add(15, 198);
		double result2 = cal2.add(56, 68.7);
		double result3 = cal2.add(53.5, 78.7);
		String result4 = cal2.add("박근우 ", 25);
		String result5 = cal2.add("박근우", " 25세");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
	}

}
