package kr.ac.kopo.day04;

public class LoopMain06 {

	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--) {
			for(int j = 0; j < 5; j++) {
				System.out.print(i + j);
			}
			System.out.println();
		}
	}

}