package util;

public class StringFunctions {
	
	
	/* Finds substring searched in the string word and returns
	 * the position where searched starts. If searched is not found,
	 * a value of -1 is returned;
	 */
	
	public static int findSubstring(String word, String searched) {
		for (int i = 0; i < word.length() - 1; i++) {
			if (word.substring(i, i + searched.length()).equals(searched)) {
				return i;
			}
		}
		return -1;
	}
	
	
	/* Finds integer which will center the String currword in a window of width
	 * windowwidth if the characters are uniformly charwidth wide.
	 */
	
	public static int findCenter(String currword, int charwidth, int windowwidth) {
		int strwidth = currword.length() * charwidth;
		int sol = (windowwidth - strwidth) / 2;
		return sol;
	}
}
