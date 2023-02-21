package 주식정보시스템;

import java.io.IOException;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링4 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005490");
		System.out.println("1. 네트워크 연결 성공."  + con);
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			
			Elements codelist = doc.select(".code"); // <a class = "nav">
			//System.out.println(codelist.size());
			Element codetag = codelist.get(0);
			String codeString = codetag.text();
			System.out.println("코드번호 : " + codeString);
			
			Elements titlelist = doc.select(".wrap_company h2 a");
			//System.out.println(titlelist.size());
			Element titletag = titlelist.get(0);
			String titleString = titletag.text();
			System.out.println("종목명 : " + titleString);
			
			Elements textlist1 = doc.select(".sptxt.sp_txt9");
			//System.out.println(textlist1.size());
			Element texttag1 = textlist1.get(0);
			String textString1 = texttag1.text();
			System.out.println("텍스트 : " + textString1);
			
			Elements textlist2 = doc.select(".sptxt.sp_txt10");
			//System.out.println(textlist2.size());
			Element texttag2 = textlist2.get(0);
			String textString2 = texttag2.text();
			System.out.println("텍스트 : " + textString2);
			
			Elements blindlist = doc.select("span.blind");
			//System.out.println(blindlist.size());
//			for (int i = 0; i < blindlist.size(); i++) {
//				System.out.println(i + " : " + blindlist.get(i));
//			}
			
			//System.out.println(blindlist.get(12));
			Element tag1 = blindlist.get(12);
			String tagString1 = tag1.text();
			System.out.println("현재가 : " + tagString1);
			
			Element tag2 = blindlist.get(20);
			String tagString2 = tag2.text();
			System.out.println("최저가 : " + tagString2);
			
			Element tag3 = blindlist.get(16);
			String tagString3 = tag3.text();
			System.out.println("최고가 : " + tagString3);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
		//System.out.println(doc);

	}

}