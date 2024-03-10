
package kr.ac.kopo.day04;

public class LoopMain15 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j=1; j <= i + 4 ; j++) {
//				if(j >= 6-i) {
//					System.out.print('*');					
//				}else {
//					System.out.print(' ');
//				}
				System.out.printf("%c", j >= (6-i) ?'*' :' ');
			}
			System.out.println();
		}

	}

}
