package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Switch
//		Scanner scanner = new Scanner(System.in);
//		String result = "";
//		
//		System.out.print("숫자를 입력하세요 : ");
//		int inputNum = scanner.nextInt();
		
		// if문
//		if (inputNum % 2 == 0) {
//			result = "짝수";
//		}
//		else {
//			result = "홀수";
//		}
		
		// switch문 
//		switch (inputNum % 2) {
//		case 0: {
//			result = "짝수";
//			break;
//		}
//		case 1: {
//			result = "홀수";
//		}
//	
//		default:
//			break;		
//		}
//		System.out.println("입력하신 숫자 " + inputNum + "는 " + result + "입니다.");
		
//		성적을 입력받아 학점을 입력한다.
//		0점 부터 100점까지의 점수
//		90 ~ 100 A
//		80 ~ 89 B
//		70 ~ 79 C
//		60 ~ 69 D
//		그 외에 F
		Scanner scanner = new Scanner(System.in);
		String result = "";
		
		
		System.out.println("학생 등급 관리 by switch");
		System.out.print("점수를 입력하세요 : ");
		int stuScore = scanner.nextInt();

		if (stuScore > 100 || stuScore < 0) {
			System.out.println("\n정확한 결과값을 입력하세요.");
		
		}
		else {
			switch (stuScore / 10) {
			case 10 : 
			case 9 : {
				result = "A";
				break;
			}
			case 8 : {
				result = "B";
				break;
			}
			case 7 : {
				result = "C";
				break;			
			}
			case 6 : {
				result = "D";
				break;			
			}
			
			default:
				result = "F";
				break;
			}
			System.out.println("\n학생의 성적은 " + result + "입니다.");
		}
	}

}
