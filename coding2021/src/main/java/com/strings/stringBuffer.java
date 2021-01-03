package com.strings;

public class stringBuffer {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		StringBuffer strBuffer = new StringBuffer("Hello there ");		
		
		for (int i=0; i<10000; i++){  
			strBuffer.append("Jake");  
	    }  
		
		System.out.println(String.format("Time Elapsed: %s milliseconds", (System.currentTimeMillis() - startTime)));
		
		
	}
}
