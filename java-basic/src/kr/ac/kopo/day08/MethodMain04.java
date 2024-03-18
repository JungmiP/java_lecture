package kr.ac.kopo.day08;

public class MethodMain04 {

	public static void main(String[] args) {
		
		// new 클래스() => 생성자가 호출됨
		GugudanUtil gu = new GugudanUtil();
		int dan = gu.inputDan();
		gu.print(dan);
		gu.print();
		int start = gu.inputDan("시작 ");
		int end = gu.inputDan("종료 ");
		
		gu.print(start, end);
	}

}
