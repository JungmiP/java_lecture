package kr.ac.kopo.day04;

public class LoopMain13 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= 5; j++) {
					System.out.printf("%c", i <= j ?'*':' ');
				}
			}else {
				for(int j = 1; j <= 5; j++) {
					System.out.printf("%c", i+j >= 10 ? '*' : ' ');
				}				
			}
			System.out.println();
		}

	}

}
