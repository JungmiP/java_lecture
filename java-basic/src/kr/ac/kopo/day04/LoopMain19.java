package kr.ac.kopo.day04;
/*

 *       *
 **     **
 ***   ***
 **** ****
 *********
 **** ****
 ***   ***
 **     **
 *       * 
  
 */



public class LoopMain19 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i < 5) {

				for (int j = 1; j <= 9; j++) {
					System.out.print((i >= j) || (10 - i <= j) ? '*' : ' ');
				}
			} else {

				for (int j = 1; j <= 9; j++) {
					System.out.print((i <= j) || (10 - i >= j) ? '*' : ' ');
				}
			}
			System.out.println();
		}
		
		
		//
		int nStar = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= nStar || j >= 10 - nStar) {
					System.out.print("*");
				}else {
					System.out.print(" ");					
				}
			}
			if (i < 5) {
				nStar++;
			}else {
				nStar--;
			}
				
			System.out.println();
		}

	}

}
