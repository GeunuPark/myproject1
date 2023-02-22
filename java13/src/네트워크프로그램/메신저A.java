package 네트워크프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저A extends JFrame{
	
	DatagramSocket socket;
	JTextArea list;
	JTextField input;
	
	public 메신저A() {
		try {
			socket = new DatagramSocket(7777);
		} catch (Exception e) {
			// TODO: handle exception
		}
		list = new JTextArea();
		input = new JTextField();
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		setTitle("메신저A");
		setSize(300, 300);
		list.setEnabled(false);
		
		Font font = new Font("궁서", Font.BOLD, 30);
		
		list.setFont(font);
		list.setBackground(Color.YELLOW);
		list.setForeground(Color.BLACK);
		
		input.setFont(font);
		input.setBackground(Color.CYAN);
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = input.getText();
				try {
					DatagramSocket socket = new DatagramSocket();
					// UDP용 패킷이 필요함. (데이터, 데이터크기, ip, port)
					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("121.151.198.70");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5555);
					// 소켓을 이용해서 패킷을 전송한다.
					list.append("나 => " + s + "\n");
					input.setText("");
					socket.send(packet);
					socket.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		
		
		
		setVisible(true);
	}
	
	// 받는 부분을 무한루프로 먼저 실행한다.
	public void process() {
		System.out.println("받을 준비중...");
		while (true) {
			try {
				// 1. 받는 소켓이 있어야한다.
				// 2. 패킷으로 보냈기 때문에, 빈 패킷을 만들어두면
				//    빈 패킷 안에는 빈 byte[] 이 있어야 한다.
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				// 3. 소켓이 받아서 빈 패킷에 옮겨담는다.
				socket.receive(packet);
				// 4. byte[]에 있는 것을 String으로 바꾼다.
				System.out.println("받은 데이터는 : " + new String(data));
				list.append("너 => " + new String(data) + "\n");
				socket.close();
			} catch (Exception e) {
				// TODO: handle exception
			}	
			
		}
	}
	
	public static void main(String[] args) {
		메신저A name = new 메신저A();
		name.process();
		
		
		
		
		
		
		
		
		
		
		
	}

}
