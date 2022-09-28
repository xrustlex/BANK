package com.cogent.bean;

public class BookBean {

	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private double price;

	public BookBean(int bookId, String bookTitle, String bookAuthor, double price) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookBean [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", price="
				+ price + "]";
	}
	
}
