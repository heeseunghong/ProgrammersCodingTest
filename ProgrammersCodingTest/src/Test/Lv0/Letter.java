package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 편지 - 정답률 89%
public class Letter {

	public static void main(String[] args) {

		/*
		 * 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다.
		 * 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm크기로 적으려고 하며,
		 * 편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 
		 * 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
		 * 
		 */
		
		/*
		 * 제한 사항
		 * - 공백도 하나의 문자로 취급합니다.
		 * - 1 ≤ message의 길이 ≤ 50
		 * - 편지지의 여백은 생각하지 않습니다.
		 * - message는 영문 알파벳 대소문자, ‘!’, ‘~’ 또는 공백으로만 이루어져 있습니다.
		 * 
		 */
		
		System.out.println("[문제 Lv.0 : 편지 (정답률 89%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("편지내용을 입력해주세요 >> ");
		String message = sc.nextLine();
		
		int answer = 0;
		answer = message.length()*2;
		System.out.println("편지 내용 '"+message+"' 의 글자 수가 '"+message.length()+"' 개로 최소 가로 '"+answer+"cm' 의 편지지가 필요합니다.");
		
		
		
	}

}
