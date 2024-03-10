package kr.ac.kopo.day04;

public class LoopMain17 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= i + 4 ;j++) {
					System.out.printf("%c", 6-i > j ?' ':'*');
				}				
			}else {
				for(int j = 1; i+j <= 14 ;j++) {
					System.out.printf("%c", i-j > 4 ?' ':'*');
				}					
			}
			System.out.println();
			
		}

	}

}
