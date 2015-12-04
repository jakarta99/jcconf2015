package tw.com.softleader.jcconf2015.strtus;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

import tw.com.softleader.jcconf2015.ejb.BookHome;

public class BookFacade {

	public List getAllBooks() {
		try {
			Context context = new InitialContext();
			Object ref = context.lookup("java:/comp/env/ejb/BookEJB");
			BookHome bookHome
				= (BookHome) PortableRemoteObject.narrow(ref, BookHome.class);
			
			return bookHome.getAll();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
		
	}
}

