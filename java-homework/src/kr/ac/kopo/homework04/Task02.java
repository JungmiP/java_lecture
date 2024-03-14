package kr.ac.kopo.homework04;

import java.util.Random;

/*
 * 0~99 사이의 임의의 정수 5개를 받아와 출력
 * <PRINT>
 * 93 5 10 57 36
 * <REVERSE>
 * 63 75 1 50 39
 * */
public class Task02 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int[] arr = new int[5]; // 정수를 저장할 배열
		int[] reArr = new int[arr.length]; // 역으로 바꾼 정수를 저장할 배열
		
		// 임의의 숫자 5개 받기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
			reArr[i] = ((arr[i] % 10) * 10) + arr[i] / 10; // 숫자 바꾸기
		}
		
		// 출력하기
		System.out.println("<PRINT>");
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
		// reArr은 역으로 출력
		System.out.println("<REVERSE>");
		for(int i = reArr.length - 1; i >= 0; i--) {
			System.out.print(reArr[i] + " ");
		}
		
		int[] nums = new int[5]; // 정수를 저장할 배열		
		
		
		// 배열 하나만 쓰기
		
		// 임의의 숫자 5개 받기
		for(int i = 0; i < arr.length; i++) {
			nums[i] = r.nextInt(100);			
		}
		
		// 출력하기
		System.out.println("<PRINT>");
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
		// reArr은 역으로 출력
		System.out.println("<REVERSE>");
		for(int i = nums.length - 1; i >= 0; i--) {
			System.out.print(((nums[i] % 10) * 10) + nums[i] / 10 + " ");
		}
		
		
	}

}
