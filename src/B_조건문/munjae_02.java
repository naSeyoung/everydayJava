package B_���ǹ�;

import java.util.Scanner;

public class munjae_02 {
	/* 1. �� ���� ���� ���� ����
	   2. Ű����� �� ���� ������ �Է¹޾�, ��, �� �� ��� ¦���� ����
	   3. �� ���� ��, ��, ��, ���� ����� */
	
	
	
	public void munjae_02() {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է��ϼ��� ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % 2 == 0 && b % 2 == 0) {
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
		} else if (a % 2 == 1 ) {
			System.out.println("a�� Ȧ���Դϴ�. ");
			
		} else if (b % 2 == 1){
			System.out.println("b�� Ȧ���Դϴ�. ");
			
		}
	}
		
		
	
	
	public static void main(String[] args) {
		munjae_02 m2 = new munjae_02();
		
		m2.munjae_02();
	
	}

}
