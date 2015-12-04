package tw.com.softleader.jcconf2015.tiger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.com.softleader.jcconf2015.entity.Book;
import tw.com.softleader.jcconf2015.hibernate.BookDao;
import tw.com.softleader.jcconf2015.spring.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	public List<Book> getAll() {
		return bookDao.findAll();
	}
	
	public void insert(Book book) {
		bookDao.saveOrUpdate(book);
	}
}


