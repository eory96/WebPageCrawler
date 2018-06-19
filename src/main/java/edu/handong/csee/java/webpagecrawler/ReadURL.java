package edu.handong.csee.java.webpagecrawler;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
/**
 * this class get url and save url information to arraylist
 * @author gimdaegyo
 *
 */
public class ReadURL {
	/**
	 * This will save the url input value.
	 */
	String urlName;
	/**
	 * This will save the url information
	 */
	static ArrayList<String> arr = new ArrayList<String>();
	/**
	 * this is constructor
	 * @param url
	 */
	public void setUrl(String url) {
		this.urlName = url;
	}
	
	/**
	 * This method reads url and stores its information in an array list.
	 * @throws Exception
	 */
	public void mergeReadLine() throws Exception {
		URL str =new URL(urlName);
		BufferedReader in = new BufferedReader(new InputStreamReader(str.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
        	arr.add(inputLine);
        }
        in.close();
	}
		
}
