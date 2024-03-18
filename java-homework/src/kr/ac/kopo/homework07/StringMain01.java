package kr.ac.kopo.homework07;

public class StringMain01 {

	public static void main(String[] args) {
		StringUtil su = new StringUtil();
		
		boolean b1 = su.isUpper('A');
		boolean b2 = su.isUpper('c');
		System.out.println("Test 01: " + b1);
		System.out.println("Test 02: " + b2);
		
		
		boolean b3 = su.isLower('A');
		boolean b4 = su.isLower('c');
		System.out.println("Test 03: " + b3);
		System.out.println("Test 04: " + b4);
		
		int n = su.max(10, 50);
		int n2 = su.min(10, 50);
		System.out.println("Test 05: " + n);
		System.out.println("Test 06: " + n2);
		
		String s1 = su.reverseString("Hello Java");
		String s2 = su.toUpperString("Hello Java");
		String s3 = su.toLowerString("Hello Java");
		System.out.println("Test 07: " + s1);
		System.out.println("Test 08: " + s2);
		System.out.println("Test 09: " + s3);
		
		int n3 = su.checkChar("Hello World Java", 'o');
		System.out.println("Test 10: " + n3);
		
		String s4 = su.removeChar("Hello World Java", 'l');
		System.out.println("Test 11: " + s4);
		
		
		String s5 = su.removeString("Hello World Java", "ava");
		System.out.println("Test 12: " + s5);
		

	}

}
