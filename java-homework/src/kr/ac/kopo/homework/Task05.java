package kr.ac.kopo.homework;

import java.util.Scanner;

public class Task05 {
	
	public static void main(String[] args) {
		
		final double EXCHANGE_RATE = 1092.50;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달러를 입력하세요: ");
		int dollar = sc.nextInt();
		sc.close();
		
		double result = EXCHANGE_RATE * dollar;
		
		System.out.printf("원화 : %.2f원", result);
		
	}

}
