package edu.handong.csee.java.webpagecrawler;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

/**
 * This class allows you to use the cli option.
 * @author gimdaegyo
 *
 */
public class CliRunner {
	
	String addressOfPage;
	
	String outputPath;
	
	boolean help;

	/**
	 * this method have all the necessary methods for the user
	 * get args(from user) and option people can use cmd command with option
	 * @param args
	 */
	public void run(String[] args) {
		Options options = createOptions();

		if(parseOptions(options, args)){
			if (help){
				printHelp(options);
				return;
			}
		}
	}

	private boolean parseOptions(Options options, String[] args) {
		CommandLineParser parser = new DefaultParser();

		try {

			CommandLine cmd = parser.parse(options, args);
			
			addressOfPage = cmd.getOptionValue("u");
			outputPath = cmd.getOptionValue("d");
			help = cmd.hasOption("h");

		} catch (Exception e) {
			printHelp(options);
			return false;
		}

		return true;
	}

	private Options createOptions() {
		Options options = new Options();

		options.addOption(Option.builder("u").longOpt("url")
				.desc("Set a URL")
				.hasArg()
				.argName("URL option")
				.required()
				.build());

		options.addOption(Option.builder("d").longOpt("output")
				.desc("Set a path of a directory that ouput data")
				.hasArg()
				.argName("output option")
				.required()
				.build());
		
		options.addOption(Option.builder("h").longOpt("help")
				.desc("Help")
				.build());

		return options;
	}

	private void printHelp(Options options) {
		HelpFormatter formatter = new HelpFormatter();
		String header = "CLI program";
		String footer ="\nThis program make html file";
		formatter.printHelp("CLIExample", header, options, footer, true);
	}
}