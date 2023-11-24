package com.javelec.base;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
//		BMI
//		BMI 범위	분류
//		18.5 미만	저체중
//		18.5 이상 22.9 미만	정상
//		23.0 이상 24.9 미만	과체중
//		25.0 이상 29.9 미만	경도 비만
//		30.0 이상 34.9 미만	중등도 비만
//		35.0 이상	고도 비만
//
		
//
//		공식 = 몸무게 / (키) 제곱
		
		// Property
		Scanner scanner = new Scanner(System.in);
		String result = "";

		double BMI;
		
			
		// Input
		System.out.println("** BMI 계산기 **");
		System.out.print("키(cm)를 입력하세요 : ");
		double height = scanner.nextDouble();
		System.out.print("몸무게(kg)를 입력하세요 : ");
		double weight = scanner.nextDouble();
		
		
		// Process & Input
		height = height / 100;
		BMI = weight / (height * height);
		String resultFormat = String.format("%.1f", BMI);
		
		
		if (BMI <= 18.4) result = "저체중";
		else if (BMI <= 22.9) result = "정상체중";
		else if (BMI <= 24.9) result = "과체중";
		else if (BMI <= 29.9) result = "비만";
		else if (BMI > 29.9) result = "고도비만";
		else result = "다시 입력하세요.";
		
		
		
		System.out.printf("\nBMI 수치는 " + resultFormat + "입니다.");
		System.out.println("\n(결과) 귀하는 " + result + "입니다.");
		
//		String resultFormat = String.format("%.1f", result);
//		
//		System.out.printf("(결과) 귀하는 " + resultFormat + "입니다.");
		
		
//  160 | 55 | 22.5 | 정상 | | 170 | 65 | 24.2 | 과체중 | 
//		| 180 | 75 | 27.2 | 경도 비만 | | 190 | 85 | 30.0 | 중등도 비만 |
//		| 200 | 95 | 32.5 | 고도 비만 | | 150 | 30 | 16.7 | 저체중 | 
//		| 160 | 40 | 18.7 | 저체중 | | 170 | 50 | 20.8 | 저체중 | 
	}

}
