import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.BookBean;

public class BookRepoImpl implements BookRepo {
	
	List<BookBean> books = new ArrayList<>();

	@Override
	public void addBook(BookBean bookBean) {
		// TODO Auto-generated method stub
		
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
