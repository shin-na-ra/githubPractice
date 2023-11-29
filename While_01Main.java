package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 1부터 100까지 합계 구하기
		int i = 1;
		int sum = 0;
		
		while (true) {
			sum += i;
			i++;
			if (i > 100) break;
		}
		System.out.println(sum);
	}

}
