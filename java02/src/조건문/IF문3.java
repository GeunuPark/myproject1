package 조건문;

public class IF문3 {

	public static void main(String[] args) {
		// 조건이 여러개 일때
		int myNum = 99;
		
		// 점수가 80점 이상이면 최우수
		// 점수가 70점 이상이면 우수
		// 점수가 60점 이상이면 보통
		// 점수가 60점 미만이면 과락
		if (myNum >= 80) {
			System.out.println("최우수");
		} else if (myNum >= 70) {
			System.out.println("우수");
		} else if (myNum >= 60) {
			System.out.println("보통");
		} else {
			System.out.println("과락");
		}
		
		// if 문은 조건이 맞아서 실행하고 자동으로 끝나지만,
		// switch 문은 수동으로 break를 집어넣어야됨.
		
		int myTour = 10;
		// 올해 여행 횟수
		// 여행횟수가 10이면 "VVIP" 프린트
		// 여행횟수가 6이면 "VIP" 프린트
		// 여행횟수가 6미만이면 "Normal" 프린트
		switch (myTour) {
		case 10:
			System.out.println("VVIP");
			break; // case마다 break 꼭 필수!
		case 6:
			System.out.println("VIP");
			break;

		default:
			System.out.println("Normal");
			break;
		}
	}

}
