
/**
 * @author dick
 *
 * 6 окт. 2022 г.
 */
interface Mainable {
	
	void show();

	static void display() {
		
		System.out.println("DISPLAY");
		
	}
}
class Main {
	
	public static void main(String[] s) {
		
		Mainable.display();
		
	}
}