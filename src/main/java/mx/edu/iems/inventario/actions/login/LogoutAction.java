package mx.edu.iems.inventario.actions.login;

import java.util.Map;

import mx.edu.iems.inventario.dao.AreaDao;
import mx.edu.iems.inventario.services.EncriptaService;
import mx.edu.iems.inventario.services.UsuarioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {
	private static final Logger log = LoggerFactory
			.getLogger(LogoutAction.class);
	
	String password;
	

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * Método por que se ejecuta por default cuando se llama el action
	 * autentificaUsuario
	 */
	public String execute() {
		password = null;
		
		Map session = ActionContext.getContext().getSession();
		session.remove("haysession");
		return SUCCESS;

	}
}
