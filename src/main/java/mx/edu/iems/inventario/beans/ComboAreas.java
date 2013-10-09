package mx.edu.iems.inventario.beans;

import java.util.List;

import mx.edu.iems.inventario.model.Area;
import mx.edu.iems.inventario.services.AreaService;

public class ComboAreas{
	

	
	private String areascombo;


	
	public String getAreascombo() {
	
		areascombo = "{value:'SI:SI;NO:NO;'}";
		return areascombo;
	}


	public void setAreascombo(String areascombo) {
		this.areascombo = areascombo;
	}


	
}
