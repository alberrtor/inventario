package mx.edu.iems.inventario.dao;

import java.util.List;

import mx.edu.iems.inventario.model.Area;
import mx.edu.iems.inventario.model.Usuario;

public class UsuarioDao extends GenericDao<Usuario, String>{
	public List<Usuario> list() {
		return (List<Usuario>)getHibernateTemplate().find("FROM Usuario");
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
