package com.javalec.base;

public class Main {
	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 2;
		int num3 = 5;
		
		System.out.println("산술 연산자");
		System.out.println("덧셈 : " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("뺄셈 : " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("곱셈 : " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println("나눗셈 몫 : " + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println("나눗셈 나머지 : " + num1 + " % " + num2 + " = " + (num1 % num2));

		System.out.println("\n자동 증감 연산자");
	
		num1 = num1 + 1;
		num1 += 1;
		num1++;
		
		System.out.println("증가 : " + num1);
		num1 = num1 - 1;
		num1 -= 1;
		num1--;
		System.out.println("감소 : " + num1);
		
		System.out.println("\n 동등 비교 관계 연산자");
		System.out.println("num1 == num2 : " + (num1 == num2));
		
		
		// 7이 3의 배수인지 판단 
//		System.out.println("7이 3의 배수인가? : " + (7 % 3 == 0 ? "3의 배수" : "3의 배수 아님"));
//		String result = (7 % 3 == 0 ? "3의 배수" : "3의 배수 아님");
//		System.out.println(result);
		
		String userId = "abcd";
		String userPw = "1234";
		
		String inputId = "qwe";
		String inputPw = "1234";
		
		System.out.println(userId == inputId && userPw == inputPw ? "\n환영합니다" :"\nid나 password를 다시 입력 하세요.");
	
		
	}
}
