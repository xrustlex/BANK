package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.BookBean;

public class BookRepoImpl implements BookRepo {

	List<BookBean> books = new ArrayList<>();
	
	{
		books.add(new BookBean(1, "Learn Java in 2 mins", "Samuel", 110));
		books.add(new BookBean(2, "Learn Spring in 2 mins", "Bryan", 210));
		books.add(new BookBean(3, "Learn Angular in 2 mins", "Ashley", 250));
	}

	@Override
	public void addBook(BookBean bookBean) {
		// TODO Auto-generated method stub
		books.add(bookBean);
	}

	@Override
	public void deleteBookById(int bookId) {
		// TODO Auto-generated method stub

	}

	@Override
	public BookBean findBookById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookBean findBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookBean> findBookWithPriceRange(double minPrice, double maxPrice) {
		// TODO Auto-generated method stub
		return null;
	}

}
