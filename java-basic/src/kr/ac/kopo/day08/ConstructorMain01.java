package kr.ac.kopo.day08;

// 생성자 
// default 생성자. 생성자를 만들지 않으면 jvm이 자동으로 매개변수와 내용이 없는 생성자를 생성해줌.
// class의 멤버변수를 초기화하기 위한 목적.
// 오버로딩을 지원 => 매개 변수의 타입과 개수가 다르게 여러 개의 생성자 정의 가능.
// 객체지향프로그래밍에서는 은닉성이 중요 -> 외부에 멤버변수의 값이 드러나 공개되거나 수정되지 않도록 캡슐화. 
// => 생성자를 이용한 초기화를 통해 멤벼변수의 값을 정해주고 그 뒤로는 접근하지 못하게 함.
// 인스턴스 객체를 생성할 때만 생성자가 호출됨. -> new 키워드를 쓸 때만 호출.

class Car {
	// 생성자 특징 
	// 1. 클래스명 동일
	// 2. 반환형 없음
	// 3. 디폴트생성자 지원
	
	//default 생성자
	Car() {
		System.out.println("default 생성자 호출");
	}
	// 오버로딩
	// 매개변수가 있는 생성자를 만들 땐 default 생성자를 수동으로 만들어야 함. => jvm 자동으로 지원 안함.
	Car(String s) {
		System.out.println("Car(String) 생성자 호출");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {		
		
		Car c= new Car();
		new Car("차");

	}

}
