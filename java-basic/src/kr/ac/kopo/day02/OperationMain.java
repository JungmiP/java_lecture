package kr.ac.kopo.day02;

public class OperationMain {

	public static void main(String[] args) {
		
		int a = 0, b = 1, c = -1;
		
//		boolean result = ++a > 0 && ++b >=1 && ++c > 0;
//		boolean result = a++ > 0 || b++ >=1 || c++ > 0;
		boolean result = a-- >= 0 || b-- >= 0 && c-- > 0;
		
		System.out.println(result);
		System.out.println("a: " + a + ", b: " + b + ", c: " + c);
		
	}

}
