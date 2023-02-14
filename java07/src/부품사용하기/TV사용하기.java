package 부품사용하기;

import 부품만들기.TV;

public class TV사용하기 {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.ch = 10;
		tv1.vol = 8;
		tv1.onoff = true;
		tv1.채널을바꾸다();
		System.out.println(tv1.ch + "번 채널에 볼륨은 " + tv1.vol + " " + tv1.onoff);
		

		TV tv2 = new TV();
		tv2.ch = 20;
		tv2.vol = 10;
		tv2.onoff = false;
		tv2.유튜브를보다();
		System.out.println(tv2.ch + "번 채널에 볼륨은 " + tv2.vol + " " + tv2.onoff);
		
	}

}
