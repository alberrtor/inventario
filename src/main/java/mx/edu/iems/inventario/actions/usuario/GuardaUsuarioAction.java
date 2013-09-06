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

public class GuardaUsuarioAction extends ActionSupport {
	private static final Logger log = LoggerFactory.getLogger(GuardaUsuarioAction.class);

	private String oper;
	private String id;
	private String login;
	private String password;
	private String esadmin;
	private String mensajeUsuario;

	// Propiedad que se cargara en el contexto de spring
	@Autowired
	private UsuarioService usuarioService;

	
	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}
	
	public String getMensajeUsuario() {
		return mensajeUsuario;
	}

	public void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = mensajeUsuario;
	}

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

	public String getEsadmin() {
		return esadmin;
	}

	public void setEsadmin(String esadmin) {
		this.esadmin = esadmin;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	/**
	 * Método por que se ejecuta por default cuando se llama el action
	 * autentificaUsuario
	 */
	public String execute() {
		
		  Usuario u;
		    if (oper.equalsIgnoreCase("add")){
		    	u = new Usuario();
		    	u.setLogin(login);
				u.setPassword(EncriptaService.getPasswordEncripted(password));
				//if (esadmin.equals("") || esadmin.equals("No"))
				//	u.setEsadministrador(false);
				//else
					u.setEsadministrador(true);
				usuarioService.insertar(u);
				log.info("guardado");
		    }else if (oper.equalsIgnoreCase("edit"))
		    {
		        log.debug("Edit Customer");
		        u = new Usuario();
		        u.setIdusuario(Integer.parseInt(id));
		        u.setLogin(login);
		        u.setPassword(password);
		        u.setEsadministrador(true);
		        usuarioService.actualizar(u);
		      }else if (oper.equalsIgnoreCase("del")){
		    	  log.debug("Delete Customer");
			       u = new Usuario();
			       u = new Usuario();
			        u.setIdusuario(Integer.parseInt(id));
			        u.setLogin(login);
			        u.setPassword(password);
			        usuarioService.eliminar(u);
		         
		        }
		      

		      
		      

/*
		System.out.println("ejecutar");
	
		if (!login.equals("") || !password.equals("")) {
			Usuario u = new Usuario();
			u.setLogin(login);
			u.setPassword(EncriptaService.getPasswordEncripted(password));
			if (esadmin.equals("") || esadmin.equals("No"))
				u.setEsadministrador(false);
			else
				u.setEsadministrador(true);

			log.info("entro");
			usuarioService.insertar(u);
			mensajeUsuario = "Good!, usuario guardado";
			
		} else
			mensajeUsuario = "Ups!, datos invalidos";
*/
		return SUCCESS;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

