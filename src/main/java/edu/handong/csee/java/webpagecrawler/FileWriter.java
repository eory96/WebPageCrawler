package edu.handong.csee.java.webpagecrawler;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * Generate results in the directory you typed.
 * @author gimdaegyo
 *
 */
public class FileWriter {
	/**
	 * you just typed directory path name
	 * However, the results will be saved as index.html in your directory.
	 * @param args
	 * @throws FileNotFoundException
	 */
	public void saveToHtml(String args) throws FileNotFoundException {
		
		PrintWriter outputStream = new PrintWriter (args+"/index.html");
		
		for(String line : ReadURL.arr) {
			outputStream.println (line);
		}
		outputStream.close();
		System.out.println("I make html file!!");
	}
}
