package 자바DB연결;

import java.util.Scanner;

public class 게시판수정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Title과 수정할 No를 순서대로 입력하세요");

		String title = sc.next();
		int no = sc.nextInt();
		
		bbs게시판수정 dao2bbs = new bbs게시판수정();
		dao2bbs.update(title, no);
	}

}
