package kr.ac.kopo.homework;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int first = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수: ");
		int second = sc.nextInt();
		sc.nextLine();
		
		System.out.print("세번째 정수: ");
		int third = sc.nextInt();
		sc.close();
		
		int tmp = 0;
		
		// 두번째 숫자와 세번째 숫자를 비교하여 세번째 숫자가 크면 자리를 바꾼다
		if(third > second){
			tmp = third;
			third = second;
			second = tmp;
		}
		
		// 첫번째 숫자와 두번째 숫자를 비교하여 두번째 숫자가 크면 자리를 바꾼다.
		if (second > first) {
				tmp = second;
				second = first;
				first = tmp;
				
				// 자리를 바꿨다면 두번째 숫자와 세번째 숫자를 한번 더 비교한다.
				if(third > second){
					tmp = third;
					third = second;
					second = tmp;
				}
		}
		
		System.out.printf("%d %d %d\n", first, second, third);
	}

}
