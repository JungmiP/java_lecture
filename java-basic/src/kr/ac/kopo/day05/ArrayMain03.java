package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		// 참조형을 저장하는 배열
		// 참조형 타입의 배열을 선언하면 배열의 각 공간에는 실제값을 저장한 주소값이 들어옴.
		// heap 영역에 "2024" 를 저장하고 그 주소값이 heap에 있는 strArr[0] 공간에 저장됨.
		String[] strArr = {"2024", "java", "교육"};
		System.out.println("배열의 길이: " + strArr.length);
		System.out.println("첫번째 문자열: " + strArr[0]);
		System.out.println("두번째 문자열: " + strArr[1]);
		System.out.println("세번째 문자열: " + strArr[2]);
		
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(strArr));
	}

}
