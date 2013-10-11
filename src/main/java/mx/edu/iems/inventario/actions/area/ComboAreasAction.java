package mx.edu.iems.inventario.actions.area;

import java.util.List;

import mx.edu.iems.inventario.model.Area;
import mx.edu.iems.inventario.services.AreaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class ComboAreasAction extends ActionSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ComboAreasAction.class);
	
	private String data;
	private List<Area> areas;
	@Autowired
	private AreaService areaService;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public AreaService getAreaService() {
		return areaService;
	}

	public void setAreaService(AreaService areaService) {
		this.areaService = areaService;
	}

	public String execute(){
		
		StringBuilder strb =  new StringBuilder();
		areas = areaService.listar();
		strb.append("<selelct>");
		for (Area area: areas){
			strb.append("<option value='");
			strb.append(area.getIdarea());
			strb.append("'>");
			strb.append(area.getDescripcion());
			
			
		}
		strb.append("<select>");
		data = strb.toString();
			
		return SUCCESS;
	}

	public String getJSON(){
		execute();
		
		return SUCCESS;
	}	
}
