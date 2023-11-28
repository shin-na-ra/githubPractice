package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		
		
		for (int i=1; i <= 9; i ++){
			if ( i % 2 == 0) {
				for (int j=2; j <= 9; j ++) {
					System.out.print(j + " X " + i + " = " + (j * i) + "\t");
//		
//			System.out.println("==============");
				
				}
			System.out.println("");
			}


//곱해지는 수가 짝수일 때만 출력한

		}

	}
}