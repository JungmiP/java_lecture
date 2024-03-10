package kr.ac.kopo.homework02;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1, score = 0;
		char grade = ' ';
		
		while (i <= 5) {
			System.out.printf("%d\'s 성적: ", i);			
			score = Integer.parseInt(sc.nextLine());
			if (score > 100 || score < 0) { // 점수가 100 초과 or 미만인 경우
				grade = 'W';
			} else if (score >= 90) { // 90 ~ 100
				grade = 'A';
			} else if (score >= 80) { // 80 ~ 89
				grade = 'B';
			} else if (score >= 70) { // 70 ~ 79
				grade = 'C';
			} else if (score >= 60) { // 60 ~ 69
				grade = 'D';
			} else { // 60미만
				grade = 'F';
			}

			// 100초과의 숫자를 입력한 경우의 출력
			if (grade == 'W') {
				System.out.println("잘못 입력하셨습니다");
				// 나머지 학점이 계산 가능한 경우
			} else {
				System.out.printf("%d점의 학점은 %c입니다\n", score, grade);
			}
			System.out.println();

			i++;
		}
		
		sc.close();

	}

}
