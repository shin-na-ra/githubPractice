package com.javalec.base;

public class Main {
	
	public static void main(String[] args) {
		// 내림차순, 오름차순 정렬 정렬하기
		int [] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
		int temp;
		System.out.println("** 결과값 **");
		for (int i = 1; i < array.length; i ++) { //  리스트의 갯수를 반복한다. 총 반복 12
//			System.out.println("i값 " + i +  " ");
			
			for (int j = i; j > 0; j--) { 		  //  총 1부터 12까지 그 횟수를 계속 반복한다.
//				System.out.println("j값 "+ j + " ");
				
				// 오름차순
//				if (array[j] < array[j-1]) { 
//					temp = array[j]; 
//					array[j] = array[j-1]; 
//					array[j-1] = temp;  
//				}
				// 내림차순
				if (array[j] > array[j-1]) {  
					temp = array[j]; // 현재 데이터(높은 수)를 temp에 저장한다. 
					array[j] = array[j-1]; // 기존의 값 (낮은 데이터)를 현재 값에 넣어준 후 
					array[j-1] = temp; // 기존 값을 큰 수로 변경
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
		

	}
//	public void execute (int x[]) {
//		int b = x.length;
//		
//		for (int v = b / 2 - 1; v >= 0; v--) {
//			func(x, b, v);
//		}
//		
//		// 원소를 하나씩 추출한다.
//		for (int l = b-1; l > 0 ; l--) {
//			//현재 값을 마지막으로 옮긴다.
//			int temp = x[0];
//			x[0] = x[l];
//			x[l] = temp;
//			
//			func(x, l, 0);
//		}
//	}
	
}