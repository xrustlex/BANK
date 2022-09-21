/**
 * 
 */
package operators;

/**
 * @author dick
 *
 * 21 сент. 2022 г.
 */
public class SwapTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10, b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + "  " + b);
	}

}
