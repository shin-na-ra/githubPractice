package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
//		String[] str = {"A", "B"};
//		int[] intNum = {1, 3, 4};
//		double[] douNum = {3.1, 45.2, 6.1};
//		boolean[] boolNum = {true, false};

		// 평균 구하기
		int[] intNum =  {1, 5, 8, 12, 200, 1002};
		int sum = 0;
		
		for (int i = 0; i < intNum.length; i++) {
			sum += intNum[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / (double)intNum.length);
	}

}
