/**
 * 
 */
package com.cogent;

/**
 * @author dick
 *
 *         28 сент. 2022 г.
 */
public class PlayerManager {

	void excercise(Players player) {

		player.excercise();

	}

	public static void main(String[] args) {
		
		new PlayerManager().excercise(new GolfPlayer());

	}

}
