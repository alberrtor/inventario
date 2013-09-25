package mx.edu.iems.inventario.services;

import java.util.List;

import mx.edu.iems.inventario.dao.AreaDao;
import mx.edu.iems.inventario.dao.UsuarioDao;
import mx.edu.iems.inventario.model.Area;
import mx.edu.iems.inventario.model.Usuario;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

public class AreaService {
	@Autowired
	private AreaDao areaDao;

	public void setAreaDao(AreaDao areaDao) {
		this.areaDao = areaDao;
	}

	public List<Area> listar(){
		return areaDao.list();
	}
	
	public void insertar(Area u){
		areaDao.save(u);
	}
	
	public void actualizar(Area u){
		areaDao.update(u);
	}
	
	public void eliminar(Area u){
		areaDao.delete(u);
	}
		
	public Area findById(Integer id){
		return areaDao.get(id);
	}
	public Area findByLogin(String descripcion){
		return areaDao.buscarAreaPorDescripcion(descripcion);
	}
	
	public List<Area> findByCriteria(DetachedCriteria dc, int from, int size) {
		Criteria criteria = dc.getExecutableCriteria(areaDao
				.getSessionFactory().getCurrentSession());
		criteria.setFirstResult(from);
		criteria.setMaxResults(size);
		return criteria.list();
	}

	public int countByCriteria(DetachedCriteria dc) {
		Session session = areaDao.getSessionFactory().getCurrentSession();
		Transaction t = session.beginTransaction();
		Criteria criteria = dc.getExecutableCriteria(session);
		criteria.setProjection(Projections.rowCount());
		int count = ((Long) criteria.list().get(0)).intValue();
		return count;
	}
}
