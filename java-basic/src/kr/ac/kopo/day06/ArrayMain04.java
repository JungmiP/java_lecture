package kr.ac.kopo.day06;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		// 배열을 생성 후 원하는 값을 대입하기
		int[] arr1 = new int[5];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (i + 1) * 10;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 배열의 초기화
		// 원하는 값을 가지고 있는 배열로 초기화하기
		int[] arr2 = new int[] { 10, 20, 30, 40, 50 };
		// 축약형, 맨 처음 선언할 때만 사용 가능
		int[] arr3 = { 10, 20, 30, 40, 50 }; 

		/*
		 * 배열의 모든 요소를 출력하는 방법 
		 * 1. index를 이용한 출력 
		 * 2. 1.5버전의 for문을 이용한 출력 (for each문)
		 * 3. Arrays.toString() 메소드를 이용한 출력
		 */

		// 1번
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 2번
		// 배열의 전체 데이터에 접근할 때만 사용가능
		for (int data : arr1) {
			System.out.print(data+ " ");
		}
		System.out.println();
		
		// 3번
		System.out.println(Arrays.toString(arr1));
	}

}
