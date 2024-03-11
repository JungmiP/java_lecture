package kr.ac.kopo.day04;

/*
 
*********
 *******
  *****
   ***
    *

*/

public class LoopMain16 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j=1; j<= 10 - i; j++ ) {
//				if(i > j) {
//					System.out.print(' ');
//				}else {
//					System.out.print("*");					
//				}
				System.out.printf("%c", i > j ? ' ' : '*');
				
			}
			System.out.println();
		}

	}

}
