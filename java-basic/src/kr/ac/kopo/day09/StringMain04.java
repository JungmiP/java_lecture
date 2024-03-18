package kr.ac.kopo.day09;

public class StringMain04 {

	public static void main(String[] args) {
		String s = "Hello";
		String s2 = "Hello";
		
		if(s == s2) {
			System.out.println("s == s2");
		}else {
			System.out.println("s != s2");
		}
		
		String s3 = new String("Hello");
		String s4 = new String("HeLlo");
				
		if(s3 == s4) {
			System.out.println("s3 == s4");
		}else {
			System.out.println("s3 != s4");
		}
		// 참조변수의 ==(비교연산)은 주소값을 비교함.
		// 문자열끼리 비교하고 싶으면 equals() 메소드 사용
		
		boolean bool = s3.equals(s4);
		if(bool) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//대소문자 무시
		bool = s3.equalsIgnoreCase(s4);
		if(bool) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		String[] names = {"홍길동", "홍길순", "강길동", "나가길", "윤길동", "홍길동", "홍개똥", "길길순"};
		
		// 이름이 "홍길동"일때만 출력하는 여러가지 방법
		// equals()로 비교
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);				
			}
		}
		
		// compareTo()를 이용하는 방법
		for(String name : names) {
			if(name.compareTo("홍길동") == 0) {
				System.out.println(name);				
			}
		}
		
		// if 대신 switch
		System.out.println("---------------------");
		for(String name : names) {
			switch(name) {
			case "홍길동" :
				System.out.println(name);
				break;
			}
		}

		// JDK 14버전 추가, 간략화된 switch문
		// case + break; 를 
		// case -> {} 로 사용가능
		System.out.println("---------------------");
		for(String name : names) {
			switch(name) {
			case "홍길동" -> {
				System.out.println(name);
			}
			case "홍길순" -> {
				System.out.println("!!");
			}	
			}
		}
		
		System.out.println("---------------------");
		// 성이 "홍"이면 출력 startsWith()
		for(String name: names) {
			if (name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		//charAt() 사용 시 성이 한 글자 이상인 이름에 적용 불가
		
		System.out.println("---------------------");
		// 이름이 "길동"이면 출력 endsWith()
		for(String name: names) {
			if (name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		
		System.out.println("---------------------");
		// 이름에 "길"이 있으면 출력, contains()
		for(String name: names) {
			if (name.contains("길")) {
				System.out.println(name);
			}
		}
		// contains()는 속도가 느림
		
		
		String word = "hello World";
		String word2 = "hello";
		int cmp = word.compareTo(word2);
		if(cmp == 0) {
			System.out.println("같다");
		}else if(cmp > 0) {
			System.out.println("word > word2");		
		}else {
			System.out.println("word < word2");
			
		}				
		
	}

}
