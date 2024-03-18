package kr.ac.kopo.day08;

public class Method {
	
	// 메소드 오버로딩
	// 같은 클래스 내 동일한 메소드 명으로 정의해도 메소드가 가지는 매개 변수의 타입이나 개수가 다르면 다른 메소드로 인식.
	void call() {
		System.out.println("call() 메소드 호출");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출");
	}
	
	void call(String s) {
		System.out.println("call(String) 메소드 호출");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출");
	}
}
