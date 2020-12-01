package B_조건문;

import java.util.Scanner;

public class munjae_03 {
	/* <ex> 화면에 출력함
	*** 초기 메뉴 ***
	1. 입력
	2. 수정
	3. 조회
	4. 삭제
	7. 종료
	메뉴번호 입력 : 번호입력받음
	=> 처리내용 : 
		1 입력 --> "입력메뉴가 선택되었습니다."
		2 입력 --> "수정메뉴가 선택되었습니다."
		3 입력 --> "조회메뉴가 선택되었습니다."
		4 입력 --> "삭제메뉴가 선택되었습니다."
		7 입력 --> "프로그램이 종료됩니다."
		다른값 입력시 "번호가 잘못 입력되었습니다."
			  "다시 입력하십시오." 출력되게 함 */
	
	
	public void munjae_03() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 입력하세요 : ");
		
		int num;
		num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("입력메뉴가 선택되었습니다."); break; 
		case 2 : System.out.println("수정메뉴가 선택되었습니다."); break;
		case 3 : System.out.println("수정메뉴가 선택되었습니다."); break;
		case 4 : System.out.println("수정메뉴가 선택되었습니다."); break;
		case 7 : System.out.println("수정메뉴가 선택되었습니다."); break;
	    default : System.out.println("숫자 1,2,3,4,7만 가능합니다. "); break;
	}
	}
	// break;를 하지 않으면 번호를 선택 할 시 전체 메뉴가 나옴. 
	
	public static void main(String[] args) {
		munjae_03 m3 = new munjae_03();
		m3.munjae_03();
			
	}

}
