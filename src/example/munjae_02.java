package A_����;

import java.util.Scanner;

public class munjae_02 {
	/*=> �޼ҵ�� : public void example2(){}
	=> ���೻�� : Ű����� ����, ���� ���� �Ǽ������� �Է¹޾�
		�簢���� ������ �ѷ��� ����Ͽ� ���
		������ - ���� : ���� * ����
			   �ѷ� : (���� + ����) * 2
	=> �Է¿�
		���� : 13.5
		���� : 41.7
	=> ��¿�
		���� : 562.95
		�ѷ� : 110.4
	*/

	
	
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ǽ������� ���ΰ��� �Է��ϼ��� : ");
		double width = sc.nextFloat();
		System.out.println("�Ǽ������� ���ΰ��� �Է��ϼ��� : ");
		double height = sc.nextFloat();
		double area = width * height; // ������ ���� 
		double circumference = (width + height) * 2; // 
		System.out.println("area�� ����  : " + area );
		System.out.println("circumference�� ���� : " + circumference );
		area = sc.nextFloat();
		circumference = sc.nextFloat();
	}
	public static void main(String[] args) {
		munjae_02 e2 = new munjae_02();
		e2.example2();
	}
}


