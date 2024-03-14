package kr.ac.kopo.day07;

import java.util.Scanner;

public class MethodMain02 {
// 정수 입력 메소드
	static int inputNum() {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		return num;
	}
	
// 정수 두개 입력받는 메소드
	static int[] inputTwoNum() {
		int[] nums = new int[2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(sc.nextLine());
		}
		return nums;
	}
	
	
// 합을 구하는 메소드
	static int getSum(int x, int y) {
		int result = 0;
		for(int i = x; i <= y; i++){
			result += i;
		}
		
//		while(x <= y) {
//			result += x++;
//		}
		
		return result;
	}
	
	
// 출력 메소드
	static void printNum(int x, int y, int z) {
		System.out.printf("%d와 %d의 총합: %d\n", x, y, z);
	}
	
	
	public static void main(String[] args) {
		
		int a = inputNum();
		int b = inputNum();
		int sum = getSum(a, b);
		printNum(a, b, sum);
		int[] nums = inputTwoNum();
		int total = getSum(nums[0], nums[1]);
		printNum(nums[0], nums[1], total);
		

	}

}
