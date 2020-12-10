package C_반복문;

import java.util.Scanner;

public class munjae_02 {
	/*정수를 입력 받아 1부터 입력 받은 정수까지
	수를 홀수와 짝수를 구분하여 홀수면 “수” 
	짝수면 “박”, 를 반복하여 출력 하세요.
	예) 4입력 : 수박수박 / 5입력 : 수박수박수 출력*/
	
	public void munjae_02() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : " );
		int i = sc.nextInt();
		String str = sc.next();
		
		//for(int s = 0; s <= str.length();  s++) {
		if(i % 2 == 0) {
			 System.out.println("박");
			
		}else {
			System.out.println("수");
			
		}
	//	System.out.println( str.charAt(s));
		//}
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		munjae_02 m2 = new munjae_02();
		
		m2.munjae_02();
	}

}
