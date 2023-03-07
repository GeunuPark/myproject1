package JAVADBCONNECTION;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

import org.omg.CORBA.BAD_CONTEXT;

public class 반환값연습 {
	// 부품은 기능을 처리하기 위해서 만든 부품
	// 휴대폰의 기능 ! => 함수
	
	public void add2() {
		System.out.println("더하기 기능 수행하기");
	}
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public double add(double x, int y) {
		return x + y;
	}
	
	public String add(String x, int y) {
		return x + y;
	}
	
	public Date getDate() {
		Date date = new Date();
		return date;
	}
	
	public int getRandom2() {
		Random r = new Random();
		return r.nextInt();
	}
	
	public int getHour() {
		Date date = new Date();
		return date.getHours();
	}
	
	public ArrayList getlist() {
		ArrayList list = new ArrayList();
		list.add("감자");
		list.add("고구마");
		return list;
	}
	
	public void getset() {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("펜");
		return bag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
