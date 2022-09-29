package com.cogent.client;

import java.util.Scanner;

import com.cogent.bean.BookBean;
/*
 * @author	VADIM
 * @date:	Sep 29, 2022
 */
import com.cogent.service.BookService;
import com.cogent.service.BookServiceImpl;

public class BookLibrary {

	private static void showWelcome() {

		System.out.println("--------------------------");
		System.out.println("    WELCOME TO LIBRARY");
		System.out.println("--------------------------");
		System.out.println("\t MAIN MENU");
		System.out.println("--------------------------");

	}

	private static void showMainMenu() {

		System.out.println(" PLEASE SELECT MENU OPTION");
		System.out.println("--------------------------");
		System.out.println(" TO ADD BOOK\t\t1");
		System.out.println(" TO FIND BOOK\t\t2");
		System.out.println(" TO DELETE BOOK\t\t3");
		System.out.println(" TO VIEW ALL BOOKS\t4");
		System.out.println();
		System.out.println(" TO EXIT ENTER\t\t0");
		System.out.println();
		System.out.print(" YOUR SELECTION\t\t");

	}

	private static void addBook() {
		// TODO Auto-generated method stub
		System.out.println(" ADD BOOK SELECTED");

	}

	private static void findBook() {

		System.out.println(" FIND BOOK SELECTED");
		System.out.println(" ENTER BOOK ID\t");

	}

	private static void deleteBook() {

		System.out.println(" DELETE BOOK SELECTED");
	}

	private static void showAllBooks() {

		System.out.println(" SHOW ALL BOOKS SELECTED");

	}

	private static void quitApp() {

		System.out.println(" ..QUITTING APPLICATION\n");
		System.exit(0);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bookService = new BookServiceImpl();
		Scanner scanner = new Scanner(System.in);
		BookBean bookBean = null;

		showWelcome();
		showMainMenu();

		int userInput = 0;

		do {
			System.out.println();
			showMainMenu();

			userInput = scanner.nextInt();

			switch (userInput) {
			case 0:
				System.out.println();
				quitApp();
			case 1:
				System.out.println();
				addBook();
				break;
			case 2:
				System.out.println();
				findBook();
				break;
			case 3:
				System.out.println();
				deleteBook();
				break;
			case 4:
				System.out.println();
				showAllBooks();
				break;
			default:
				System.out.println();
				System.out.println(" WRONG MENU OPTION SELECTED");
			}
		} while (userInput != 0);
	}
}
