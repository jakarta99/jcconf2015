package tw.com.softleader.jcconf2015.spring;

import java.util.List;

import tw.com.softleader.jcconf2015.entity.Book;
import tw.com.softleader.jcconf2015.hibernate.BookDao;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	public List getAll() {
		return bookDao.findAll();
	}
	
	public void insert(Book book) {
		bookDao.saveOrUpdate(book);
	}
	
}
