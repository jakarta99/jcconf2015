package tw.com.softleader.jcconf2015.junit;

import tw.com.softleader.jcconf2015.hibernate.BookDao;

import junit.framework.TestCase;

public class BookDaoTest extends TestCase {

	public void testFindAll() {
		BookDao dao = new BookDao();
		assertEquals(3, dao.findAll().size());
	}
	
}
