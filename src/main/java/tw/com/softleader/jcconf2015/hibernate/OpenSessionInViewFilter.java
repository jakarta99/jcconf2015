package tw.com.softleader.jcconf2015.hibernate;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Session;

public class OpenSessionInViewFilter implements Filter {

	private Session session;

	@Override
	public void init(FilterConfig fc) throws ServletException {
		session = HibernateUtil.getSession();
	}

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain fc) 
			throws IOException, ServletException {
		try {
			session.beginTransaction();
			fc.doFilter(request, response);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
	}

	public void destroy() {

	}

}

