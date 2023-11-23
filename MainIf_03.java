package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		1. 텃번째 숫자를 입력하세요 : 10
//		 두번째 숫자를 입력하세요 : 20
//		 
//		 결과)두번째 숫자가 10 만큼 큽니다.
//
//		2.첫번째 숫자를 입력하세요 : 20
//			두번째 숫자를 입력하세요 : 10
//		
//			결과 ㅓㅅ째 숫자가 10만큼 큽니다.
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		int userNum1 = scanner.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		int userNum2 = scanner.nextInt();
//		
//		if (userNum1 > userNum2) {
//			System.out.println("첫번째 결과값이 " + (userNum1 - userNum2) + "만큼 더 큽니다.");
//			
//		}
//		else if (userNum1 < userNum2) {
//			System.out.println("두번째 결과값이 " + (userNum2 - userNum1) + "만큼 더 큽니다.");
//			
//		}
//		else {
//			
//			System.out.println("결과값이 같습니다.");
//		}
		
//		1. 국어 점수를 입력하세요!
//		90
//		영어 점수 입력하세요 !
//		80
//		수학 점수를 입력하세요 !
//		70
//		평균 점수 : 80.0
//		국어 점수는 평균 보다 높습니다.
//		영어 점수는 평균 점수 입니다.
//	수학 점수는 평균 보다 낮스빈다.
		Scanner scanner = new Scanner(System.in);
		String resultKR = "";
		String resultENG = "";
		String resultMath = "";
		
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int english = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = scanner.nextInt();
		
		double avg = (korean + english + math) / 3;
		
		// korean
		if (korean > avg) resultKR = "평균 보다 높습니다.";
		else if (korean < avg) resultKR = "평균 보다 낮습니다";
		else resultKR = "평균 점수입니다.";
		
		// english
		if (english > avg) resultENG = "평균 보다 높습니다.";
		else if (english < avg) resultENG = "평균 보다 낮습니다";
		else resultENG = "평균 점수입니다.";
		
		// math
		if (math> avg) resultMath = "평균 보다 높습니다.";
		else if (math < avg) resultMath = "평균 보다 낮습니다";
		else resultMath = "평균 점수입니다.";
		
		System.out.println("\n평균 점수는 : " + avg);
		System.out.println("국어 점수는  " + resultKR);
		System.out.println("영어 점수는 " + resultENG);
		System.out.println("수학 점수는 " + resultMath );
		
	}
}
