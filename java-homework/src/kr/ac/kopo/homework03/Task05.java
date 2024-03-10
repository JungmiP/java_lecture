package kr.ac.kopo.homework03;

import java.util.Random;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(99) + 1; // 1~100 까지 랜덤 숫자 정하기
		
		Scanner sc = new Scanner(System.in);
		
		int min = 1, max = 100;
		for(int i = 5; i >= 0; i--) { // 맞히기 전까지 6번 반복
			System.out.printf("%d - %d: ", min, max); // 범위 알려주고 입력받기
			int tmp = Integer.parseInt(sc.nextLine());
			
			if(tmp <= min || tmp >= max) {				// 범위 밖의 숫자를 입력한 경우
				System.out.println("잘못 입력하셨습니다.");
			}else if(num < tmp) {						// 정답보다 큰 수를 입력한 경우
				System.out.printf("%d보다 작은 수 입니다 \n", tmp); 
				max = tmp;
			}else if(num > tmp) {						// 정답보다 작은 수를 입력한 경우
				System.out.printf("%d보다 큰 수 입니다 \n", tmp); 
				min = tmp;
			}else { 									// 정답일 경우
				System.out.println("축하합니다. 정답입니다!!!");
				break;
			}
			System.out.printf("기회는 총 %d번 남았습니다\n", i);
			
			if (i == 0) {
			System.out.println("아쉽습니다. 기회를 다 소진하셨습니다.");
			System.out.printf("정답은 [%d]입니다\n", num);
			}
		}
		sc.close();
	}

}
