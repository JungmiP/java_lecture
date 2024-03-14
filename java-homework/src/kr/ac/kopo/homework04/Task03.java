package kr.ac.kopo.homework04;

import java.util.Scanner;

/*
 * 학생 5명의 성적을 입력받아 성적, 학점, 총점, 평균 출력
 * */

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5]; // 점수를 저장할 배열
		int sum = 0, erCnt = 0; // 총합과 에러 수를 저장할 변수
		
		// 성적을 입력받아 scores 배열에 저장 후 범위 내 숫자면 sum에 더해준다.
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "\'s 성적: ");
			scores[i] = Integer.parseInt(sc.nextLine());
			
			if(scores[i] >= 0 && scores[i] <= 100) {				
				sum += scores[i];
			}
		}
		sc.close();
		
		System.out.println("---------------------------");
		System.out.println("번호      성적      학점    ");
		System.out.println("---------------------------");
		// 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i+1) + "         ");
			
			// 에러 체크 후 카운트 세기
			if (scores[i] < 0 || scores[i] > 100) {
				System.out.println("ERROR!!!!");
				erCnt++;
				continue;
			// 90점 이상일 때
			} else if(scores[i] >= 90){
				System.out.print(scores[i] + "        ");
				System.out.print('A');
			// 80점 이상일 때
			} else if(scores[i] >= 80){
				System.out.print(scores[i] + "        ");
				System.out.print('B');
			// 70점 이상일 때
			} else if(scores[i] >= 70){
				System.out.print(scores[i] + "        ");
				System.out.print('C');
			// 60점 이상일 때
			} else if(scores[i] >= 60){
				System.out.print(scores[i] + "        ");
				System.out.print('D');
			// 60점 미만일 때
			} else {
				System.out.print(scores[i] + "        ");
				System.out.print('F');
			}
			
			System.out.println();
		}
		System.out.println("---------------------------");
		System.out.printf("5회 입력 중 [%d]회 에러 발생\n", erCnt); //에러 수 출력
		System.out.printf("총점: %d점\n", sum); // 합계 출력
		System.out.printf("평균: %.2f점\n", (double)sum / scores.length); // 평균 출력
	
	
		//
		int[] scores2 = new int[5]; // 점수를 저장할 배열
		int sum2 = 0, erCnt2 = 0; // 총합과 에러 수를 저장할 변수
		
		// 성적을 입력받아 scores 배열에 저장 후 범위 내 숫자면 sum에 더해준다.
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "\'s 성적: ");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
		sc.close();
		
		System.out.println("---------------------------");
		System.out.println("번호      성적      학점    ");
		System.out.println("---------------------------");
		// 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i+1) + "         ");
			char grade = 'F';

			if(scores2[i] >= 0 && scores2[i] <= 100) {				
				sum2 += scores[i];
				switch (scores2[i] / 10) {
				case 10: case 9:
					grade = 'A';
					break;
				case 8:
					grade = 'B';
					break;
				case 7:
					grade = 'C';
					break;
				case 6:
					grade = 'D';
					break;
				}
			}else {
				System.out.println("ERROR!!!!");
				erCnt2++;
			}
			System.out.print(scores2[i] + "        " + grade);		
			System.out.println();
		}
		System.out.println("---------------------------");
		System.out.printf("5회 입력 중 [%d]회 에러 발생\n", erCnt2); //에러 수 출력
		System.out.printf("총점: %d점\n", sum2); // 합계 출력
		System.out.printf("평균: %.2f점\n", (double)sum2 / scores2.length); // 평균 출력
	
	
	
	}

}
