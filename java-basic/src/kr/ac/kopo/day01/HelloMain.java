package kr.ac.kopo.day01;
/**
 * ����ȭ �ּ� �����
 * 
 * @author ���� ��� 
 * @version 0.1
 *  
 */
public class HelloMain {
	
	/**
	 * �����ϱ� ���� �޼ҵ�
	 * @param args
	 * */

	public static void main(String[] args) {
		
		System.out.print(1); //���ξ���
		System.out.println(true); // �� ����
		System.out.printf("%d %c %d", 3, '+', 4); // ���� ����, ���� ����
		System.out.printf("[%4d] %c %d", 3, '+', 4); // �ڸ��� ����, ������ ����
		System.out.printf("[%-4d] %c %d", 3, '+', 4); // �ڸ��� ����, ���� ����
		System.out.printf("[%04d] %c %d", 3, '+', 4); // ���ڸ� 0���� ä���
		
	}
}
