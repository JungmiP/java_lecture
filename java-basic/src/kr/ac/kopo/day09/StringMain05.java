package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain05 {

	public static void main(String[] args) {
		String s = "hello world";
		char c = 'o';
		
		int idx = s.indexOf(c);
		System.out.println(c + "문자의 위치: " + idx);
		// 왼쪽에서 오른쪽으로 search -> 출력 : 4
		
		idx = s.lastIndexOf(c);
		System.out.println(c + "문자의 위치: " + idx);
		// 오른쪽에서 왼쪽으로 search -> 출력 : 7
		
		c = 'p';
		idx = s.indexOf(c);
		System.out.println(c + "문자의 위치: " + idx);
		// 없으면 -1
		
		c = 'o';
		System.out.printf("<%s에서 %c 문자의 위치>\n",s ,c);
		idx = s.indexOf(c);
		while(idx != -1) {
			System.out.println("찾은 위치: " + idx);
			idx = s.indexOf(c, idx + 1);
		}
		
		System.out.println("--------------------");
		idx = -1;
		while((idx = s.indexOf(c, idx + 1)) != -1) {
			System.out.println("찾은 위치: " + idx);			
		}
		
		// 문자열 추출 
		String subStr = s.substring(6, 11);
		System.out.println(subStr);
		subStr = s.substring(6);// 6 ~ 마지막까지
		System.out.println(subStr);
		
		// 문자열 합치기
		s = "hello";
		String s2 = "world";		
		String s3 = s.concat(s2); // s + s2랑 같음
		System.out.println("s: " + s);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		
		// trim() -> 문자열 중간의 공백은 제거 못함.
		s = "     hello world      ";
		System.out.println(s + " 문자열의 길이: " + s.length());
		String trimStr = s.trim();
		System.out.println(trimStr + " trim() 후 문자열의 길이: " + trimStr.length());
		
		
		s = "Hello World!!";
		//대문자
		System.out.println(s.toUpperCase());
		//소문자
		System.out.println(s.toLowerCase());
		
		
		//문자열 나누기
		String date = "2024-03-18";
		String[] dateArr = date.split("-");
		System.out.println(Arrays.toString(dateArr));
		
		String ip = "172.31.9.164";
		String[] ipArr = ip.split("\\."); // '.' 같이 다른 의미를 갖는 문자는 escape 문자 필요
		System.out.println(Arrays.toString(ipArr));
		
		System.out.println(String.valueOf(85).getClass().getTypeName());
		
	}

}
