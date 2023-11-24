package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		double sumAvg = 0;
		double sumCount = 0;
		
		int odd = 0;
		double oddAvg = 0;
		double oddCount = 0;
		
		int even = 0;
		double evenAvg = 0;
		double evenCount = 0;
		
		System.out.print("덧셈 시작 수를 입력하세요 : ");
		int startNum = scanner.nextInt();
		System.out.print("덧셈 끝 수를 입력하세요 : ");
		int lastNum = scanner.nextInt();
		
		if (startNum < lastNum) {
			for (int i = startNum; lastNum >= i; i++) {
		
				sum += i;
				sumCount += 1;
				
				if (i % 2 == 0) {
					even += i;
					evenCount += 1;
					}
				else {
					odd += i;
					oddCount += 1;
					}
				}
			sumAvg = sum / sumCount;
			oddAvg = odd / oddCount;
			evenAvg = even / evenCount;
		}
		else if (startNum > lastNum) {
			for (int i = startNum; lastNum <= i; i--) {
				
				sum += i;
				sumCount += 1;
				
				if (i % 2 == 0) {
					even += i;
					evenCount += 1;
					}
				else {
					odd += i;
					oddCount += 1;
					}
				}
			sumAvg = sum / sumCount;
			oddAvg = odd / oddCount;
			evenAvg = even / evenCount;
			
		}
		
		
		
		System.out.println("수 총합 " + sum + "이며 평균은 " + sumAvg);
		System.out.println("홀수 총합 " + odd + "이며 평균은 " + oddAvg);
		System.out.println("짝수 총합 " + even + "이며 평균은 " + evenAvg);

	}

}
