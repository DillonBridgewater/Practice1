/**
 * 
 * @author compsci
 *+1 declares class codewordchecker implementing stringchecker
 */
public class CodeWordChecker implements StringChecker{
	/**
	 * declares all appropriate variables
	 */
	private int minLength;
	private int maxLength;
	private String notAllowed;
	/**
	 * 
	 * @param minLen
	 * @param maxLen
	 * @param symbol
	 * declares public codewordchecker(int int string) and codewordchecker( string
	 */
	/**
	 * 
	 * @param minLen
	 * @param maxLen
	 * @param symbol
	 * +1 initialize instance variables in 3 parameter constructor
	 */
	public CodeWordChecker(int minLen, int maxLen, String symbol) {
		minLength = minLen;
		maxLength = maxLen;
		notAllowed = symbol;
	}
	/**
	 * +1 uses uarameter and default values to initialize variables in 1 parameter constructor
	 *
	 */
	public CodeWordChecker(String str) {
		minLength = 6;
		maxLength = 20;
		notAllowed = str;
		
	}
	/**
		 * +4 
		 * +1 declares header: public boolean isValid(String)
		 * +1 checks for length between min and max inclusive
		 * +1 checks for unwanted string
		 * +1 returns true if length is between min and max and does not contain the unwanted string, false otherwise
	 */
	public boolean isValid(String str) {
		return str.length() >= minLength && str.length() <= maxLength && str.indexOf((notAllowed)) == -1;
	}
}