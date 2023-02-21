package 주식정보시스템;

import java.io.IOException;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링1 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println("1. 네트워크 연결 성공."  + con);
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			
			Elements codelist = doc.select(".code"); // <a class = "nav">
			System.out.println(codelist.size());
			Element codetag = codelist.get(0);
			String codeString = codetag.text();
			System.out.println("코드번호 : " + codeString);
			
			Elements textlist = doc.select(".sptxt.sp_txt9");
			System.out.println(textlist.size());
			Element texttag1 = textlist.get(0);
			String textString1 = texttag1.text();
			System.out.println("텍스트 : " + textString1);
		} catch (IOException e) {
			e.printStackTrace();
			
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
		//System.out.println(doc);

	}

}