package tw.com.softleader.jcconf2015.tiger;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;

import tw.com.softleader.jcconf2015.hibernate.HibernateUtil;

public abstract class GenericDao<T, IdType extends Serializable> {

	private Class<T> persistentClass;

	public GenericDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public List<T> findAll() {
		Session session = HibernateUtil.getSession();
		return (List<T>)session.createCriteria(persistentClass).list();
	}
	
	public T findOne(IdType id) {
		Session session = HibernateUtil.getSession();
		return (T) session.get(persistentClass, id);
	}
	
	public void insert(T entity) {
		Session session = HibernateUtil.getSession();
		session.saveOrUpdate(entity);
	}
}
