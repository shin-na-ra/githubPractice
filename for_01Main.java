package com.javalec.base;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// 반복문
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) System.out.println(i + "는 짝수입니다.");
//			else if (i % 2 == 1) System.out.println(i + "는 홀입니다.");
//		}
		
		// 1~10까지의 합계
//		int sumI = 0;
//		for (int i = 1; i <= 10; i++) {
//			
//			sumI += i;
//			
//		}
//		System.out.println("1부터 10까지의 합은 : " + sumI);
		
//		int evenSum = 0;
//		int oddSum = 0;
//		
//		// 1부터 100까지의 홀수 만 출력
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 1) {
//				oddSum += i;
//			}
//			else {
//				evenSum += i;
//			}
//			
//		}
//		System.out.println("1부터 100까지 홀수의 합은 : " +  oddSum);
//		System.out.println("\n1부터 100까지 짝수의 합은 : " +  evenSum);
		
//		덧셈 시작 수를 입력하세요 : 1
//		덧셈 끝 수를 입력하세요 : 10
//		
//		결과 : 1~ 10까지의 합은 55입니다.
//		결과
//		숫자의 총합은 ~ 이며 평균은 ~
//		홀수의 총합은 ~ 이며 평균은 ~
//		짝수의 총합은 ~ 이며 평균은 ~
		Scanner scanner = new Scanner(System.in);
		int sum = 0; 
		int evenSum = 0;
		int oddSum = 0; // 홀
		double count = 0;
		double evenCount = 0;
		double oddCount = 0;
		double avg = 0;
		double evenAvg = 0;
		double oddAvg = 0;
		
//		
		System.out.print("덧셈 시작 수를 입력 : ");
		int startNum =  scanner.nextInt();
		System.out.print("마지막 수를 입력 : ");
		int lastNum =  scanner.nextInt();
		
		if (startNum > lastNum ) {
			
			int setFirst = startNum;
			
			for (int i = startNum; lastNum <= i; i--) {
				sum += i ;
				count += 1;
				
				if (i % 2 == 0) {
					evenSum += i;
					evenCount += 1;
				}
				else {
					oddSum += i;
					oddCount += 1;
				}
				

			}
			avg = sum / count;
			evenAvg = evenSum / evenCount;
			oddAvg = oddSum / oddCount;
			
			System.out.println("\n" + setFirst + " ~ " + lastNum  + "까지의 합은 " + sum + "이며 평균은 " + avg);
			System.out.println("홀수의 총합은 " +  oddSum + "이며 평균은 " + oddAvg);
			System.out.println("짝수의 총합은 " +  evenSum + "이며 평균은 " + evenAvg);
			

		}
		else {
			for (int i = startNum; i <= lastNum ; i++) {
				sum += i;
				count += 1;
				
				if (i % 2 == 0) {
					evenSum += i;
					evenCount += 1;
				}
				else {
					oddSum += i;
					oddCount += 1;
				}

			}
			avg = sum / count;
			evenAvg = evenSum / evenCount;
			oddAvg = oddSum / oddCount;
			
			System.out.println("\n" + startNum + " ~ " + lastNum + "까지의 합은 " + sum + "이며 평균은 " + avg);
			System.out.println("홀수의 총합은 " +  oddSum + "이며 평균은 " + oddAvg);
			System.out.println("짝수의 총합은 " +  evenSum + "이며 평균은 " + evenAvg);

		} 

		
		
		
		
		
		
		
		
		
		
		
//		int[][] score = {
//				{100,200,300},
//				{10,20,30},
//				{1,2,3}
//		};
//		
//		int sum = 0;
//		
//		for (int i = 0; i<score.length; i++) {
//			for (int j = 0; j<score[i].length; j++) {
//				System.out.println(score[i][j]);
//				sum += score[i][j];
//			}
//		}
//		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
