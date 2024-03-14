package kr.ac.kopo.homework05;

import java.util.Scanner;

public class IcecreamMain {
	// 아이스크림 개수 입력 받는 메소드
	static int inputIceNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇 개 구입할래?: ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	
	// 아이스크림 입력 메소드
	static Icecream[] buyIcecream(int cnt) {
		Icecream[] iceList = new Icecream[cnt];
		for(int i = 0; i < cnt; i++) {
			System.out.printf("** %d\'s 아이스크림 구매정보 입력 **\n", i + 1);
			Icecream ic = new Icecream();
			ic.buyIcecream(); // Icecream 클래스 내 정의한 메소드 호출
			iceList[i] = ic;
		}
		return iceList;
	} 
	
	// 아이스크림 출력 메소드	
	static void printIcecream(Icecream[] ic) {
		int sum = 0;
		
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력>\n", ic.length);
		System.out.println("----------------------------------------------------");
		System.out.println("번호           아이스크림명          아이스크림가격");
		System.out.println("----------------------------------------------------");
		for(int i = 0; i < ic.length; i++) {
			System.out.println((i+1) + "           " + ic[i].name + "           " + ic[i].price + "원");
			sum += ic[i].price;
		}
		System.out.println("----------------------------------------------------");
		System.out.println("총계: " + sum + "원");
	}

	public static void main(String[] args) {
		
		int cnt = inputIceNum();
		
		// 아이스크림 입력 받는 메소드 호출
		Icecream[] icecreamList = buyIcecream(cnt);
		
		// 아이스크림 출력 메소드 호출
		printIcecream(icecreamList);
		
	}	

}
