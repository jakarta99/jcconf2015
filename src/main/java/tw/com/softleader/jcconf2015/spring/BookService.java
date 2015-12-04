package tw.com.softleader.jcconf2015.spring;

import java.util.List;

import tw.com.softleader.jcconf2015.entity.Book;

public interface BookService {
	public List getAll();
	public void insert(Book book);
}
