package mx.edu.iems.inventario.actions.puesto;

import mx.edu.iems.inventario.model.Area;
import mx.edu.iems.inventario.model.Puesto;
import mx.edu.iems.inventario.services.AreaService;
import mx.edu.iems.inventario.services.PuestoService;

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
	private Area area;
	
	
	// Propiedad que se cargara en el contexto de spring
	@Autowired
	private PuestoService puestoService;
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

	public PuestoService getPuestoService() {
		return puestoService;
	}

	public void setPuestoService(PuestoService puestoService) {
		this.puestoService = puestoService;
	}

	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
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
		Puesto p;
		if (oper.equalsIgnoreCase("add")) {
			p = new Puesto();
			p.setDescripcion(descripcion);
			
			Area a = areaService.findById(area.getIdarea());
			log.info("[* " + area.getIdarea() + " *]");
			p.setArea(a);
			puestoService.insertar(p);		
			log.info("!Puesto: " + descripcion + " guardado!");
		} /*else if (oper.equalsIgnoreCase("edit")) {
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
		}*/

		return SUCCESS;
	
	}
		
}
