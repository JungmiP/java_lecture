package kr.ac.kopo.day08;

import java.util.Scanner;

public class GugudanUtil {
	
	Scanner sc = new Scanner(System.in);

	// 키보드로 단을 입력받아 반환하는 메소드
	int inputDan(){
//		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력: ");
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}
	
	// 문자열을 입력받아 시작과 종료를 구분
	int inputDan(String msg) {
		System.out.print(msg);
		int dan = inputDan();
		return dan;
	}
	
	// 두 숫자를 입력 받는 메소드
	int[] inputDans(int cnt) {
		int[] nums = new int[cnt];
		for(int i = 0; i <= nums.length; i++) {			
			nums[i] = inputDan();
		}
		return nums; 
	}
	
	// 2 ~ 9 단 모두 출력하기 메소드 오버로딩
	void print() {
//		for(int dan = 1; dan <= 9; dan++) {
//			this.print(dan); // this - 자기참조변수, 같은 클래스 안에 있는 메소드를 쓸 때. 생략가능
//		}
		print(2, 9);
	}
	
	// 단을 받아 구구단을 출력하는 메소드
	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
	
	// 시작단과 종료단을 입력받아 출력하는 메소드
	void print(int start, int end) {
		for (int i = start ; i <= end; i++){
			print(i);
		}	
	}
		
			
}
