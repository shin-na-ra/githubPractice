package com.javalec.base;

import java.nio.file.spi.FileSystemProvider;

public class Main {

	public static void main(String[] args) {

//		for (int i = 1 ; i <= 9 ; i ++) {
//			for (int j = 2 ; j <= 9 ; j ++) {
//				if((j*i) % 2 == 0) {
//				System.out.print(j + " * " + i + " = " + (j*i) + "\t");
//				}
//				else if (j % 2 == 1) {
//					System.out.print("\t\t");
//				}
//			}
//			System.out.println();
//		}
		
//		짝수만 출력
//		홀수는 *표시
		
//		for (int i = 1 ; i <= 9 ; i ++) {
//			for (int j = 2 ; j <= 9 ; j ++) {
//				System.out.print(i % 2 == 1 ? j + " X *" + " = " + (j*i) + "\t" : j + " X " + i + " = " + (j*i) + "\t" );
//			}
//			System.out.println();
//		}
	
		for (int loop = 1, dan = 2, count = 1; loop <= 72; loop ++) {
			System.out.print(dan + " X " + count + " = " + (dan * count) + "\t");
			dan++;
			if (dan == 10) {	
				dan = 2;
				count ++ ;
				System.out.println();
			}
		}

	}
}