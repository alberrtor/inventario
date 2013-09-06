package mx.edu.iems.inventario.actions.usuario;

import java.util.List;

import mx.edu.iems.inventario.dao.AreaDao;
import mx.edu.iems.inventario.model.Usuario;
import mx.edu.iems.inventario.services.EncriptaService;
import mx.edu.iems.inventario.services.UsuarioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class ListarUsuariosAction extends ActionSupport {
	private static final Logger log = LoggerFactory.getLogger(AreaDao.class);
	private List<Usuario> usuarios;
	// Propiedad que se cargara en el contexto de spring
	@Autowired
	private UsuarioService usuarioService;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	/**
	 * Método que se ejecuta por default cuando se llama el action
	 * listarUsuarios
	 */
	public String execute() {
		usuarios = usuarioService.listar();
		return SUCCESS;
	}
}
