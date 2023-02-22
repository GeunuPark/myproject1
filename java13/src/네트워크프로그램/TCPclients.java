package 네트워크프로그램;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPclients {

	public static void main(String[] args) throws Exception {
		// 서버랑 클라이언트랑 양쪽에 전화기 역할을 하는 소켓이 필요하다.
		// 클라이언트에서 소켓을 만들어주면, 서버 소켓으로 승인 요청을 보냄.
		
		for (int i = 0; i < 10000; i++) {
			Socket socket = new Socket("localhost", 9900);
			System.out.println("클라이언트 요청 보냄.");
		}
		
		
		
	}

}
