package example;

import java.util.Scanner;

public class munjae_03 {
	/*=> �޼ҵ�� : public void example3(){}
	 => ���೻�� : ���� ���ڿ� ���� Ű����� �Է¹޾�
		�� �ڸ��� ���ڸ� ���
	 => �Է¿�
		���ڿ��� �Է��Ͻÿ� : apple
	 => ��¿� (3���� ����� ��)
		ù��° ���� : a
		�ι�° ���� : p */
	
	public void munjae_03() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����ܾ �Է��ϼ��� : ");
		String word = sc.next();
		
		System.out.println("ù���� ���� " + word.charAt(0));
		System.out.println("�ι�° ���� " + word.charAt(1));
		System.out.println("����° ���� " + word.charAt(2));
		System.out.println("�׹�° ���� " + word.charAt(3));
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		munjae_03 m3 = new munjae_03();
		
		m3.munjae_03();
		
	

	}

}
