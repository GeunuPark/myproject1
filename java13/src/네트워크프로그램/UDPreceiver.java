package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPreceiver {

	public static void main(String[] args) throws Exception {
		// 1. 받는 소켓이 있어야한다.
		DatagramSocket socket = new DatagramSocket(9900);
		
		// 2. 패킷으로 보냈기 때문에, 빈 패킷을 만들어두면
		//    빈 패킷 안에는 빈 byte[] 이 있어야 한다.
		byte[] data = new byte[20];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		
		// 3. 소켓이 받아서 빈 패킷에 옮겨담는다.
		socket.receive(packet);
		
		// 4. byte[]에 있는 것을 String으로 바꾼다.
		System.out.println("받은 데이터는 : " + new String(data));
		
		socket.close();

	}

}
