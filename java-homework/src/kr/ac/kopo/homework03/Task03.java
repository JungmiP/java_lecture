package kr.ac.kopo.homework03;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단: ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("종료단: ");
		int num2 = Integer.parseInt(sc.nextLine());
		sc.close();
		
		// 숫자 두개 비교하기
		int max = 0, min = 0;
		if (num1 > num2) {
			max = num1; 
			min = num2;
		} else {
			max = num2; 
			min = num1;			
		}
		
		// 구구단 출력하기
		for (int i = min; i <= max; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for(int j = 1; j <=9 ; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
		
	}

}
