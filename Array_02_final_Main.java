package com.javalec.base;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

//		String[] str = {"A", "B"};
//		int[] intNum = {1, 3, 4};
//		double[] douNum = {3.1, 45.2, 6.1};
//		boolean[] boolNum = {true, false};

		// 평균 구하기
//		int[] intNum =  {1, 5, 8, 12, 200, 1002};
//		int sum = 0;
//
//		for (int i = 0; i < intNum.length; i++) {
//			sum += intNum[i];
//		}
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + (sum / (double)intNum.length);
		
//		5단 3단 9단 출력하기
		
		int[] danNum = {5, 3, 9};
		
		
//		for (int i = 0, count = 1; i < danNum.length && count <= 9; i ++) {
//			
//			if (i == 2) {
//				System.out.print(danNum[i] + " X " + count + " = " + (danNum[i]*count) + "\t");
//				i = 0;
//				count ++;
//				System.out.println();
//			}
//			if (i < danNum.length && count < 10) {
//				System.out.print(danNum[i] + " X " + count + " = " + (danNum[i]*count) + "\t");
//				
//
//			}
//
//		}
		
//		int[] danNum2 = {3, 6, 9};
//		
//		for (int i = 1; i <= 9; i++) {
//			for(int j = 0; j < danNum.length; j ++) {
//				System.out.print(danNum[j] + " X " + i + " = " + (danNum[j]*i) + "\t");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < danNum.length; i++) {
//			for(int j = 1; j <= 9; j ++) {
//				System.out.print(danNum[i] + " X " + j + " = " + (danNum[i]*j) + "\t");
//			}
//			System.out.println();
//		}
		int[] ranNum = {3, 6, 35, 1, 24, 66, 931, 351, 23};
		
		int bin;
		
		for (int i = 0; i < ranNum.length; i++) {
			for (int j = i; j > 0; j--) {
				if (ranNum[j] > ranNum[j-1]) {
					bin = ranNum[j];
					ranNum[j] = ranNum[j-1];
					ranNum[j-1] = bin;
 						
				}
			}
		}
		for (int i =0; i < ranNum.length; i++) {
			System.out.println(ranNum[i]);
//			System.out.println("Arrays.sort 내장함수 정렬 " + ranNum[i]);
		}
		
		
		
//		
		
	}

}