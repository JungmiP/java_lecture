package kr.ac.kopo.day01;

public class HelloMain {

	public static void main(String[] args) {
	
		
		System.out.print(1); //라인없이
		System.out.println(true); // 새 라인
		System.out.printf("%d %c %d", 3, '+', 4); // 형식 지정, 라인 없이
		System.out.printf("[%4d] %c %d", 3, '+', 4); // 자릿수 지정, 오른쪽 정렬
		System.out.printf("[%-4d] %c %d", 3, '+', 4); // 자릿수 지정, 왼쪽 정렬
		System.out.printf("[%04d] %c %d", 3, '+', 4); // 빈자리 0으로 채우기
		
	}
}
