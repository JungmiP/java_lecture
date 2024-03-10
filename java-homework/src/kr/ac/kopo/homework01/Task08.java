package kr.ac.kopo.homework01;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값을 입력: ");
		int cost = sc.nextInt();
		sc.nextLine();
		System.out.print("지불한 돈의 액수: ");
		int money = sc.nextInt();
		sc.close();
		
		int change = money - cost; // 거스름돈 구하기
		int tmp = 0;
		
		if(change < 0){
			System.out.println("돈이 부족합니다."); // 지불한 돈이 물건 값보다 적은 경우
		} else if (change == 0){
			System.out.println("거스름돈이 없습니다."); // 딱 맞게 지불한 경우
		} else {
		
			int thousand = change / 1000;
			tmp = change % 1000;
			
			int fiveHund = tmp / 500 ;
			tmp %= 500;
			
			int hund = tmp / 100;
			tmp %= 100;
			
			int fifty = tmp / 50;
			tmp %= 50;
			
			int ten = tmp / 10;
			
			System.out.printf("거스름돈: %d 원\n", change);
			System.out.printf("1000원: %d 개\n", thousand);
			System.out.printf("500원: %d 개\n", fiveHund);
			System.out.printf("100원: %d 개\n", hund);
			System.out.printf("50원: %d 개\n", fifty);
			System.out.printf("10원: %d 개\n", ten);
		}
	}

}
