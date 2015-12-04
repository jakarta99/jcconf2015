package tw.com.softleader.jcconf2015.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import tw.com.softleader.jcconf2015.entity.Book;

@Repository
public class BookDao {

	public List findAll() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Book");
		List list = query.list();
		
		HibernateUtil.closeSession();
		return list;
	}
	
	public void saveOrUpdate(Book book) {
		Session session = HibernateUtil.getSession();
        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(book);
        tr.commit();
        HibernateUtil.closeSession();
	}
}
