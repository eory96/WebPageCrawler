package edu.handong.csee.java.webpagecrawler;

import java.io.FileNotFoundException;

public class RunnerOfCrawler {
	String url;
	String saveString;
	String html;
	boolean help;
	
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("I can't make HTML file!!");
		}
	}
	
}