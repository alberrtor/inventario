package mx.edu.iems.inventario.actions;

import java.util.List;

import mx.edu.iems.inventario.model.Area;
import mx.edu.iems.inventario.services.AreaService;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class AreaAction extends ActionSupport {
	//Propiedad que se enviará en los request y response del action
	private List<Area> areas;
	//Propiedad que se cargara del contexto de spring
	@Autowired
	private AreaService areaService;
	/**
	 * Método necesario para la inyección de depencias de spring
	 * @param areaService
	 */
	public void setAreaService(AreaService areaService) {
		this.areaService = areaService;
	}

	/**
	 * Para el request del action
	 * @return
	 */
	public List<Area> getAreas() {
		return areas;
	}
	/**
	 * Para el response del action
	 * @param areas
	 */
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	/**
	 * Método por que se ejecuta por default cuando se llama el action consultarAreas
	 */
	public String execute(){
		
			
		areas = areaService.listar();
		return SUCCESS;
	}
}
