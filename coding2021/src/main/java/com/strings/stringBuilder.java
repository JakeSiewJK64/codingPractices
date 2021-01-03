package com.strings;

public class stringBuilder {
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		StringBuilder strBuilder = new StringBuilder();
		
		for (int i=0; i<10000; i++){  
			strBuilder.append("Jake");  
	    }	
		
		System.out.println(String.format("Time Elapsed: %s milliseconds", (System.currentTimeMillis() - startTime)));
	}
	
}
