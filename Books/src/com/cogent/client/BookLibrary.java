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

	private static void displayMainMenu() {

		System.out.println("--------------------------");
		System.out.println("    WELCOME TO LIBRARY");
		System.out.println("--------------------------");
		System.out.println("\t MAIN MENU");
		System.out.println("--------------------------");
		System.out.println(" PLAESE SELECT MENU OPTION");
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

	private static void findBook(){
		
		System.out.println(" FIND BOOK SELECTED");
	}
	
	private static void deleteBook(){
		
		System.out.println(" DELETE BOOK SELECTED");
	}
	
	private static void showAllBooks(){
		
		System.out.println(" SHOW ALL BOOKS SELECTED");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput = 0;
		BookService bookService = new BookServiceImpl();
		Scanner scanner = new Scanner(System.in);
		BookBean bookBean = null;

		displayMainMenu();
		userInput = scanner.nextInt();
		scanner.nextLine();
		System.out.println();
		
		switch (userInput) {
		case 0 : System.exit(0);
		case 1 : addBook(); break;
		case 2 : findBook(); break;
		case 3 : deleteBook(); break;
		case 4 : showAllBooks(); break;
		default: System.out.println(" PLEASE SELECT OPTION FROM MENU ");
		}

	}

	private static void addBook() {
		// TODO Auto-generated method stub
		System.out.println(" ADD BOOK SELECTED");

	}

}
