package kr.ac.kopo.day09;

public class StringMain06 {

	public static void main(String[] args) {
		
		// String과 StringBuffer 비교
		
		long start = System.currentTimeMillis();
		String str = "";
		for(int i = 1; i < 300000; i++) {
			str += i;
		}
		System.out.println(str);
		long end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end - start) / 1000. + "초");
		
		
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 1; i < 300000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end - start) / 1000. + "초");
	}

}
