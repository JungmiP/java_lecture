package kr.ac.kopo.day04;

public class LoopMain14 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if(i < 5) {
				for(int j = 1; j <= 5; j++) {
					System.out.printf("%c", (i + j) < 6 ? ' ':'*');
				}
			} else {
				for(int j = 1; j <=5; j++){
					System.out.printf("%c", (i - j) > 4 ? ' ':'*');
				}			
			}
			System.out.println();
		}

	}

}
