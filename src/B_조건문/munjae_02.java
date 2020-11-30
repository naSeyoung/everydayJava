package B_조건문;

import java.util.Scanner;

public class munjae_02 {
	/* 1. 두 개의 정수 변수 선언
	   2. 키보드로 두 개의 정수를 입력받아, 단, 두 수 모두 짝수일 때만
	   3. 두 수의 합, 차, 곱, 몫을 출력함 */
	
	
	
	public void munjae_02() {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요 ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % 2 == 0 && b % 2 == 0) {
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
		} else if (a % 2 == 1 ) {
			System.out.println("a가 홀수입니다. ");
			
		} else if (b % 2 == 1){
			System.out.println("b가 홀수입니다. ");
			
		}
	}
		
		
	
	
	public static void main(String[] args) {
		munjae_02 m2 = new munjae_02();
		
		m2.munjae_02();
	
	}

}
