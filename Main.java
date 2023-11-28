package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		
		
		for (int i=1; i <= 9; i ++){
//			if ( i % 2 == 0) {
				for (int j=2; j <= 9; j ++) {
					if ((j*i) % 2 == 0) {
						System.out.print(j + " X " + i + " = " + (j * i)+ "\t");
					
						}
					else if(j % 2 == 1) System.out.print("\t\t");

					}
			System.out.println();
			
		}

	}
}