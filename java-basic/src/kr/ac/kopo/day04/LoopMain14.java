package kr.ac.kopo.day04;

/*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
 
 */

public class LoopMain14 {

	public static void main(String[] args) {
		// 내가 푼 방법
		for(int i = 1; i <= 9; i++) {
			if(i < 5) {
				for(int j = 1; j <= 5; j++) {
					System.out.printf("%c", (i + j) < 6 ? ' ':'*');
				}
			} else {
				for(int j = 1; j <= 5; j++){
					System.out.printf("%c", (i - j) > 4 ? ' ':'*');
				}			
			}
			System.out.println();
		}
		
		// 교수님 풀이1
		int nStar = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 5 - nStar; j++) {				
				System.out.print(' ');
			}
			for(int j = 1; j <= nStar; j++) {				
				System.out.print('*');
			}
			System.out.println();
			if(i < 5) {
				nStar++;
			} else {
				nStar--;
			}
		}
		
		// 교수님 풀이2
		int col = 5;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 5; j++) {				
				System.out.print(j < col ? ' ' : '*');
			}
			System.out.println();
			if(i < 5) {
				col--;
			} else {
				col++;
			}
		}
		
		// 절댓값 쓰기

	}

}
