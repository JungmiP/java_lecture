package kr.ac.kopo.day06;

import java.util.Arrays;

public class ArrayMain06 {

	public static void main(String[] args) {
		// 배열 2개 합치기
		
		String[] strArr = {"봄", "여름"};
		String[] strArr2 = {"가을", "겨울"};
		
		String[] strArr3 = new String[strArr.length + strArr2.length];
		
		
		// 1. 직접 대입하기
		strArr3[0] = strArr[0];
		strArr3[1] = strArr[1];
		strArr3[2] = strArr2[0];
		strArr3[3] = strArr2[1];
		
		
		// 2. 반복문으로 처리하기
		int loc = 0;
		for(int i = 0; i < strArr.length; i++) {
			strArr3[loc++] = strArr[i];
		}
		
		for(String s: strArr2) {
			strArr3[loc++] = s;
		}

				
		// 3. 복사하기
		// System.arraycopy(원본 배열, 원본의 시작 인덱스, 복사대상 배열, 타겟의 시작 인덱스, 복사할 개수);
		System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
		System.arraycopy(strArr2, 0, strArr3, 2, strArr2.length);
		
		
		// 복사 연습
		int[] ori = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int[] dest = new int[7];
		System.arraycopy(ori, 4, dest, 2, 4);
		System.out.println(Arrays.toString(dest)); // 출력 => [0, 0, 5, 6, 7, 8, 0]
		
	}

}
