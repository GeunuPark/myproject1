package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {

	public static void main(String[] args) {
		// 인덱스, 순서, 직접접근 => ArrayList
		ArrayList list = new ArrayList();
		list.add("홍길동"); // String -> Object (자동형변환)
		list.add(100); // Integer -> Object
		list.add(11.22); // Double -> Object
		list.add(new JButton()); // JButton -> Object
		
		
		String nameString = (String)list.get(0);
		// 직접접근, 강제형변환, Object -> String
		
		int age = (Integer)list.get(1);
		// Object ->Integer -> Int로 형변환
	}

}
