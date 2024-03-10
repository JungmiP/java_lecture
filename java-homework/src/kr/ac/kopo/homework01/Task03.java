package kr.ac.kopo.homework01;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		final double PI = 3.141592;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력: ");
		int r = sc.nextInt();
		sc.close();
		
		double result = r * r * PI; 
		
		System.out.printf("반지름이 %d일때 원의 면적은 %f입니다.", r, result);
		
	}

}
