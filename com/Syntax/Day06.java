package com.Syntax;

public class Day06 {
	public static void main (String [] args) {
	// if hour is between 1 -11 = morning
	// if its between 12 - 15 = afternoon	
	// between 16 - 20 = evening 
	// between 21 - 24 = night
	// Print right now is_____
		
		int hour = 13;
		String dayTime;
		
		if(hour>=1 && hour<=11) {
			dayTime ="Morning";
		} else if (hour >=12 && hour <=15){
			dayTime = "afternoon";
		} else if (hour>=16 && hour<=20) {
			dayTime = "it is evening";
		} else if (hour>=21 && hour<=24) {
			dayTime = "night";
		} else {
			dayTime= "You are on the wrong planet, you have more thatn 24 hours in  a day";
		}
	System.out.println(dayTime);
	}

}
