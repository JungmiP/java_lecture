package kr.ac.kopo.day05;

public class ArrayMain02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("arr: " + arr); // 주소값 출력
		System.out.println("arr[0]: " + arr[0]); // arr[0]의 값 출력
		System.out.println("arr[5]: " + arr[5]); // 배열의 범위를 벗어나면 Exception 발생
		
		arr = new int[3]; 
		// heap 영역에 길이 3인 새로운 배열이 생성되고 주소가 arr 변수에 업데이트됨
		// 앞서 생성한 배열의 주소는 잃어버려 접근 불가능
		// 불필요한 메모리 낭비를 막기 위해 new로 생성한 객체와 같은 개수의 참조 변수가 필요
		// 자바에서는 가비지 콜렉터가 heap 메모리 정리를 해줌.
	}

}
