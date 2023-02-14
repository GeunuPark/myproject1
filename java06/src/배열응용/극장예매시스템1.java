package 배열응용;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(1000, 1000);

		// 배치해주는 부품 - flow 사용
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // 추가한 순서대로 f에 flow한다.

		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성.
		JButton[] btn1 = new JButton[100];

		Font font = new Font("굴림", Font.BOLD, 50);
		
		

		// 예약 여부를 저장하는 배열을 만들어줍시다.
		int[] seat = new int[101];
		// 각 자리에 저장된 값이 0이면 아직 예약 안되있음, 예약되면 1로 바꾸기
		
		
		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);
		
		
		// 반복해서 배열에 버튼 만들어서 넣자.
		for (int i = 0; i < btn1.length; i++) {
			btn1[i] = new JButton(i + 1 + "");
			btn1[i].setFont(font);
			// 반복해서 f에 add하자.
			f.add(btn1[i]);
			// 버튼에 액션기능 추가하기.
			// 1. 액션기능 추가
			// 2. 클릭했을 때 어떤 부품이 담당할지 부품생성
			// 3. 클릭했을 때 어떻게 처리할지 코딩하기
			btn1[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지?
					String text = e.getActionCommand();
					System.out.println(text + "번 좌석 예약완료");
					int no = Integer.parseInt(text); // "0" ==> 0
					// 좌석번호가 1로 저장되있는지 확인하고, 1이 아니면 예약가능!!
					if (seat[no] == 1) {
						result.setText("예약불가");
						result.setForeground(Color.blue);
					}else {
						seat[no] = 1;
						result.setText(text + "번 좌석 예약완료.");
					}
				}// addaction
			});

		} // for

		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
		
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열에 몇개가 1인지 더해줌.
				// 영화예매비 1장만 1만원, 결제금액 프린트
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count = count + 1;
					}
				}
				System.out.println("영화 예매비용은 총" + (10000 * count) + "원 입니다.");
				
				
			}//addaction
		});
		
		f.setVisible(true);
	}

}
