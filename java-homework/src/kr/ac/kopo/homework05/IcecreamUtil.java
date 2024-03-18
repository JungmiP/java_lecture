package kr.ac.kopo.homework05;

import java.util.Scanner;

public class IcecreamUtil {

	// 아이스크림 개수 입력 받는 메소드
	static int inputIceNum(Scanner sc) {
//			Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇 개 구입할래?: ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	// 아이스크림 여러개 입력 메소드
	static Icecream[] buyIcecreams(int cnt, Scanner sc) {
		Icecream[] iceList = new Icecream[cnt];
		for (int i = 0; i < cnt; i++) {
			System.out.printf("** %d\'s 아이스크림 구매정보 입력 **\n", i + 1);
			Icecream ic = new Icecream();
			buyIcecream(sc, ic); 
			iceList[i] = ic;
		}
		return iceList;
	}

	// 아이스크림 한개 구입 정보 입력 메소드
	static void buyIcecream(Scanner sc, Icecream ic) {
//			Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 이름: ");
		ic.name = sc.nextLine();
		System.out.print("아이스크림 가격: ");
		ic.price = Integer.parseInt(sc.nextLine());
//			System.out.println();
//			sc.close();
	}

	// 아이스크림 여러개 출력 메소드
	static void printIcecream(Icecream[] icList) {

		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력>\n", icList.length);
		System.out.println("----------------------------------------------------");
		System.out.println("번호         아이스크림명        아이스크림가격");
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < icList.length; i++) {
			System.out.print(i + 1);
			printIcecream(icList[i]);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("총계: " + sumIcecreamPrice(icList) + "원");
	}
	
	// 아이스크림 하나 출력 메소드
	static void printIcecream(Icecream ic) {
		System.out.println( "           " + ic.name + "           " + ic.price + "원");
	}
	
	// 아이스크림 가격 총합 계산 메소드
	static int sumIcecreamPrice(Icecream[] icList) {
		int sum = 0;
		for(Icecream ic : icList) {
			sum += ic.price;
		}
		return sum;
	}

}
