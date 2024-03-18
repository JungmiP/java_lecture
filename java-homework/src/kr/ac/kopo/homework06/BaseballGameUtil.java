package kr.ac.kopo.homework06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaseballGameUtil {
	Scanner sc = new Scanner(System.in);

	// 0~9까지의 랜덤한 숫자 받기
	int[] setThreeNums() {
		int[] nums = new int[3];
		Random r = new Random();
		for (int i = 0; i < nums.length; i++) {
			// 숫자 입력 받기
			nums[i] = r.nextInt(10);
			// 중복 체크 하기
			for (int j = i - 1; j >= 0; j--) { 
				if (nums[i] == nums[j]) {
					i--;
				}
			}
		}
		return nums;
	}

	// 사용자에게 0~9까지 숫자 3개 입력 받기
	int[] inputThreeNums() {
		int[] nums = new int[3];
		System.out.print("0 ~ 9 사이의 다른 숫자 3개를 입력하세요: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		sc.nextLine();
		return nums;
	}

	/*
	// 스트라이크
	void strike(int answers[], int[] nums) {
		int cnt = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == nums[i]) {
				cnt++;
			}
		}
		System.out.println("스트라이크 개수: " + cnt);
	}
	// 볼
	void ball(int answers[], int[] nums) {

	}
	*/
	
	// s,b,o 체크 메소드
	int[] checkNums(int answers[], int[] nums){
		
		// sboChk[0] : strike, sboChk[1] : ball, sboChk[2] : out
		int[] sboChk = new int[3];
		for(int i = 0; i < answers.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(answers[i] == nums[j]) {
					if(i == j) { // strike 횟수 올리기
						sboChk[0]++;
					} else{ // ball 횟수 올리기
						sboChk[1]++;
					}
				}
			}
		}
		// out인 경우 체크
		if(sboChk[0] == 0 && sboChk[1] == 0) {
			sboChk[2]++;			
		}
		return sboChk;
	}
	
	// 체크 결과 출력 메소드
	void printChkResult(int[] sboChk) {
		if(sboChk[0] == 3) {
			System.out.println("정답입니다. 축하합니다!!");
		}else if(sboChk[2] == 1) {
			System.out.println("아웃입니다!");
		}else {
			System.out.println("스트라이크 개수: " + sboChk[0]);
			System.out.println("볼 개수: " + sboChk[1]);}
	}
	
	
	// 게임 종료 메소드
	boolean endGame() {
		System.out.println("******** 게임 종료 ********");
		return false;
	}
	
	// 게임 시작 메소드	
	void startGame(){
		System.out.println("******** 게임 시작 ********");
		// 랜덤 숫자 3개 받기
		int[] answers = setThreeNums();
		System.out.println(Arrays.toString(answers));

		int outCnt = 0, chance = 6;
		boolean isChanceLeft = true;
		while(isChanceLeft) {
						
			// 숫자 3개 입력 받기
			int[] nums = inputThreeNums();
			
			// 답과 비교하기
			int[] chkResult = checkNums(answers, nums);
			
			// 아웃 개수 올려주기
			outCnt += chkResult[2];
			
			// 비교 결과 출력
			printChkResult(chkResult);
			
			chance--;
			// 종료 조건 확인
			if(chkResult[0] == 3 || outCnt == 3 || chance == 0) {
				isChanceLeft = endGame();
			}else {
				System.out.printf("기회는 %d번 남았습니다\n", chance);
			}
			
		}
	}
	

}
