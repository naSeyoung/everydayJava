package C_반복문;

import java.util.Scanner;

public class munjae_01 { 
	/*구구단*/
	
	public void gugudan_3() {//3단 구구단을 완성하기  
		
		int a = 3;
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(a+" * " + i +" = " + a*i);
		}
	}

	public void selectgugudan() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 구구단 숫자를 입력하세요 : ");
		
		int i = sc.nextInt();
		
		for(int j = 0; j <= 10; j++) {
			System.out.println(i+"*"+j+"="+ i*j);
			
		}
		
	
	}
	
	
	
	public static void main(String[] args) {
		munjae_01 g3 = new munjae_01();
		//g3.gugudan_3();
		g3.selectgugudan();
		
	}
	
	
	
	

}
