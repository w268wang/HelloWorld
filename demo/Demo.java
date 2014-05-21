package demo;

import java.util.Calendar;

public class Demo {
	
	
	static int calculateAge(int Year, int Month, int Day) {
		int extra = 0;
		int base = 0;
		int thisYear;
		int thisMonth;
		int thisDay;
		
		Calendar thisDate = Calendar.getInstance();
		System.out.println(System.nanoTime());
		thisYear = thisDate.get(Calendar.YEAR);
		thisMonth = thisDate.get(Calendar.MONTH);
		thisDay = thisDate.get(Calendar.DAY_OF_MONTH);
		System.out.println(thisYear+" "+thisMonth+" "+thisDay);
		base = thisYear - Year - 1;
		
		if(thisMonth>Month||(thisMonth==Month&&thisDay>Day)){
			extra = 1;
		}
		
		return base+extra;
	}
	
	public static void main(String[] args) {
		
		int age = calculateAge(1995, 8, 16);
		System.out.println(age);

	}

}
