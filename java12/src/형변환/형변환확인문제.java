package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		// 1. 전체목록을 프린트
		System.out.println(me);
		// 2. 돈 1000을 꺼내서 2000을 더해서 프린트
		int money = (Integer)me.get(0);
		System.out.println(money + 2000);
		// 3. 키 189.1을 꺼내서 10을 더해서 프린트
		double height = (double)me.get(1);
		System.out.println(height + 10);
		//4. 아침여부 false를 꺼내서 아침을 먹었으면 배불러요, 아니면 배고파요.
		boolean meal = (boolean)me.get(2);
		if (meal == false) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		// 5. 성별을 꺼내서 남자이면 주민번호는 1,3이에요
		//    아니면 2, 4이에요 출력
		char sex = (char)me.get(3);
		if (sex == '남') {
			System.out.println("주민번호는 1, 3이에요");
		} else {
			System.out.println("주민번호는 2, 4이에요");
		}
		
	}

}
