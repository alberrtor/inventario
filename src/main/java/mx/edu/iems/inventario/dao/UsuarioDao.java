package mx.edu.iems.inventario.dao;

import java.util.List;

import mx.edu.iems.inventario.model.Area;
import mx.edu.iems.inventario.model.Usuario;

public class UsuarioDao extends GenericDao<Usuario, Integer>{
	public List<Usuario> list() {
		return (List<Usuario>)getHibernateTemplate().find("FROM Usuario a left join fetch a.computadoras left join fetch a.cpus left join fetch a.empleados left join fetch a.monitors" +
				" left join fetch a.nobreaks ");
	}
	
	public Usuario buscarUsuarioPorLogin(String login) {
		String hql = "FROM Usuario WHERE login like '" + login + "%'";
		List<Usuario> usuario = getHibernateTemplate().find(hql);
		
		if(!usuario.isEmpty())
			return usuario.iterator().next();
		else
			return null;
	}
}
