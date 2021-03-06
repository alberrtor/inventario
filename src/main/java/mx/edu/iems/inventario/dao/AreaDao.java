package mx.edu.iems.inventario.dao;

import java.util.ArrayList;
import java.util.List;

import mx.edu.iems.inventario.model.Area;
import mx.edu.iems.inventario.model.Usuario;
import mx.edu.iems.inventario.util.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AreaDao extends GenericDao<Area, Integer>{
	private static final Logger log = LoggerFactory.getLogger(AreaDao.class);
	
	public List<Area> list() {
		log.info("Se está consultando la tabla area...");
		//se utiliza eager para que haga una solo consulta
		//return (List<Area>)getHibernateTemplate().find("FROM Area a left join fetch a.puestos order by a.idarea");
		return (List<Area>)getHibernateTemplate().find("FROM Area a left join fetch a.puestos e left join fetch e.empleados order by a.idarea");
		
	}

	public Area buscarAreaPorDescripcion(String descripcion) {
		String hql = "FROM Area WHERE descripcion like '" + descripcion + "%'";
		List<Area> area = getHibernateTemplate().find(hql);
		
		if(!area.isEmpty())
			return area.iterator().next();
		else
			return null;
	}
	
}
