package com.jsonExperimentation;

import org.opencv.core.Core;

import com.sampleLibrary.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

import java.util.stream.IntStream;

import org.json.*;

/*
 * 
 * Maven Repository for JSON libraries: https://mvnrepository.com/artifact/org.json/json/20201115
 * 
 */

public class jsonExperiment {
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	
		// creating the String URL
		String url = new String("https://official-joke-api.appspot.com/random_ten");
		
		try {
			
			// creating the input stream
			InputStream in = new URL(url).openStream();
			// in variable contains the connection to the site and protocol
			System.out.println(in);
					
			// creating BufferedReader to read the URL
			BufferedReader reader = new BufferedReader(new InputStreamReader(in, Charset.forName("UTF-8")));			
			
			// parses the reader variable into the readAll to read all the characters
			String jsonText = readAll(reader);					
			
			JSONObject json = new JSONObject(jsonText);
			
			System.out.println(jsonText);	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// string builder function to get values from json
	private static String readAll(Reader reader) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		int cp;
		
		// reader.read() returns a number
		while((cp = reader.read()) != -1) {
			
			if(cp == '[' || cp == ']') continue;
			else stringBuilder.append((char) cp);
		}
		return stringBuilder.toString();
	}
}
