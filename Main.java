package com.javalec.base;

public class Main {
	public static void main(String[] args) {
		System.out.println("abcd");
		System.out.println("1234");
		System.out.println("대한민국");
		
//		변수
		int num = 10;
		
		System.out.println(num);
		
		int firstNumber = 10;
		int secondNumber = 20;
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber)); // 더하기 
		System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber)); // 빼기 
		System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber)); // 나누기
		System.out.println(firstNumber + " / " + secondNumber + " = " + ((double) firstNumber / secondNumber)); //  곱하기 
		
		/* 변수 작명
			- 변수는 의미 전달
			
		작성 기법 
			1) camel : 2단어의 연결 중 첫번째 단어는 소문자로 시작, 두번째 단어는 대문자로 시작
				ex) appleFruit, firstNumber 
					사용 : 변수 이름, method 이름 
			2) pascal : 2단어의 연결 중 첫번째 단어는 대문자로 시작, 두번째 단어도 대문자로 시작
				ex) AppleFuirt, FirstNumber
					사용 : Class 이름
			3) snake : 2단어의 연결을 "_"로 한다.
				ex) apple_fuirt,  first_number
					사용 : 변수 이름, method 이름 
		*/
		
		// 상수 (Constant)
		final int constNumber = 10; // final 선언 이후 데이터 수정 불 
		
		System.out.println(constNumber);
		
		int intNum1 = 10;
		int intNum2 = 20;
		
		int intNum3 = intNum1 + intNum2;
		
		String str1 = "가나다라마바아사";
		
		boolean boolNum1 = false;
		boolean boolNum2 = true;
		
		if (boolNum1) {
			System.out.println("perfect");
		}
		else if (boolNum2) {
			System.out.println("이");
		}
		String newId = "abcd";
		String newPw = "1234";
		
		String userId = "qwe";
		String userPw = "1234";
		
		System.out.println(newId == inputId && newPw == inputPw ? '환영합니다' :'id나 password를 다시 입력 하세요.');
		
				
		
			
		
		
	}
}
