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
public class MainProp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File cFile = new File("src/com/cogent/properties/config.properties");
		try {
			FileInputStream fis = new FileInputStream(cFile);
			Properties prop = new Properties();
			prop.load(fis);
			System.out.println(prop);
			System.out.println();
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("URL"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
