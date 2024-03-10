package kr.ac.kopo.homework02;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		System.out.print("2 - 100 사이의 정수 입력: ");
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt(); 
//		sc.nextLine();
		int num = Integer.parseInt(sc.nextLine()); // 문자열로 입력받아 int로 형변환
		sc.close();
		
		System.out.printf("<1 ~ 100 사이 %d의 배수 출력>\n", num);
		int cnt = 0, result = 0;
		for(int i = 1; result < 100 && 100 - result > num ; i++) {
			result = num * i;
			System.out.print(result + " ");
			cnt++;
		}
		System.out.printf("\n총 %d개\n", cnt);
		
		
		int c = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % num == 0) {
				System.out.print(i+ " ");				
			}
			c++;
		}
		System.out.printf("총 %d개\n", c);

	}

}
