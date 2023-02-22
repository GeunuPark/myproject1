package 인터페이스;

public class AppleComputer implements Computer{
	@Override
	public void 코딩하다() {
		System.out.println("파이참 IDE로 파이썬을 코딩하다.");
		
	}
	@Override
	public void 인터넷하다() {
		System.out.println("엣지로 인터넷을 이용화다.");
		
	}
	@Override
	public void 유튜브하다() {
		System.out.println("크롬으로 유튜브를 시청하다.");
		
	}
}
