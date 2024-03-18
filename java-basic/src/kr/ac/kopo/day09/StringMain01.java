package kr.ac.kopo.day09;

public class StringMain01 {

	public static void main(String[] args) {
		String s = new String();
		
		System.out.println("S: [" + s +"]"); //출력 결과 S: []
		
		//String 클래스는 출력 시 자동으로 .toString() 메소드를 호출함.

		char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		String s2 = new String(chars);
		System.out.println("S: [" + s2 +"]"); //출력 결과 S: [ABCDEFGH]
		
		String s3 = new String(chars, 3, 4);
		System.out.println("S: [" + s3 +"]"); //출력 결과 S: [DEFG]
		
		String s4 = new String("Hello");
		System.out.println("S: [" + s4 +"]"); //출력 결과 S: [Hello]
	}

}
