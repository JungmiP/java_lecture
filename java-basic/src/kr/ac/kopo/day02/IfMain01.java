package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 보유하고 있는 책 권수 입력: 1
 * 
 * book: 1

 * 보유하고 있는 책 권수 입력: 4
 * 
 * books: 4
 * 
 * */
public class IfMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책 권수 입력: ");
		int book = sc.nextInt();
		sc.close();
		
		
		System.out.print(book + " book");
		if (book > 1) {
			System.out.print("s");
		}
		
		
		// 다른 방식
		if(book == 1) {
			System.out.print(book + " book");
		} else {
			System.out.print(book + " books");
		}
		
	}

}
