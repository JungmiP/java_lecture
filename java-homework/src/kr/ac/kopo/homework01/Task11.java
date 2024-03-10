package kr.ac.kopo.homework01;

import java.util.Random;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 4개 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		sc.close();
		
		
		int max1 = 0, max2 = 0;
		
//		3항 연산자 사용해서 줄이기
//		int max1 = num1 > num2 ? num1 : num2;
//		int max2 = num3 > num4 ? num3 : num4;
//		System.out.println("가장 큰 수: " + (max1 > max2 ? max1 : max2));
		
		// 1번 정수와 2번 정수를 비교하여 큰 수를 max1에 저장한다.
		if(num1 > num2) {
			max1 = num1;
		}else {
			max1 = num2;
		}
		
		// 3번 정수와 4번 정수를 비교하여 큰 수를 max2에 저장한다.
		if(num3 > num4) {
			max2 = num3;
		}else {
			max2 = num4;
		}
		
		// max1과 2를 비교한다.
		if (max1 > max2){
			System.out.println("가장 큰 수: " + max1);
		}else {
			System.out.println("가장 큰 수: " + max2);
		}
		
		
		// 0 ~99 사이의 임의의 정수 4개 추출
		Random r = new Random();
		int a = r.nextInt(100); // 100 미만의 숫자로 범위 설정		
		int b = r.nextInt(100); // 100 미만의 숫자로 범위 설정		
		int c = r.nextInt(100); // 100 미만의 숫자로 범위 설정		
		int d = r.nextInt(100); // 100 미만의 숫자로 범위 설정		
	
		int max = a > b ? a : b;
		if(c > max) {
			max = c;			
		}
		if(d > max) {
			max = d;
		}
		
		System.out.println("가장 큰 수: " + max);
	}

}

