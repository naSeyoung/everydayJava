package C_�ݺ���;

import java.util.Scanner;

public class munjae_02 {
	/*������ �Է� �޾� 1���� �Է� ���� ��������
	���� Ȧ���� ¦���� �����Ͽ� Ȧ���� ������ 
	¦���� ���ڡ�, �� �ݺ��Ͽ� ��� �ϼ���.
	��) 4�Է� : ���ڼ��� / 5�Է� : ���ڼ��ڼ� ���*/
	
	public void munjae_02() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : " );
		int i = sc.nextInt();
		String str = sc.next();
		
		//for(int s = 0; s <= str.length();  s++) {
		if(i % 2 == 0) {
			 System.out.println("��");
			
		}else {
			System.out.println("��");
			
		}
	//	System.out.println( str.charAt(s));
		//}
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		munjae_02 m2 = new munjae_02();
		
		m2.munjae_02();
	}

}
