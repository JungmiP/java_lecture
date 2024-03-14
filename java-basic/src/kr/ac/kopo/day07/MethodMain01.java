package kr.ac.kopo.day07;

/*
 ********** 
 Hello
 ********** 
 Hi
 **********
 Good-bye
 **********
 * */



public class MethodMain01 {
	
	// 별을 출력하는 메소드 생성
	// 메소드는 수정을 용이하게 만들어줌.
	// static 메소드는 static 메소드만 호출 가능
	
	// 메소드는 호출자 / 피호출자 역할을 왔다갔다 함.
	// 매개변수 -> 호출자 메소드가 피호출자 메소드에게 연산에 필요한 값을 전달
	// 반환값 -> 피호출자 메소드가 수행한 연산의 결과를 호출자 메소드에게 전달
	static void printStar() {	
		System.out.println("**********");
	}
	
	// 매개변수가 1개인 메소드
	// 매개변수로 별의 개수를 전달하여 원하는 개수만큼 별 출력하기
	static void printStar(int cnt) {	
		while (cnt > 0) {
			System.out.print("*");
			cnt--;
		}
		System.out.println();
	}
	
	
	// 매개변수가 여러개인 메소드
	// 원하는 문자를 원하는 개수만큼 출력하기
	static void printStar(int cnt, char ch) {	
		while (cnt > 0) {
			System.out.print(ch);
			cnt--;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 별을 출력하는 메소드 호출
		printStar(10, '!');
		System.out.println("Hello");
		printStar(25, '*');
		System.out.println("Hi");
		printStar(3, '?');
		System.out.println("Good-bye");
		printStar(54, '#');
		printStar(54);

	}

}
