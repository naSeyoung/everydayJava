package example;

import java.util.Scanner;

public class munjae_01 {

	// ������ Ŀ��  ������ Ŀ�� ��Ȯ�� 
	
	
	/*=> �޼ҵ�� : public void example1(){}
	=> ���೻�� : Ű����� ���� �� ���� �Է¹޾�, �� ���� ��, ��, ��
	�������� ��� ������ ���
	=> �Է¿�
	ù��° ���� : 23
	�ι�° ���� : 7
	=> ��¿�		  ����
	���ϱ� ��� : 30  --> (��1 + ��2)
	���� ��� : 16   --> (��1 - ��2)
	���ϱ� ��� : 161 --> (��1 * ��2)
	�������� �� : 3   --> (��1 / ��2)
	�������� ������ : 2  --> (��1 % ��2)
	*/
		public class example1 { // 201126 �ٽð��ν���  
			
			
			
			
			public void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				
				System.out.println("�� ������ ���� �˾ƺ��ô� ���� �Է��Ͻÿ� ");
				
				System.out.println("ù���� ���� : ");
				int num1 = sc.nextInt();
				System.out.println("�ι��� ���� : ");
				int num2 = sc.nextInt();
				System.out.println(num1 + num2);
				
				System.out.println("�������� ���� ���� ? ");
				
				System.out.println(num1 - num2);
				int minus = sc.nextInt();
				
				
			}
			
}
}

