package util;

import java.io.*;

public class FileFunctions {
	
	
	/* Records the string recorded to the file represented by the String
	 * file. Should only be used for quick writes, such as updating a state
	 * data file. Returns value of false if writing failed. Otherwise, value
	 * of true is returned.
	 */
	
	public static boolean record(String recorded, String file) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write(recorded);
			out.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	
	/* Takes a String filestring and replaces any suffixes with the suffix given in the function. Returns the file
	 * formatted so that it can be located in the system.
	 */

	public static String formatFile(String filestring, String basedir, String suffix) {
			String filename = filestring;
			if (filestring.charAt(filestring.length() - 4) == '.') {
				filename = filename.substring(0, filestring.length() - 4);
			}
			return FileFunctions.findDirectory(filename, basedir) + filename + "." + suffix;
		}


	/*Takes the String filepath and either returns the directory extracted from that String or returns the basedirectory
	 * String which represents the default directory where files should be stored normally. Returns the directory of the 
	 * file in filepath as a String.
	 */

	public static String findDirectory(String filepath, String basedirectory) {
		if (filepath.charAt(2) == '\\') {
			for (int i = filepath.length() - 1; i > 0; i--) {
				if (filepath.charAt(i) == '\\') {
					return filepath.substring(0, i + 1);
				}
			}
			return filepath;
		} else {
			return basedirectory;
		}
	}
}
