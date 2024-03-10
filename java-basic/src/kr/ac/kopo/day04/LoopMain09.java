package kr.ac.kopo.day04;

public class LoopMain09 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 ; j++) {
//				if(i <= j) {
//					System.out.print("*");					
//				} else {
//					System.out.print(" ");
//				}
				System.out.printf("%c", i > j ?' ':'*');
			}
			System.out.println();
		}
		

//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i - 1 ; j++) {
//				System.out.print(' ');
//			}
//			for(int j = 1; j <= 6 - i; j++) {
//				System.out.print('*');				
//			}
//			System.out.println();
//		}
	}

}
