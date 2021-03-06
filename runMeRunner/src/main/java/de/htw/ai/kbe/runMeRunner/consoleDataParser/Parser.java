package de.htw.ai.kbe.runMeRunner.consoleDataParser;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Class implements ApacheCLI
 *
 */
public class Parser {

	private String propsFileName;
	private String outFileName;

	/**
	 * Method implements Parser
	 * 
	 * @param pArgs
	 */
	public void parseCLI(String[] pArgs) {

		CommandLineParser parser = new DefaultParser();

		Options options = new Options();
		options.addRequiredOption("p", "propsFile", true, "ConfigFile is required");
		options.addRequiredOption("o", "runMeReport", true, "LogFile is required");

		CommandLine commandLine;
		try {
			commandLine = parser.parse(options, pArgs);

			if (commandLine.hasOption("p")) {
				propsFileName = commandLine.getOptionValue("p");
			}

			if (commandLine.hasOption("o")) {
				outFileName = commandLine.getOptionValue("o");
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Getter for propsFileName
	 * 
	 * @return propsFileName
	 */
	public String getPropsFileName() {
		return propsFileName;
	}

	/**
	 * Getter for outFileName
	 * 
	 * @return outFileName
	 */
	public String getOutFileName() {
		return outFileName;
	}

	/**
	 * CLI exceptions
	 */
	class CommandLineException extends Exception {
		private static final long serialVersionUID = 1L;

		public CommandLineException(String pMessage) {
			super(pMessage);
		}
	}

}
