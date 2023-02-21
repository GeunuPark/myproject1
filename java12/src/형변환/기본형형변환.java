package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 100; // 1바이트, -128 ~ +127 까지
		int i1 = 200; // 4바이트, -21억 ~ +21억 까지
		
		i1 = b1; // 작 --> 큰 : 자동형변환
		
		b1 = (byte)i1; // 큰 --> 작 : 강제형변환
		
		// double(큰, 10.0) <-- int(작, 10)
		double d1 = i1;
		i1 = (int)d1;
		
		int i2 = 2000;
		byte b2 = (byte)i2;
		
		
		
	}

}
