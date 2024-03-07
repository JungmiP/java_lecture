package kr.ac.kopo.day03;

public class LoopMain02 {

	public static void main(String[] args) {
		System.out.println("======= start =======");
		
		// for문의 초기값 변수(cnt)는 지역 변수로 for문 종료와 동시에 삭제됨.
		for(int cnt = 1; cnt <= 5; ++cnt) {
			System.out.println("Hello");			
		}

		System.out.println("======== end ========");
	}

}
