package kr.ac.kopo.homework05;

import java.util.Scanner;

public class IcecreamMain {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = IcecreamUtil.inputIceNum(sc);
		
		// 아이스크림 입력 받는 메소드 호출
		Icecream[] icecreamList = IcecreamUtil.buyIcecreams(cnt, sc);
		
		// 아이스크림 출력 메소드 호출
		IcecreamUtil.printIcecream(icecreamList);
		sc.close();
	}	

}
