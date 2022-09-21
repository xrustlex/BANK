/**
 * 
 */
package operators;

/**
 * @author dick
 *
 *         21 сент. 2022 г.
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 123;
		int res = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			res = 10 * res + rem;
			num /= 10;
		}
		System.out.println(res);
	}

}
