package mx.edu.iems.inventario.dao;

import java.util.ArrayList;
import java.util.List;

import mx.edu.iems.inventario.model.Puesto;
import mx.edu.iems.inventario.model.Puesto;
import mx.edu.iems.inventario.model.Usuario;
import mx.edu.iems.inventario.util.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PuestoDao extends GenericDao<Puesto, Integer>{
	private static final Logger log = LoggerFactory.getLogger(PuestoDao.class);
	
	public List<Puesto> list() {
		log.info("Se está consultando la tabla Puesto...");
		//se utiliza eager para que haga una solo consulta
		return (List<Puesto>)getHibernateTemplate().find("FROM Puesto p left join fetch p.area a left join fetch a.puestos left join fetch p.empleados");
		
	}

	public Puesto buscarPuestoPorDescripcion(String descripcion) {
		String hql = "FROM Puesto WHERE login like '" + descripcion + "%'";
		List<Puesto> Puesto = getHibernateTemplate().find(hql);
		
		if(!Puesto.isEmpty())
			return Puesto.iterator().next();
		else
			return null;
	}
	
}
