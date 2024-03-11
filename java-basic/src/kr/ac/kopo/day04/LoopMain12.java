package kr.ac.kopo.day04;

/*

*****
****
***
**
*
**
***
****
*****

 * */

public class LoopMain12 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 0; j < 6 - i; j++) {
					System.out.print("*");
				}
			} else {
				for(int k = i - 4; k > 0; k--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
