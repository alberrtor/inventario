package mx.edu.iems.inventario.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

import mx.edu.iems.inventario.model.Usuario;
import mx.edu.iems.inventario.util.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class GenericDao<T, ID extends Serializable> extends
		HibernateDaoSupport {
	// Esta variable se utiliza para saber el tipo de clase: Usuario, Area,
	// Puesto, etc.
	private Class<T> clasePersistente;

	public GenericDao() {
		clasePersistente = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public void save(T entidad) throws HibernateException {
		getHibernateTemplate().save(entidad);
	}

	public void update(T entidad) throws HibernateException {
		getHibernateTemplate().update(entidad);
	}

	public void delete(T entidad) throws HibernateException {
		getHibernateTemplate().delete(entidad);
	}

	/**
	 * Regresa una entidad en caso de que encuentre el id
	 * 
	 * @param id
	 * @return
	 * @throws HibernateException
	 */
	public T get(ID id) throws HibernateException {
		return (T) getHibernateTemplate().get(clasePersistente, id);
	}

	

}
