package com.cogent.properties;

import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * @author dick
 *
 * 5 окт. 2022 г.
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File cFile = new File("/Users/dick/git/cogent/Day13_MapInterface/src/com/cogent/properties/config.properties");
		try {
			FileInputStream fis = new FileInputStream(cFile);
			Properties prop = new Properties();
			prop.load(fis);
			System.out.print(prop.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
