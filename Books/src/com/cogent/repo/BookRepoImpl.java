package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.BookBean;

public class BookRepoImpl implements BookRepo {

	List<BookBean> books = new ArrayList<>();

	{
		books.add(new BookBean(1001, "Learn Java in 2 mins", "Samuel", 110));
		books.add(new BookBean(1002, "Learn Spring in 2 mins", "Bryan", 210));
		books.add(new BookBean(1003, "Learn Angular in 2 mins", "Ashley", 250));

		books.add(new BookBean(1004, "Learn React in 2 mins", "Rob", 350));
		books.add(new BookBean(1005, "Learn Vue in 2 mins", "Dan", 450));
		books.add(new BookBean(1006, "Learn SQL in 2 mins", "Sam", 550));
	}

	@Override
	public void addBook(BookBean bookBean) {
		// TODO Auto-generated method stub
		books.add(bookBean);
	}

	@Override
	public void deleteBookById(int bookId) {
		for (BookBean e : books) {
			if (e.getBookId() == bookId)
				books.remove(bookId);
		}
	}

	@Override
	public BookBean findBookById(int bookId) {
		BookBean book = null;
		for (BookBean e : books)
			if (e.getBookId() == bookId)
				book = e;
		return book;
	}

	@Override
	public BookBean findBookByAuthor(String author) {
		BookBean book = null;
		for (BookBean e : books)
			if (e.getBookAuthor().toString().equals(author))
				book = e;
		return book;
	}

	@Override
	public List<BookBean> findBookWithPriceRange(double minPrice, double maxPrice) {
		List<BookBean> bookList = new ArrayList<>();
		for (BookBean e : books)
			if (minPrice < e.getPrice() &&  e.getPrice() < maxPrice)
				bookList.add(e);
			return bookList;
	}

}
