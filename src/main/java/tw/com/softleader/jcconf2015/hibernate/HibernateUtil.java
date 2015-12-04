package tw.com.softleader.jcconf2015.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable th) {
			throw new ExceptionInInitializerError(th);
		}
	}

	public static Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public static void closeSession() {
		sessionFactory.getCurrentSession().close();
	}
}