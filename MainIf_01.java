package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 비교문, 조건문, Conditional Statement
		
		// Property
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String result = ""; // 판단 결
		
		// Input
		// 2개 숫자 받아오
		System.out.print("첫번째 숫자를 입력하세요 : ");
		num1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		
		// Process & Output
		// num1이 num2보다 큰지 작은지 판단
		if (num1 > num2) {
			result = "보다 큽니다.";
		}
		else if (num1 == num2) {
			result = "와 같습니다.";
		}
		else {
			result = "보다 작습니다.";
		}
		System.out.println(num1 + 
				"이 " + num2 + result);
		
		System.out.println("End"); 

	}

}
