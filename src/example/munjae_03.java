package example;

import java.util.Scanner;

public class munjae_03 {
	/*=> 메소드명 : public void example3(){}
	 => 실행내용 : 영어 문자열 값을 키보드로 입력받아
		각 자리의 문자를 출력
	 => 입력예
		문자열을 입력하시오 : apple
	 => 출력예 (3개만 출력해 봄)
		첫번째 문자 : a
		두번째 문자 : p */
	
	public void munjae_03() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영어단어를 입력하세요 : ");
		String word = sc.next();
		
		System.out.println("첫번쨰 글자 " + word.charAt(0));
		System.out.println("두번째 글자 " + word.charAt(1));
		System.out.println("세번째 글자 " + word.charAt(2));
		System.out.println("네번째 글자 " + word.charAt(3));
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		munjae_03 m3 = new munjae_03();
		
		m3.munjae_03();
		
	

	}

}
