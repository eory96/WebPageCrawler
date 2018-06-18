package edu.handong.csee.java.webpagecrawler;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ReadURL {
	//String contentsOfFile;
	String urlName;
	static ArrayList<String> arr = new ArrayList<String>();
	/*public String getContentsOfFile() {
		return contentsOfFile;
	}*/
	
	public void setUrl(String url) {
		this.urlName = url;
	}

	void mergeReadLine() throws Exception {
		URL str =new URL(urlName);
		BufferedReader in = new BufferedReader(new InputStreamReader(str.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
        	arr.add(inputLine);
        }
            //System.out.println(inputLine);
        in.close();
	}
		
}
