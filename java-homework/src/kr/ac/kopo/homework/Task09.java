package kr.ac.kopo.homework;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책 권수 입력: ");
		int book = sc.nextInt();
		sc.close();
		
		if(book < 0) {
			System.out.print("잘못 입력했습니다");	// 음수를 입력한 경우
		} else if(book == 0) {
			System.out.print("보유하고 있는 책 없음"); // 0을 입력한 경우
		} else if(book == 1) {
			System.out.print(book + " book"); // 1을 입력한 경우
		} else {
			System.out.print(book + " books"); // 1 초과 숫자를 입력한 경우
		}

	}

}
