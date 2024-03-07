package kr.ac.kopo.day02;

import java.util.Scanner;

public class ScannerMain01 {

	public static void main(String[] args) {
		
//		new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력: ");
		char d = sc.nextLine().charAt(0); // .charAt(i) 문자열 중 i번째 문자 반환
		System.out.println("d : " + d);
		
		System.out.print("정수 입력: ");
		int a = sc.nextInt(); //int형 인수 입력
		sc.nextLine(); // 버퍼를 비워주기 위한 용도
		System.out.println("a : " + a);

		
		System.out.print("실수 입력: ");
		double b = sc.nextDouble(); // double형 인수 입력
		sc.nextLine();
		System.out.println("b : " + b);
		
		System.out.print("문자열 입력: ");
//		String c = sc.next(); // 단어 단위의 문자열 입력(공백문자 허용x)
		String c = sc.nextLine(); // 문장 단위의 문자열 입력(Enter 눌러야 입력 종료)
		System.out.println("c : " + c);
		
		
		/* 
		 * 입력 받을 때 메모리 상에서 입력 버퍼를 사용하여 line by line으로 입력값을 메모리(RAM)으로 전달 => 속도를 높이기 위함
		 * 공백으로 각 입력값 구분
		 * 입력 명령이 실행되면 메모리는 입력 버퍼가 빈 상태인지 확인 후 비어있으면 입력 받음.
		 * 입력을 연속으로 받게 되면 버퍼에 '\n'이 남아 있어 다음 입력에 영향을 끼칠 수 있음 => nextLine()으로 비워줌
		 * */
	
		sc.close();
	}

}
