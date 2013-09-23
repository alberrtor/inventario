package mx.edu.iems.inventario.services;

import java.util.List;

import mx.edu.iems.inventario.dao.UsuarioDao;
import mx.edu.iems.inventario.model.Usuario;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioService {
	@Autowired
	private UsuarioDao usuarioDao;

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
	public List<Usuario> listar(){
		return usuarioDao.list();
	}
	
	public void insertar(Usuario u){
		usuarioDao.save(u);
	}
	
	public void actualizar(Usuario u){
		usuarioDao.update(u);
	}
	
	public void eliminar(Usuario u){
		usuarioDao.delete(u);
	}
	public boolean isCorrect(String login, String password){
		Usuario u = usuarioDao.buscarUsuarioPorLogin(login);
		
		//Checa que el usuario esté en la bd y que ademas coincida el password
		if (u != null && u.getPassword().equals(password))
			return true;
		else
			return false;
	}
	
	public Usuario findById(Integer id){
		return usuarioDao.get(id);
	}
	public Usuario findByLogin(String login){
		return usuarioDao.buscarUsuarioPorLogin(login);
	}
	
	public List<Usuario> findByCriteria(DetachedCriteria dc, int from, int size) {
		Criteria criteria = dc.getExecutableCriteria(usuarioDao
				.getSessionFactory().getCurrentSession());
		criteria.setFirstResult(from);
		criteria.setMaxResults(size);
		return criteria.list();
	}

	public int countByCriteria(DetachedCriteria dc) {
		Session session = usuarioDao.getSessionFactory().getCurrentSession();
		Transaction t = session.beginTransaction();
		Criteria criteria = dc.getExecutableCriteria(session);
		criteria.setProjection(Projections.rowCount());
		int count = ((Long) criteria.list().get(0)).intValue();
		return count;
	}
}
