package kr.ac.kopo.homework07;

public class StringUtil {
	
	final int LOWER_UPPER_GAP = 32;
	
	
	// 1. isUpper() 
	// 입력 받은 문자가 대문자이면 true를 반환
	boolean isUpper(char c) {
		return (c >= 'A' && c <= 'Z')? true : false;
	}
	
	// 2. isLower() 
	// 입력 받은 문자가 소문자이면 true를 반환
	boolean isLower(char c) {
		return (c >= 'a' && c <= 'z') ? true : false;
	}
	
	// 3. max
	// 두 개의 숫자를 입력받아 큰 수를 반환
	int max(int x, int y) {
		int tmp = String.valueOf(x).compareTo(String.valueOf(y));	
		return (tmp >= 0)? x : y;
	}
	
	// 4. min
	// 두 개의 숫자를 입력받아 작은 수를 반환
	int min(int x, int y) {
		int tmp = String.valueOf(x).compareTo(String.valueOf(y));				
		return (tmp <=0 ? x : y);
	}
	
	// 5. reverseString
	// 문자열을 입력받아 거꾸로 변경하여 반환
	String reverseString(String str) {
		char[] reverse = new char[str.length()];
		for(int i = str.length(); i > 0; i--) {
			reverse[str.length() - i] = str.charAt( i - 1);
		}
		return String.valueOf(reverse);
	}
	
	// 6. toUpperString
	// 문자열을 입력받아 대문자로 변경하여 반환
	String toUpperString (String str) {
		char[] cArr = new char[str.length()]; 
		str.getChars(0, str.length(), cArr, 0);
		for(int i = 0; i < cArr.length; i++) {
			if(cArr[i] >= 'a' && cArr[i] <= 'z') {
				cArr[i] -= LOWER_UPPER_GAP;
			}
		}
		return String.valueOf(cArr);
	}
	

	// 7. toLowerString
	// 문자열을 입력받아 소문자로 변경하여 반환
	String toLowerString (String str) {
		char[] cArr = new char[str.length()]; 
		str.getChars(0, str.length(), cArr, 0);
		for(int i = 0; i < cArr.length; i++) {
			if(cArr[i] >= 'A' && cArr[i] <= 'Z') {
				cArr[i] += LOWER_UPPER_GAP;
			}
		}
		return String.valueOf(cArr);
	}
	
	
	// 8. checkChar()
	// 문자열에서 입력받은 문자의 개수 구하기
	public int checkChar(String strData, char ch) {
		int cnt = 0;
		for(int i = 0; i < strData.length(); i++) {
			if (strData.charAt(i) == ch) cnt++;
		}		
		return cnt;
	}
	
	
	// 9. removeChar()
	// 주어진 문자열에서 특정 문자 제거하기
	public String removeChar(String oriStr, char delChar) {
		String result = "";
//		String[] strArr = oriStr.split(String.valueOf(delChar));	
//		for(String s : strArr) {
//			result += s;
//		}
		
		for(int i = 0; i < oriStr.length(); i++) {
			char tmp = oriStr.charAt(i);
			if(tmp != delChar) result += tmp;
		}
		return result;
	}
	
	// 10. removeString()
	// 주어진 문자열에서 특정 문자열 제거하기
	public String removeString(String oriStr, String delStr) {
		String result = "";
		for(int i = 0; i <= (oriStr.length() - delStr.length()); i++) {
			for(int j = 0; j < delStr.length(); j++) {
				if(oriStr.charAt(i + j) != delStr.charAt(j)) {
					break;
				}
				result = oriStr.substring(0, i) + oriStr.substring(i + delStr.length(), oriStr.length());
			}
		}
		return result;
	}
	
	
	
}
