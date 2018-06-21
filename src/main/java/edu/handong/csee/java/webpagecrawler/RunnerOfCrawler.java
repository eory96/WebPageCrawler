package edu.handong.csee.java.webpagecrawler;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * this is main class to run WebPageCrawler
 * @author gimdaegyo
 *
 */
public class RunnerOfCrawler {
	String url;
	String saveString;
	String html;
	boolean help;
	/**
	 * this is main method
	 * this class will receive URL, directory path.
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args){
		RunnerOfCrawler runner = new RunnerOfCrawler();
		runner.run(args);
	}
	
	private void run(String[] args) {
		CliRunner cli =new CliRunner();
		ReadURL url = new ReadURL();
		FileWriter writer = new FileWriter();
		cli.run(args);
		
		url.setUrl(cli.addressOfPage);
		try {
			url.mergeReadLine();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("I can't read given url!!");
		}
		
		
			try {
				writer.saveToHtml(cli.outputPath);
				System.out.println("\ndone");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("\nYou typed wrong directory path. so i can't make file");
			}
		
	}
	
	/*private String parser(String args) {
		String realURL="";
		int http=0;
		int com=0;
		Pattern nameP = Pattern.compile("(.*)(:\\/\\/)(.*)(\\/)(.*)");
		Matcher nameM = nameP.matcher(args);
		
		if(nameM.find()) {
			http=nameM.start(1);
			com=nameM.end(3);
			realURL = args.substring(http, com);
			return realURL;
		}
		else {
			realURL=args;
			return realURL;
		}
	}*/
	
}

//-u http://www.handong.edu -d /Users/gimdaegyo/eclipse-workspace