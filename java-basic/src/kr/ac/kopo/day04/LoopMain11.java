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
public class LoopMain11 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if(i <= 5 ) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}				
			} else {
				for(int k = 0; k <= 9 - i ; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		int nStar = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= nStar; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < 5) {
				nStar++;
			} else {
				nStar--;
			}
		}

	}

}
