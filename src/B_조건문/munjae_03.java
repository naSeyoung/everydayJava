package B_���ǹ�;

import java.util.Scanner;

public class munjae_03 {
	/* <ex> ȭ�鿡 �����
	*** �ʱ� �޴� ***
	1. �Է�
	2. ����
	3. ��ȸ
	4. ����
	7. ����
	�޴���ȣ �Է� : ��ȣ�Է¹���
	=> ó������ : 
		1 �Է� --> "�Է¸޴��� ���õǾ����ϴ�."
		2 �Է� --> "�����޴��� ���õǾ����ϴ�."
		3 �Է� --> "��ȸ�޴��� ���õǾ����ϴ�."
		4 �Է� --> "�����޴��� ���õǾ����ϴ�."
		7 �Է� --> "���α׷��� ����˴ϴ�."
		�ٸ��� �Է½� "��ȣ�� �߸� �ԷµǾ����ϴ�."
			  "�ٽ� �Է��Ͻʽÿ�." ��µǰ� �� */
	
	
	public void munjae_03() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��� �Է��ϼ��� : ");
		
		int num;
		num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("�Է¸޴��� ���õǾ����ϴ�."); break; 
		case 2 : System.out.println("�����޴��� ���õǾ����ϴ�."); break;
		case 3 : System.out.println("�����޴��� ���õǾ����ϴ�."); break;
		case 4 : System.out.println("�����޴��� ���õǾ����ϴ�."); break;
		case 7 : System.out.println("�����޴��� ���õǾ����ϴ�."); break;
	    default : System.out.println("���� 1,2,3,4,7�� �����մϴ�. "); break;
	}
	}
	// break;�� ���� ������ ��ȣ�� ���� �� �� ��ü �޴��� ����. 
	
	public static void main(String[] args) {
		munjae_03 m3 = new munjae_03();
		m3.munjae_03();
			
	}

}
