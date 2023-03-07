package JAVADBCONNECTION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB연결테스트 {

	public static void main(String[] args) {
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 완료");
			// 2. 오라클 11g에 연결하기 (java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공");
			
			String sql = "insert into hr.MEMBER values('win2', 'win', 'win', 'win')";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("SQL문 부품으로 만들기");
			
			ps.executeUpdate();
			System.out.println("SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
