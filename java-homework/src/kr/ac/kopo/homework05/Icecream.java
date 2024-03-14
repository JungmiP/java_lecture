package kr.ac.kopo.homework05;

import java.util.Scanner;

public class Icecream {
	String name;
	int price;
	
	// 아이스크림 구입 정보 입력 메소드
	void buyIcecream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 이름: ");
		name = sc.nextLine();
		System.out.print("아이스크림 가격: ");
		price = Integer.parseInt(sc.nextLine());
//		System.out.println();
//		sc.close();
	}
	
}
