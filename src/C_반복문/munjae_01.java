package C_�ݺ���;

import java.util.Scanner;

public class munjae_01 { 
	/*������*/
	
	public void gugudan_3() {//3�� �������� �ϼ��ϱ�  
		
		int a = 3;
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(a+" * " + i +" = " + a*i);
		}
	}

	public void selectgugudan() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� ������ ���ڸ� �Է��ϼ��� : ");
		
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
