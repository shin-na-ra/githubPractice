package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		사용자에게 금액을 입력는다.
//		그 금액이 8000 보다 크면 너무 비쌉니다
//		그 금액이 5000보다 크면 조금 비쌉니다
//		그 금액이 3000보다 크면 적당한 금액입니다.
//		그 금액이 3000보다 작으면 저렴한 금액입니다.
		
		// Property
		Scanner scan1 = new Scanner(System.in);
//		String result = ""; 
//		
//		// Input
//		System.out.print("금액을 입력하세요 : ");
//		int userMoney = scan1.nextInt();
//		
//		// Process & Output
//		if (userMoney > 8000) {
//			result = "너무 비쌉니다.";
//			
//		}
//		else if (userMoney > 5000) {
//			result = "조금 비쌉니다.";
//			
//		}
//		else if (userMoney > 3000) {
//			result = "적당한 금액입니다.";
//			
//		}
//		else if (userMoney < 3000) {
//			result = "저렴한 금액입니다.";
//			
//		}
//		else {
//			result = "숫자를 입력하세요.";
//			
//		}
//		System.out.println(userMoney + "는 " + result);
		
		
//	사숑자 : 학생의 성적을 입력 받아 학점으로 출력되는 프로그램을 작성해주세요.
		
//		A < 90
//		B < 80
//		C < 70
//		D < 60
//		F < 50
		
		String stuGrade = ""; 
				
		System.out.print("학생의 성적을 입력하세요. : ");
		int stuScore = scan1.nextInt();
		
		if (stuScore > 101 || stuScore < 0) {
			
			stuGrade = "정확한 숫자를 입력하세요.";
		}
		else if (stuScore >= 90) {
			
			stuGrade = "A";
		}
		else if (stuScore >= 80) {
			
			stuGrade = "B";
		}
		else if (stuScore >= 70) {
			
			stuGrade = "C";
		}
		else if (stuScore >= 60) {
			
			stuGrade = "D";
		}
		else {
			stuGrade = "F";
		}
		System.out.println(stuGrade);
		
		

	}

}
