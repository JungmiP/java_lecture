package kr.ac.kopo.day08;

public class MethodMain03 {

	public static void main(String[] args) {
		Method m = new Method();
		m.call();
		m.call(10);
		m.call("HI");
		m.call(12.36);
		m.call('A');  // 매개 변수도 묵시적 형변환을 함
	}

}
