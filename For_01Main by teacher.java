package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Property
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, firstNum = 0; // 시작 수
		int num2 = 0, secondNum = 0;  // 끝 수 
		
		// 총합, 총합의 카운
		int sum = 0;
		double sumCount = 0;
		
		// 홀수의 총합, 홀수의 카운
		int oddSum = 0;
		double oddCount = 0;
		
		// 짝수의 총합, 짝수의 카운
		int evenSum = 0;
		double evenCount = 0;
		
		
		// Input
		System.out.print("덧셈 시작 수를 입력하세요 : ");
		num1 = scanner.nextInt();
		System.out.print("덧셈 끝 수를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		
		// Process
		// 끝 수가 시작 수보다 클 경우
		if (num1 > num2) {
			firstNum = num2;
			secondNum = num1;
		}
		// 시작 수 끝 수보다 클 경우
		else{
			firstNum = num1;
			secondNum = num2;
		}
		
		
		for (int i=firstNum; i <= secondNum; i++) {
			
			sum += i; // 총합
			sumCount++; // 총합의 카운트
			
			if (i % 2 == 0) {
				evenSum += i; // 홀수
				evenCount++; // 홀수의 카운트
				}
			else {
				oddSum += i; // 짝수
				oddCount++; // 짝수의 카운트
				}
			
		}
		
		// Output
		System.out.println("1)숫자의 총합 " + sum + "이며 평균은 " + ((double)sum / sumCount));
		System.out.println("2)홀수의 총합 " + oddSum + "이며 평균은 " + ((double)oddSum / oddCount));
		System.out.println("3)짝수의 총합 " + evenSum + "이며 평균은 " + ((double)evenSum / evenCount));

//		덧셈 시작 수를 입력하세요 : 1
//		덧셈 끝 수를 입력하세요 : 10
//		수 총합 55이며 평균은 5.5
//		홀수 총합 25이며 평균은 5.0
//		짝수 총합 30이며 평균은 6.0

	}

}