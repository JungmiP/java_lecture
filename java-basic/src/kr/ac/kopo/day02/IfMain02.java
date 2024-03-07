package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 보유하고 있는 책 권수 입력: 1
 * 
 * book: 1

 * 보유하고 있는 책 권수 입력: 4
 * 
 * books: 4
 
 * 보유하고 있는 책 권수 입력: 0
 * 
 * 보유하고 있는 책 없음
 * 
 * */

public class IfMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책 권수 입력: ");
		int book = sc.nextInt();
		sc.close();
		
		
		if(book == 0) {
			System.out.print("보유하고 있는 책 없음");
		} else if(book == 1) {
			System.out.print(book + " book");
		} else {
			System.out.print(book + " books");
		}
		
	}

}
