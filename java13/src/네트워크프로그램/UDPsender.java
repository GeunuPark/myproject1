package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPsender {

	public static void main(String[] args) throws Exception {
		// UDP용 소켓이 필요함.
		DatagramSocket socket = new DatagramSocket();
		
		// UDP용 패킷이 필요함. (데이터, 데이터크기, ip, port)
		String s = "I am a java program.";
		byte[] data = s.getBytes();
		InetAddress ip = InetAddress.getByName("121.151.198.70");
		DatagramPacket packet = new DatagramPacket
				(data, data.length, ip, 9900);
		// 소켓을 이용해서 패킷을 전송한다.
		socket.send(packet);
		socket.close();
		
		
		
		
		

	}

}
