package kr.ac.kopo.homework07;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		
		int x = 12;
		int y = 5;
		
		System.out.println(cl.plus(x , y));
		System.out.println(cl.minus(x , y));
		System.out.println(cl.multiply(x , y));
		System.out.println(cl.divide(x , y));
		System.out.println(cl.isPrime(x));
		System.out.println(cl.isPrime(y));
	}

}
