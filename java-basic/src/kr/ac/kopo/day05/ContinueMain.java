package kr.ac.kopo.day05;

public class ContinueMain {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			// ABA
			// ABABA
			// ABABABA
			// ABABABABA
			// ABABABABAB
			for(int j = 0; j < 5; j++) {
				System.out.print("A");
				if(j > i) {
					break;
				}
				System.out.print("B");				
			}
			System.out.print("----");
			
			// ABAAAA
			// ABABAAA
			// ABABABAA
			// ABABABABA
			// ABABABABAB
			for(int j = 0; j < 5; j++) {
				System.out.print("A");
				if(j > i) {					
					continue;
				}
				System.out.print("B");	
			}	
			
			System.out.println();
		}
		
		
		// 가장 가까운 반복문이 아닌 중첩된 반복문을 한번에 빠져 나오고 싶다면
		// 반복문에 이름을 붙이고 break 이름; 으로 작성
		loop01 : for (int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				System.out.print("A");
				if(j > i) {
					break loop01;
				}
				System.out.print("B");				
			}
			System.out.println();
		}

	}

}
