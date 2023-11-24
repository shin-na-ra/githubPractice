package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Property
		Scanner scanner = new Scanner(System.in);
		String userId = "root";
		String userPw = "1234";
		
		
		// Input
		System.err.println(" Log in Check ");
		System.out.print("ID를 입력하세요 : ");
		String inputId = scanner.next();
		System.out.print("Password를 입력하세요 : ");
		String inputPw = scanner.next();
		
		if (userId.equals(inputPw) && userPw.equals(inputPw)) {
			System.out.println("로그인이 완료 되었습니다.");
		}
		else { 
			System.out.println("ID나 Password를 확인하세요.");
		}

	}

}
