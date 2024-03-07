
package kr.ac.kopo.day02;

import java.util.Scanner;

public class OperationMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int firstNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수: ");
		int secondNum = sc.nextInt();
		sc.nextLine();
		
		//배수 여부 판단

		boolean result = secondNum > 0 && firstNum % secondNum == 0;
		
		System.out.printf("%d는 %d의 배수 여부 판단 : %b\n", firstNum, secondNum, result);
		
		sc.close();
	}
}
