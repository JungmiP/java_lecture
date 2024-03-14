package kr.ac.kopo.day07;

// 클래스 내에 여러 클래스를 정의할 수도 있다.
// 그러나 한 클래스 내 public class는 하나만 존재해야 한다.
class Handphone {
	String name;
	String phone;
	String company;
}

public class HandphoneMain {

	public static void main(String[] args) {
		Handphone hp = new Handphone();
		hp.name = "홍길동";
		hp.phone = "010-0000-0000";
		hp.company = "삼성";

		Handphone hp2 = new Handphone();
		hp2.name = "강길동";
		hp2.phone = "010-1111-2222";
		hp2.company = "애플";

		Handphone hp3 = new Handphone();
		hp3.name = "고길동";
		hp3.phone = "010-3333-4444";
		hp3.company = "모토로라";
		
		
		Handphone[] hpArr = {hp, hp2, hp3};
		for (int i = 0; i < hpArr.length; i++) {			
			System.out.println("소유주: " + hpArr[i].name 
								+ ", 번호: " + hpArr[i].phone 
								+ ", 제조사: " + hpArr[i].company);			
		}
		
		for(Handphone p : hpArr) {
			System.out.println("소유주: " + p.name 
					+ ", 번호: " + p.phone 
					+ ", 제조사: " + p.company);
		}
	}

}
