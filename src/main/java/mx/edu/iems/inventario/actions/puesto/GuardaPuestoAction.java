package mx.edu.iems.inventario.actions.puesto;

import java.util.List;

import mx.edu.iems.inventario.dao.PuestoDao;
import mx.edu.iems.inventario.model.Puesto;
import mx.edu.iems.inventario.model.Usuario;
import mx.edu.iems.inventario.services.PuestoService;
import mx.edu.iems.inventario.services.EncriptaService;
import mx.edu.iems.inventario.services.UsuarioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class GuardaPuestoAction extends ActionSupport {
	private static final Logger log = LoggerFactory
			.getLogger(GuardaPuestoAction.class);

	private String oper;
	private String id;
	private String descripcion;
	private String mensajeUsuario;
	private String areascombo;

	// Propiedad que se cargara en el contexto de spring
	@Autowired
	private PuestoService puestoService;
	
	public String getOper() {
		return oper;
	}

	public String getAreascombo() {
		return areascombo;
	}

	public void setAreascombo(String areascombo) {
		this.areascombo = areascombo;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMensajeUsuario() {
		return mensajeUsuario;
	}

	public void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = mensajeUsuario;
	}

	public PuestoService getPuestoService() {
		return puestoService;
	}

	public void setPuestoService(PuestoService puestoService) {
		this.puestoService = puestoService;
	}

	
	/**
	 * Método por que se ejecuta por default cuando se llama el action
	 * autentificaUsuario
	 */
	public String execute() {

		
		
		
		if (oper.equalsIgnoreCase("add")) {
			areascombo = "{value:'SI:SI;NO:NO;'}";
		}
		return SUCCESS;
	}
}
