package example;

import java.util.Scanner;

public class munjae_01 {

	// 마스터 커밋  마스터 커밋 재확인 
	
	
	/*=> 메소드명 : public void example1(){}
	=> 실행내용 : 키보드로 정수 두 개를 입력받아, 두 수의 합, 차, 곱
	나누기한 몫과 나머지 출력
	=> 입력예
	첫번째 정수 : 23
	두번째 정수 : 7
	=> 출력예		  계산식
	더하기 결과 : 30  --> (값1 + 값2)
	빼기 결과 : 16   --> (값1 - 값2)
	곱하기 결과 : 161 --> (값1 * 값2)
	나누기한 몫 : 3   --> (값1 / 값2)
	나누기한 나머지 : 2  --> (값1 % 값2)
	*/
		public class example1 { // 201126 다시공부시작  
			
			
			
			
			public void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				
				System.out.println("두 정수의 합을 알아봅시다 수를 입력하시오 ");
				
				System.out.println("첫번쨰 정수 : ");
				int num1 = sc.nextInt();
				System.out.println("두번쨰 정수 : ");
				int num2 = sc.nextInt();
				System.out.println(num1 + num2);
				
				System.out.println("두정수의 빼기 값은 ? ");
				
				System.out.println(num1 - num2);
				int minus = sc.nextInt();
				
				
			}
			
}
}

