package com.javalec.base;


public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		
//		System.out.println(dan + "단");
		
		for (int i=1; i <= 9; i ++){
			
			for (int j=2; j <= 9; j ++)
				System.out.print(j + " X " + i + " = " + (j * i) + "\t");
//		
//			System.out.println("==============");
			System.out.println("");
		}
	

	}

}
