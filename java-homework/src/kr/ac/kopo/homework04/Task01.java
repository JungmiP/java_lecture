package kr.ac.kopo.homework04;

import java.util.Scanner;

/*
 * 10개의 숫자를 입력받아 짝수 홀수를 나누고 각 합을 출력하기
 * */

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] even = new int[10]; // 짝수를 저장할 배열
		int[] odd = new int[10]; // 홀수를 저장할 배열
		int evenSum = 0, oddSum = 0, evenIndex = 0, oddIndex = 0;
		
		for(int i = 0; i < 10; i++) { // 10번 입력을 받는다
			System.out.printf("num%d : ", i + 1);
			int num = Integer.parseInt(sc.nextLine());
			if(num % 2 == 0) { // 짝수면 짝수 배열에 추가 후 짝수합에 더한다.
				even[evenIndex++] = num;
				evenSum += num;				
			}else {			// 홀수면 홀수 배열에 추가 후 홀수합에 더한다
				odd[oddIndex++] = num;	
				oddSum += num;				
			}
		}
		sc.close();
		
		// 짝수 출력하기
		System.out.println("< 짝수 >");
		for(int data : even) {
			if(data != 0)
			System.out.print(data + " ");
		}
		System.out.println();
		System.out.println("짝수의 총합: " + evenSum);
		
		// 홀수 출력하기
		System.out.println("< 홀수 >");
		for(int data : odd) {
			if(data != 0)
			System.out.print(data + " ");
		}
		System.out.println();
		System.out.println("홀수의 총합: " + oddSum);
		
		
		
		// 배열 하나로 만들기
		
		int[] nums = new int[10]; // 정수를 저장할 배열
		
		for(int i = 0; i < 10; i++) { // 10번 입력을 받는다
			System.out.printf("num%d : ", i + 1);
			nums[i] = Integer.parseInt(sc.nextLine());
		}
		sc.close();
		
		// 짝수 출력하기
		for(int mod = 0; mod <= 1; mod++) {
			System.out.printf("< %s >\n", mod == 0? "짝수" : "홀수");
			int sum = 0;
			for(int data : nums) {
				if(data % 2 == mod) {
					System.out.print(data + " ");
					sum += data;
				}
			}
			System.out.println();
			System.out.printf("%s의 총합: %d \n", mod == 0? "짝수" : "홀수", sum);
		}

	}

}
