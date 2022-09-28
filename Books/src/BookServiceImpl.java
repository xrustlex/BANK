import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.BookBean;

public class BookServiceImpl implements BookService {

	BookRepo bookRepo = new BookRepoImpl();

	@Override
	public void addBook(BookBean bookBean) {

		bookRepo.addBook(bookBean);

	}

	@Override
	public void deleteBookById(int bookId) {

		bookRepo.deleteBookById(bookId);
	}

	@Override
	public BookBean findBookById(int bookId) {

		return bookRepo.findBookById(bookId);
	}

	@Override
	public BookBean findBookByAuthor(String author) {

		return bookRepo.findBookByAuthor(author);
	}

	@Override
	public List<BookBean> findBookWithPriceRange(double minPrice, double maxPrice) {

		return bookRepo.findBookWithPriceRange(minPrice, maxPrice);
		
	}

}
