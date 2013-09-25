package mx.edu.iems.inventario.actions.area;

import java.util.List;

import mx.edu.iems.inventario.dao.AreaDao;
import mx.edu.iems.inventario.model.Area;
import mx.edu.iems.inventario.model.Usuario;
import mx.edu.iems.inventario.services.AreaService;
import mx.edu.iems.inventario.services.EncriptaService;
import mx.edu.iems.inventario.services.UsuarioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class GuardaAreaAction extends ActionSupport {
	private static final Logger log = LoggerFactory
			.getLogger(GuardaAreaAction.class);

	private String oper;
	private String id;
	private String descripcion;
	private String mensajeUsuario;

	// Propiedad que se cargara en el contexto de spring
	@Autowired
	private AreaService areaService;
	
	public String getOper() {
		return oper;
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

	public AreaService getAreaService() {
		return areaService;
	}

	public void setAreaService(AreaService areaService) {
		this.areaService = areaService;
	}

	/**
	 * Método por que se ejecuta por default cuando se llama el action
	 * autentificaUsuario
	 */
	public String execute() {

		Area u;
		if (oper.equalsIgnoreCase("add")) {
			u = new Area();
			u.setDescripcion(descripcion);
			
			areaService.insertar(u);		
			log.info("!Area: " + descripcion + " guardado!");
		} else if (oper.equalsIgnoreCase("edit")) {
			log.debug("Edit Area");
			u = new Area();
			u.setIdarea(Integer.parseInt(id));
			u.setDescripcion(descripcion);
			
			areaService.actualizar(u);
			log.info("!Area: " + descripcion + " editado!");
		} else if (oper.equalsIgnoreCase("del")) {
			log.debug("Delete Area");
			u = areaService.findById(Integer.parseInt(id));
			areaService.eliminar(u);
			
			log.info("!Area: " + u.getDescripcion() + " eliminado!");
		}

		return SUCCESS;
	}
}
