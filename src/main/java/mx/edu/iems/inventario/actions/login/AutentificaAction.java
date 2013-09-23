package mx.edu.iems.inventario.actions.login;

import java.util.Map;

import mx.edu.iems.inventario.dao.AreaDao;
import mx.edu.iems.inventario.model.Usuario;
import mx.edu.iems.inventario.services.EncriptaService;
import mx.edu.iems.inventario.services.UsuarioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AutentificaAction extends ActionSupport {
	private static final Logger log = LoggerFactory.getLogger(AutentificaAction.class);

	private String login;
	private String password;
	private String mensaje;
	private Boolean esadministrador;
	private Usuario usuario;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Boolean getEsadministrador() {
		return esadministrador;
	}

	public void setEsadministrador(Boolean esadministrador) {
		this.esadministrador = esadministrador;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	// Propiedad que se cargara en el contexto de spring
	@Autowired
	private UsuarioService usuarioService;

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	/**
	 * Método por que se ejecuta por default cuando se llama el action
	 * autentificaUsuario
	 */
	public String execute() {
		String passwordencriptado = null;
		Map session = ActionContext.getContext().getSession();

		// Encriptamos password
		if (password != null) {
			passwordencriptado = EncriptaService.getPasswordEncripted(password);
		}

		if (session.get("haysession") == null && password != null) {

			if (usuarioService.isCorrect(login, passwordencriptado)) {
				log.debug("Usuario correcto" + login + password);
				usuario = usuarioService.findByLogin(login);
				session.put("haysession", "SI");
				
				
				return SUCCESS;
			} else {
				log.debug("Usuario incorrecto");
				mensaje = "Usuario o password incorrecto";

				return NONE;
			}
		}else if (session.get("haysession") !=null)
			return SUCCESS;
		else 
			return NONE;
		
	}
}
