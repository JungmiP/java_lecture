package kr.ac.kopo.homework04;

import java.util.Scanner;

/*
 * 1 ~ 100 사이의 정수를 입력받아 입력받은 정수의 약수를 구하는 프로그램 작성
 * */
public class Task05 {

	public static void main(String[] args) {
		// 정수 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 100 사이의 정수 입력: ");
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		int cnt = 0;
		
		// 2의 배수를 넣고 3의 배수 2?
		// 약수의 개수를 구하고
		for(int i = 0; i < num/2; i++) {
			if(num % (i + 1) == 0) {
				arr[i] = i + 1;
				cnt++;
			}
		}
		
		
		// 약수를 배열에 저장
		
		
		int[] arr = new int[num/2]; // num/2개 만큼의 배열을 생성?
				
		
		// 배수의 약수에 해당하면 그 숫자를 대입 아니면 0을 대입
		for(int i = 0; i < num; i++) {
			if(num % (i + 1) == 0) {
				arr[i] = i + 1;
				cnt++;
			}
		}
		
		// 출력
		System.out.printf("%d 약수의 개수: %d개\n", num, cnt);
		for(int data : arr ) {
			if (data != 0)
			System.out.print(data + " ");
		}

	}

}
