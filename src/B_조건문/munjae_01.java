package B_조건문;

import java.util.Scanner;

public class munjae_01 {
	/*- 메소드 안 구현 내용 : 
	  1. 정수 변수 선언
	  2. 키보드로 부터 정수 하나 입력받음
	  3. 입력받은 정수가 양수이면 "양수다." 출력
	     양수가 아니면 "양수가 아니다." 출력
	  4. main 에서 실행 테스트함.*/
	
	public void munjae_01() {
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		a = sc.nextInt();
		
		if(a % 2 == 0){
			System.out.println("정수입니다 ");
		}else {
			System.out.println("정수가 아닙니다 " );
		}
		
		
		
	}
	
	public static void main(String[] args) {
		munjae_01 m1 = new munjae_01();
		
		m1.munjae_01();

	}

}
