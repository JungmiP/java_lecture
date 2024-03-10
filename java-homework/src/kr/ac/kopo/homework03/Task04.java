package kr.ac.kopo.homework03;

public class Task04 {

	public static void main(String[] args) {
		int height = 0, cnt = 0; // 높이와 시간을 기록할 변수 선언
		
		while(height < 100) { // 100M에 도달하기 전까지 반복
			
			height += 5; // 5M 올랐음
			
			if(height < 50) { // 지금 높이가 50M 미만일 경우
				height -= 1;
			} else {			// 지금 높이가 50M 이상일 경우
				height -= 2;
			}
						
			// cnt 1 올린 후, 현재 상태 출력
			System.out.printf("[%d시간 후] 달팽이가 올라간 총 높이: %dM\n", ++cnt, height);
			
		}
		
	}

}
