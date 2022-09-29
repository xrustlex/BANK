package com.cogent.client;

import java.util.Scanner;

import com.cogent.bean.BookBean;
import com.cogent.service.BookService;
import com.cogent.service.BookServiceImpl;

/*
 * @author	VADIM
 * @date:	Sep 29, 2022
 */

public class BookLibrary {

	private static void mainMenu() {

		System.out.println("--------------------------");
		System.out.println("    WELCOME TO LIBRARY");
		System.out.println("--------------------------");
		System.out.println("\t MAIN MENU");
		System.out.println("--------------------------");
		System.out.println("\tSELECT OPTION");
		System.out.println("--------------------------");
		System.out.println(" TO ADD BOOK\t\t1");
		System.out.println(" TO FIND BOOK\t\t2");
		System.out.println(" TO DELETE BOOK\t\t3");
		System.out.println(" TO VIEW ALL BOOKS\t4");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput = 0;
		BookService bookService = new BookServiceImpl();
		Scanner scanner = new Scanner(System.in);
		BookBean bookBean = null;

		mainMenu();
	}

}
