package kr.ac.kopo.homework03;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// 숫자 입력 받기
		System.out.print(" 2- 9: ");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		
		// 입력받은 숫자의 구구단 출력하기
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}

	}
}
