package B_���ǹ�;

import java.util.Scanner;

public class munjae_01 {
	/*- �޼ҵ� �� ���� ���� : 
	  1. ���� ���� ����
	  2. Ű����� ���� ���� �ϳ� �Է¹���
	  3. �Է¹��� ������ ����̸� "�����." ���
	     ����� �ƴϸ� "����� �ƴϴ�." ���
	  4. main ���� ���� �׽�Ʈ��.*/
	
	public void munjae_01() {
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		a = sc.nextInt();
		
		if(a % 2 == 0){
			System.out.println("�����Դϴ� ");
		}else {
			System.out.println("������ �ƴմϴ� " );
		}
		
		
		
	}
	
	public static void main(String[] args) {
		munjae_01 m1 = new munjae_01();
		
		m1.munjae_01();

	}

}
