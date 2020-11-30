package A_변수;

import java.util.Scanner;

public class munjae_02 {
	/*=> 메소드명 : public void example2(){}
	=> 실행내용 : 키보드로 가로, 세로 값을 실수형으로 입력받아
		사각형의 면적과 둘레를 계산하여 출력
		계산공식 - 면적 : 가로 * 세로
			   둘레 : (가로 + 세로) * 2
	=> 입력예
		가로 : 13.5
		세로 : 41.7
	=> 출력예
		면적 : 562.95
		둘레 : 110.4
	*/

	
	
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실수형으로 가로값을 입력하세요 : ");
		double width = sc.nextFloat();
		System.out.println("실수형으로 세로값을 입력하세요 : ");
		double height = sc.nextFloat();
		double area = width * height; // 면적의 값은 
		double circumference = (width + height) * 2; // 
		System.out.println("area의 값은  : " + area );
		System.out.println("circumference의 값은 : " + circumference );
		area = sc.nextFloat();
		circumference = sc.nextFloat();
	}
	public static void main(String[] args) {
		munjae_02 e2 = new munjae_02();
		e2.example2();
	}
}


