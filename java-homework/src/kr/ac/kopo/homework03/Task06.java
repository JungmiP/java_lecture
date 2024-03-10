package kr.ac.kopo.homework03;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("20 ~ 120 사이의 숫자를 입력: ");
		int num = Integer.parseInt(sc.nextLine());
		sc.close();

		System.out.printf("<1 ~ %d 사이의 369게임>\n", num);
		for (int i = 1; i <= num; i++) {
			// 자릿수 나누기
			int tenth = i / 10, first = i % 10;
			
			// 현재 숫자가 369도 아니고 10의 배수도 아닌 경우
			if (first != 0 && first % 3 != 0 && tenth % 3 != 0) {
				System.out.print(i);
			}else {				
				// 10의 자리의 수가 3,6,9에 해당하는 경우
				if (tenth == 3 || tenth == 6 || tenth == 9) {
					System.out.print("짝");
				}
				
				// 1의 자리 수가 3,6,9에 해당하는 경우
				if (first == 3 || first == 6 || first == 9) {
					System.out.print("짝");
				}
				
				// 10의 배수인 경우
				if (first == 0) {
					for (int j = 0; j < tenth; j++) {
						System.out.print("뽀");
					}
					System.out.print("숑");
				}
			}
			System.out.println();
		}

	}

}
