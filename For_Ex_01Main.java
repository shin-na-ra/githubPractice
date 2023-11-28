package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		1. 시작하는 숫자를 정하세요 : 1000
//		2. 범위의 끝 숫자를 정하세요 : 5
//		3. 원하는 배수는 ? 5
//
//
//
//		결과
//		5부터 1000의 범위 중 5의 배수의 숫자 갯수는 100개이고 합은 50000 입니다.
//		5의 배수의 평균은 500이고,
//		5의 배수의 숫자 중 최대 숫자는 995이고 최소 숫자는 5입니다.
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		int count = 0; 				// 배수 숫자 갯수 카운트
		int sum = 0;   				// 숫자의 합
		int startNum = 0, num1 = 0;	// 시작  번호
		int lastNum = 0,  num2 = 0;	// 범위의 끝 번호
		
		
		System.out.print("시작하는 숫자를 정하세요 : ");
		num1 = scanner.nextInt(); 
		System.out.print("범위의 끝 숫자를 정하세요 : ");
		num2 = scanner.nextInt(); 
		System.out.print("원하는 배수는? ");
		int multiNum = scanner.nextInt(); // 배수 설정 변수
		
		if (num1 > num2) { // 시작과 끝의 숫자가 뒤집혀도 값이 나올 수 있게끔 if문으로 초기값 설정
			startNum = num2;
			lastNum = num1;
		}
		
		else {
			startNum = num1;
			lastNum = num2;
		}
		
		
		for (int i = startNum; i <= lastNum; i += multiNum) {
			count++;
			sum += i;
			
			
		}
		
		System.out.println("\n결과");
		System.out.println(lastNum + "부터 " + startNum + "의 범위 중 " + multiNum + "의 배수의 숫자 갯수는 " + count + "개이고 합은 " + sum);
		System.out.println(multiNum + "의 배수의 평균은 " + ((double)sum / count ) + "이고,");
		System.out.println(multiNum + "의 배수의 숫자중 최대 숫자는 " + lastNum + "이고 최소 숫자는 " + startNum);
		

	}

}
