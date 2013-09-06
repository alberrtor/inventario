package mx.edu.iems.inventario.services;

import java.util.List;

import mx.edu.iems.inventario.dao.UsuarioDao;
import mx.edu.iems.inventario.model.Usuario;

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
}
