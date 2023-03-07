package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class bbs게시판삭제 {

	public void delete(int no) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 연결 부품 설정완료.");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("오라클 연결 성공");
			
			String sql = "delete from hr.BBS where NO = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("SQL 부품생성완료");
			
			ps.executeUpdate();
			System.out.println("SQL 부품전송완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
