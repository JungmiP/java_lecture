package kr.ac.kopo.day07;

// 실행 클래스
// main 메소드를 가지고 있는 클래스
// 프로그램의 시작점과 종료시점을 알려줌.
public class CarMain {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = new Car();
	
		c.name = "소나타";
		c.price = 3600;
		c2.name = "그랜저";
		c2.price = 4200;
		
		System.out.println("자동차명: " + c.name + ", 가격: " + c.price);
		System.out.println("자동차명: " + c2.name + ", 가격: " + c2.price);

	}

}
