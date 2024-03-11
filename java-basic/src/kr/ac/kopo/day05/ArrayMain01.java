package kr.ac.kopo.day05;

import java.util.Scanner;

public class ArrayMain01 {
	// 배열은 참조형으로 new 키워드로 생성 -> Heap 메모리에 만들어짐
	// stack 메모리에 배열의 주소를 기억할 변수가 만들어짐.
	// 자료형[] 변수명 = new 자료형[배열의 길이]
	// ex) int[] ptr = new int[4];
	// 배열의 요소를 참조하기 위해서 인덱스를 사용하고 인덱스는 0부터 시작
	// => 참조변수에 첫 요소의 시작 주소값이 저장되고 이 주소로 부터떨어진 거리를 의미
	
	// 배열의 초기화 방식
	// int[] prime = {1, 2, 3};
	// int[] prime = new int[] {1, 2, 3};
	
	// 배열의 길이
	// 배열이름.length;
	
	
	// 예시 문제
	// 정수 3개를 입력 받아 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d\'s num: ", i + 1);
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		sc.close();
		
		System.out.println("< PRINT >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();		
	}
}
