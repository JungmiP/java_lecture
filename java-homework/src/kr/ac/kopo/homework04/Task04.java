package kr.ac.kopo.homework04;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] even = new int[5]; // 짝수를 저장할 배열
		
		int i = 0; // 인덱스
		
		// 인덱스가 5 미만이 될때까지 반복
		while(i < even.length) {
			 System.out.printf("num%d: ", i + 1);
			 int tmp = Integer.parseInt(sc.nextLine());
			 // 입력받은 정수가 짝수일 때만 배열에 저장하고 인덱스를 1 올림
			 if (tmp % 2 == 0) {
				 even[i++] = tmp;
			 }
		}
		sc.close();
		
		
		// do-while 이용하기
		do {
			System.out.printf("num%d: ", i + 1);
			even[i] = Integer.parseInt(sc.nextLine());
		}while(even[i] % 2 == 1);
		
		
		// for문의 증감 연산자를 꼭 입력할 필요는 없음
		for(int j = 0;j < even.length;) {
			even[i] = Integer.parseInt(sc.nextLine());
			if(even[i] % 2 == 1)
				j++;			
		}
		
		// 출력하기
		System.out.println("< PRINT >");
		for(int e : even) {
			System.out.print(e + " ");
		}
		System.out.println();

	}

}
