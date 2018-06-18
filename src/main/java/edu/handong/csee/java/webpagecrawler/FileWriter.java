package edu.handong.csee.java.webpagecrawler;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileWriter {
	public void saveToHtml(String args) throws FileNotFoundException {
		ReadURL reader = new ReadURL();
		ArrayList<String> save = new ArrayList<String>();
		
		PrintWriter outputStream = new PrintWriter (args);
		
		for(String line : reader.arr) {
			outputStream.println (line);
		}
		outputStream.close();
		System.out.println("I make html file!!");
	}
}
