package kr.ac.kopo.day09;

public class StringMain02 {

	public static void main(String[] args) {
		String s = new String("Hello");
		String s2 = "Hello";
		
		String s3 = new String("Hello");
		String s4 = "Hello";
		
		System.out.println("S: [" + s +"]"); //출력 결과 S: [Hello]
		System.out.println("S: [" + s2 +"]"); //출력 결과 S: [Hello]
		System.out.println("S: [" + s3 +"]"); //출력 결과 S: [Hello]
		System.out.println("S: [" + s4 +"]"); //출력 결과 S: [Hello]

		// s2와 s4는 같은 상수 "Hello"를 가리킴.
		// s과 s3은 새로운 저장공간을 만들고 "Hello"를 저장함.
		
		s = new String("Good-bye");
		// "Good-bye"를 저장할 새로운 공간이 만들어지고 s는 "Hello"를 가르키던 주소대신 새로운 주소를 저장.
		// "Hello"를 저장하던 공간은 유령공간이 되고 가비지콜렉터에 의해 지워질 가능성이 생김.
		s2 = "hi";
		s3 = new String("Hi");
		s4 = "abc";
		
		System.out.println("S: [" + s +"]"); //출력 결과 S: [Good-bye]
		System.out.println("S: [" + s2 +"]"); //출력 결과 S: [hi]
		System.out.println("S: [" + s3 +"]"); //출력 결과 S: [Hi]
		System.out.println("S: [" + s4 +"]"); //출력 결과 S: [abc]
		
		s = new String("Hello");
		// "Hello"를 저장할 새로운 저장공간을 다시 할당 받음
		s2 = "Hello";
		// 상숫값 "Hello"를 다시 저장함.
	}

}
