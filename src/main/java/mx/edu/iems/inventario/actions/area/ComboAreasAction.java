package mx.edu.iems.inventario.actions.area;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

public class ComboAreasAction extends ActionSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ComboAreasAction.class);
	private String areascombo;


	public String getAreascombo() {
		return areascombo;
	}


	public void setAreascombo(String areascombo) {
		this.areascombo = areascombo;
	}


	public String execute() {
		areascombo = "{value:'SI:SI;NO:NO;'}";
		return SUCCESS;
	}
}
