package kr.ac.kopo.day08;

public class Member {
	String name;
	int age;
	String bloodType;
	
	Member(){
//		name = "알 수 없음";
//		age = -1;
//		bloodType = "알 수 없음";
		
		//this("알 수 없음", -1, "알 수 없음");
		this("알 수 없음");
		
	}
	
	Member(String name){
//		this.name = name;
//		this.age = -1;
//		this.bloodType = "알 수 없음";
		
		// this(name, -1, "알 수 없음");
		this(name, -1);
	}
	
	Member(String name, int age){
		// 클래스명() 생성자 호출 방식은 new 키워드와 함께 쓸 때만 사용 가능
		// 생성자 내에서 자기 자신의 생성자를 호출할 때 this() 사용
		// this 생성자는 무조건 생성자의 첫 라인에 써야 함.
		this (name, age, "알 수 없음");
		
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알 수 없음";
	}
	
	// 지역변수와 멤버변수 중 우선순위는 지역변수가 높다
	// 지역변수와 멤버변수의 변수명이 같을 경우 지역변수로 인식하기때문에 멤버변수를 쓰고 싶으면 this.를 붙여줘야 함.
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 혈액형: " + bloodType);
	}
}
