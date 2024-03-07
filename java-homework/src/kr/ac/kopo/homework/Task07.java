package kr.ac.kopo.homework;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(알파벳): ");
//		String inputStr = sc.nextLine( );
//		char c = inputStr.charAt(0);
		char c = sc.nextLine().charAt(0);
		sc.close();
		
		int tmp = 'a' - 'A'; // 아스키코드 상에서 대문자와 소문자의 코드값 차 구하기.
		int result = 0;
		
		if(c >= 'A' && c <= 'Z') {
			result = c + tmp; // 입력받은 c가 대문자일 경우
		}else if(c >= 'a' && c <= 'z') {
			result = c - tmp; // 입력받은 c가 소문자일 경우
		}else {
			System.out.println("잘못 입력하셨습니다."); // 알파벳이 아닌 것을 입력한 경우.
		}
		
		System.out.println("변경된 값: " + (char)result);
		

	}

}
