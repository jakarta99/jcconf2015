package tw.com.softleader.jcconf2015.ejb;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface BookHome extends EJBHome {
	public List getAll() throws CreateException, RemoteException;
}
