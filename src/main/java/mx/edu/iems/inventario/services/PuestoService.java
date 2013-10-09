package mx.edu.iems.inventario.services;

import java.util.List;

import mx.edu.iems.inventario.dao.PuestoDao;
import mx.edu.iems.inventario.dao.UsuarioDao;
import mx.edu.iems.inventario.model.Puesto;
import mx.edu.iems.inventario.model.Usuario;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

public class PuestoService {
	@Autowired
	private PuestoDao puestoDao;

	public void setPuestoDao(PuestoDao puestoDao) {
		this.puestoDao = puestoDao;
	}

	public List<Puesto> listar(){
		return puestoDao.list();
	}
	
	public void insertar(Puesto u){
		puestoDao.save(u);
	}
	
	public void actualizar(Puesto u){
		puestoDao.update(u);
	}
	
	public void eliminar(Puesto u){
		puestoDao.delete(u);
	}
		
	public Puesto findById(Integer id){
		return puestoDao.get(id);
	}
	public Puesto findByLogin(String descripcion){
		return puestoDao.buscarPuestoPorDescripcion(descripcion);
	}
	
	public List<Puesto> findByCriteria(DetachedCriteria dc, int from, int size) {
		Criteria criteria = dc.getExecutableCriteria(puestoDao
				.getSessionFactory().getCurrentSession());
		criteria.setFirstResult(from);
		criteria.setMaxResults(size);
		return criteria.list();
	}

	public int countByCriteria(DetachedCriteria dc) {
		Session session = puestoDao.getSessionFactory().getCurrentSession();
		Transaction t = session.beginTransaction();
		Criteria criteria = dc.getExecutableCriteria(session);
		criteria.setProjection(Projections.rowCount());
		int count = ((Long) criteria.list().get(0)).intValue();
		return count;
	}
}
