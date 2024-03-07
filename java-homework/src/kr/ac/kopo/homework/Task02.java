package kr.ac.kopo.homework;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력: ");
		int inputSec = sc.nextInt();
		sc.close();
		
		int hour = inputSec / 3600;
		int tmp = inputSec % 3600;
		int min = tmp / 60;
		int sec = tmp % 60;
		
//		System.out.printf("%d초 : %d시간 %d분 %d초\n", inputSec, hour, min, sec);
		
		System.out.printf("%d초 : ", inputSec);
		if(hour != 0) {
			System.out.printf("%d시간 ", hour);
		}
		if(min != 0) {
			System.out.printf("%d분 ", min);
		}
		if(sec != 0) {
			System.out.printf("%d초", sec);
		}
		
	}

}
