package kr.ac.kopo.day04;

public class LoopMain18 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= 10 - i ; j++) {
					System.out.print(i <= j ? "*" : " ");
				}			
			} else {
				for(int j = 1; j <= i ; j++){
					System.out.print(10 - i <= j? "*" : " ");
				}	
			}
			System.out.println();
		}

	}

}
