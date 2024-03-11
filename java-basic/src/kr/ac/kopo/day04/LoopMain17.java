package kr.ac.kopo.day04;

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */


public class LoopMain17 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i + 4; j++) {
					System.out.printf("%c", 6 - i > j ? ' ' : '*');
				}
			} else {
				for (int j = 1; i + j <= 14; j++) {
					System.out.printf("%c", i - j > 4 ? ' ' : '*');
				}
			}
			System.out.println();
		}

		// 교수님 풀이1 => 규칙 찾아서 만들기
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5 - i; j++) {
					System.out.printf(" ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.printf("*");
				}
			} else {
				for (int j = 1; j <= i - 5; j++) {
					System.out.printf(" ");
				}
				for (int j = 1; j <= 2 * (10 - i) - 1; j++) {
					System.out.printf("*");
				}
			}
			System.out.println();
		}
		
		// 교수님 풀이2
		int nSpace = 4;
		for (int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= nSpace || j >= 10 - nSpace) {
					System.out.print(" ");
				}else {
					System.out.print("*");					
				}
			}
			System.out.println();
			if(i < 5)
				nSpace--;
			else 
				nSpace++;
		}
	}

}
