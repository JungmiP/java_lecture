package kr.ac.kopo.day03;

public class LoopMain01 {

	public static void main(String[] args) {
		System.out.println("======= start =======");
		
		int cnt = 1; // main 메소드의 지역 변수로 프로그램 종료할 때 삭제됨.
		while(cnt <= 5) {
			System.out.println("Hello");
			++cnt;
		}
		
		System.out.println("======== end ========");

	}

}
