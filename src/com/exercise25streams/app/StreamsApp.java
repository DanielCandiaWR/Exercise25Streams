package com.exercise25streams.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class StreamsApp {
	public static void main(String[] args) {
		File myFile = null;
		FileReader myReader = null;
		BufferedReader myBuffer = null;
		String line = "";
		try {
			myFile = new File("E:\\a\\a.txt");
			myReader = new FileReader(myFile);
			myBuffer = new BufferedReader(myReader);
			while((line=myBuffer.readLine())!=null) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				myBuffer.close();
				myFile = null;
				myReader = null;
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
