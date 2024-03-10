package kr.ac.kopo.day04;

public class LoopMain19 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if( i < 5) {
				
				for(int j = 1; j <= 9; j++) {
					System.out.print( (i >= j) || (10-i <= j) ? '*':' ');
				}
			}else {
				
				for(int j = 1; j <= 9; j++) {
					System.out.print( (i <= j) || (10-i >= j) ? '*':' ');
			}
			}
			System.out.println();
		}

	}

}
