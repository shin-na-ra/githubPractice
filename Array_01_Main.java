package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		String[] weekDay = {"abc", "bbc", "cbs", "cna", "ny", "mbc", "kbs"};
		String[] weekDays = new String[7];
		
		weekDays[0] = "일요일";
		weekDays[1] = "월요일";
		weekDays[2] = "화요일";
		weekDays[3] = "수요일";
		weekDays[4] = "목요일";
		weekDays[5] = "금요일";
		weekDays[6] = "토요일";
		
		weekDay[0] = "ABC";
		
		for (int i = 0; i < weekDay.length; i++) {
//			if (i % 2 == 0) {
			System.out.println(weekDay[i]);
//			}
		}
		
//		int count = 0;
//		
//		while (count < weekDays.length) {
//				System.out.println(weekDays[count]);
//				count++;
//		}
		
	}

}
