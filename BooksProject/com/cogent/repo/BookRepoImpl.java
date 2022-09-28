/**
 * 
 */
package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.BookBean;

/**
 * @author Jayant Surya
 * @date: Sep 28, 2022
 * 
 */
public class BookRepoImpl implements BookRepo {

	//Repository- Database
	List<BookBean> books = new ArrayList();
	{
		books.add(new BookBean(1, "Learn Java in 2 mins", "Samuel", 110));
		books.add(new BookBean(2, "Learn Spring in 2 mins", "Bryan", 210));
		books.add(new BookBean(3, "Learn Angular in 2 mins", "Ashley", 250));
	}
	
	@Override
	public void addBook(BookBean bookBean) {
		books.add(bookBean);
	}

	@Override
	public void deleteBookById(int bookId) {

	}

	@Override
	public BookBean findBookById(int bookId) {
		BookBean book=null;
		for(int i=0; i<books.size();i++) {
			book=books.get(i);
			if(book.getBookId()==bookId) {
				System.out.println("Book Found in Repository");
				return book;
			}
			book=null;
		}
		return book;
	}

	@Override
	public BookBean findBookByAuthor(String author) {
		return null;
	}

	@Override
	public List<BookBean> findBookWithPriceRange(double minPrice, double maxPrice) {
		return null;
	}

}
