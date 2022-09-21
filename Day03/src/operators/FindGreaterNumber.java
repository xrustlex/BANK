/**
 * 
 */
package operators;

/**
 * @author dick
 *
 * 21 сент. 2022 г.
 */
public class FindGreaterNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10, b = 10;
		String res = "none";
		if (a > b) res = "a";
		if (a < b) res = "b";
		System.out.println("The greater number is " + res);
	}

}
