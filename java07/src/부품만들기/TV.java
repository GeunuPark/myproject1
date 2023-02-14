package 부품만들기;

public class TV {
	
	// 멤버변수, 선언이 클래스 바로 아래에 되어있기 떄문에
	// 클래스 전체 영역에서 이 변수를 사용할 수 있음.
	// 전역변수(global변수, 글로벌 변수)
	// 멤버변수는 자동초기화, 전역변수
	
	public int ch; //0
	public int vol; //0
	public boolean onoff; //false
	
	public void 채널을바꾸다() {
		int change = 1; //채널을바꾸다 이 안에서만 사용하는 지역변수.		
		System.out.println(ch + "번 채널에서 " + change + "번으로 바꿉니다.");
	}					//local변수, 지역변수, 자동초기화x
	
	
	public void 유튜브를보다() {//메서드를 만들다. => 메서드기능을 정의한다.
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
	
}
