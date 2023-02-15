package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5;
		int count2 = 4;
		
		//총 매출 구하기
		int morningprice = cal3.mul(price, count1); //오전매출
		int afterprice = cal3.mul(price, count2); //오후매출
		int totalprice = cal3.add(morningprice, afterprice); //하루매출
		int totalcount = cal3.add(count1, count2); //오전오후 손님수
		int result = cal3.minus(count1, count2); //오전손님-오후손님
		int personprice = cal3.div(totalprice, totalcount); //인당평균매출
		System.out.println("금일 오전 매출은, " + morningprice + "원 입니다.");
		System.out.println("금일 오후 매출은, " + afterprice + "원 입니다.");
		System.out.println("오전 오후 손님은, " + Math.abs(result) + "명 차이 입니다.");
		System.out.println("금일 총 매출은, " + totalprice + "원 입니다.");
		System.out.println("금일 인당 결제금액 평균액은 , " + personprice + "원 입니다.");
		
	}

}
