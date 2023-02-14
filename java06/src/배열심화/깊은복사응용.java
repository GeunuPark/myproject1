package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] 학기1성적 = { 44, 66, 22, 99, 100 };
		int[] 학기2성적 = 학기1성적.clone();
		System.out.println(학기1성적 == 학기2성적);
		학기2성적[0] = 22;
		학기2성적[2] = 88;

		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.println(학기1성적[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.println(학기2성적[i] + " ");
		}

		int counteq = 0;
		int count1b = 0;
		int count2b = 0;

		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				counteq = counteq + 1;
			} else if (학기1성적[i] > 학기2성적[i]) {
				count1b = count1b + 1;
			} else {
				count2b = count2b + 1;
			}
		} // for
		System.out.println("동일한 성적의 갯수는 " + counteq + "개");
		System.out.println("성적이 더 내려간 과목수는 " + count1b + "개");
		System.out.println("성적이 더 오른 과목수는 " + count2b + "개");

	}

}
