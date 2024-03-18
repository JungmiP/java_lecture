package kr.ac.kopo.homework07;

public class Calculator {
	
	int plus(int x, int y) {
		return x + y;
	}
	
	int minus(int x, int y) {
		return x - y;
	}
	
	int multiply(int x, int y) {
		return x * y;
	}

	double divide(int x, int y) {
		return (double) x / y;
	}
	
	// 소수체크
	boolean isPrime(int x) {		
		if (x > 3) {
			for(int i = 2; i <= (x / 2); i++) {
				if(x % i == 0) {
					return false;
				}
			}
		}else if(x < 2) {
			return false;
		} 		
		return true;
	}
	
	//에라토스테네스의 체를 이용하는 방법
	boolean sieveOfEratosthenes(int x) {
		boolean[] nums = new boolean[x + 1];	
		
		for(int i = 2; i <= Math.sqrt(x); i++) {
			if(nums[i] == false) {
				for(int j = i; j < nums.length; j += i) {
					nums[j] = true;
				}
			}
		}		
		return nums[x];
	}
	
	
	
}
	