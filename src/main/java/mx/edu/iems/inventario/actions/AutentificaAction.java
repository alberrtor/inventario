package mx.edu.iems.inventario.actions;

import mx.edu.iems.inventario.dao.AreaDao;
import mx.edu.iems.inventario.services.EncriptaService;
import mx.edu.iems.inventario.services.UsuarioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class AutentificaAction extends ActionSupport {
	private static final Logger log = LoggerFactory.getLogger(AreaDao.class);
	
	private String usuario;
	private String password;
	private String mensaje;
	//Propiedad que se cargara en el contexto de spring
	@Autowired
	private UsuarioService usuarioService;
	
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}


	public String getUsuario() {
		return usuario;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * Método por que se ejecuta por default cuando se llama el action autentificaUsuario
	 */
	public String execute(){
		
		if (usuarioService.isCorrect(usuario, EncriptaService.getPasswordEncripted(password)) ){
			log.debug("Usuario correcto" + usuario + password);
			return SUCCESS;
		}else{
			log.debug("Usuario incorrecto");
			mensaje="Usuario o password incorrecto";
			return NONE;
		}
	}
}
