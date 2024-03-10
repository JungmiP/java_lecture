package kr.ac.kopo.homework01;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("나눌 수를 입력하세요: ");
		int num2 = sc.nextInt();
		sc.close();
		
		int q = num1 / num2;
		int r = num1 % num2;
		
		System.out.println("몫: " + q);
		System.out.println("나머지: " + r);		

	}

}
