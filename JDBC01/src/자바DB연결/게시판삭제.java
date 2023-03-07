package 자바DB연결;

import java.util.Scanner;

public class 게시판삭제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" No를 입력하세요");

		int no = sc.nextInt();
		
		bbs게시판삭제 dao3bbs = new bbs게시판삭제();
		dao3bbs.delete(no);
	}

}
