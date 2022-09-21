/**
 * 
 */
package operators;

/**
 * @author dick
 *
 * 21 сент. 2022 г.
 */
class CheckIfNumberIsEven {

	/**
	 * @param args
	 */
	static boolean isNumberEven(int number) {
		if (number%2 == 0) return true;
		return false;
		
	}
	public static void main(String[] args) {
		int myNum = 13;
		System.out.println("My number is even is " + isNumberEven(myNum));
	}
}
