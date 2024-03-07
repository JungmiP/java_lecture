package kr.ac.kopo.day03;

import java.util.Random;

/*
 * 1 입력시 -> "ONE"
 * 2 입력시 -> "TWO"
 * 3 입력시 -> "THREE"
 * 그 외 입력시 -> "ERROR"
 * */
public class SwitchMain01 {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(5) + 1; // (0 ~ 4) + 1 => 1 ~ 5
//		int num = 3; // (0 ~ 4) + 1 => 1 ~ 5		

		switch (num) {
		case 1:
			System.out.println("ONE");
			break;

		case 2:
			System.out.println("TWO");
			break;

		case 3:
			System.out.println("THREE");
			break;
//		default를 먼저 작성해도 default는 case가 다 수행된 후 작동.
		default:
			System.out.println("ERROR");
			break;
		}
	}

}
