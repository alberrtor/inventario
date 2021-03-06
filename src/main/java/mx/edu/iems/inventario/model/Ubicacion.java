package mx.edu.iems.inventario.model;

// Generated 14/05/2013 11:10:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Ubicacion generated by hbm2java
 */
public class Ubicacion implements java.io.Serializable {

	private int idubicacion;
	private String descripcion;
	private Set nobreaks = new HashSet(0);
	private Set monitors = new HashSet(0);
	private Set cpus = new HashSet(0);

	public Ubicacion() {
	}

	public Ubicacion(int idubicacion, String descripcion) {
		this.idubicacion = idubicacion;
		this.descripcion = descripcion;
	}

	public Ubicacion(int idubicacion, String descripcion, Set nobreaks,
			Set monitors, Set cpus) {
		this.idubicacion = idubicacion;
		this.descripcion = descripcion;
		this.nobreaks = nobreaks;
		this.monitors = monitors;
		this.cpus = cpus;
	}

	public int getIdubicacion() {
		return this.idubicacion;
	}

	public void setIdubicacion(int idubicacion) {
		this.idubicacion = idubicacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getNobreaks() {
		return this.nobreaks;
	}

	public void setNobreaks(Set nobreaks) {
		this.nobreaks = nobreaks;
	}

	public Set getMonitors() {
		return this.monitors;
	}

	public void setMonitors(Set monitors) {
		this.monitors = monitors;
	}

	public Set getCpus() {
		return this.cpus;
	}

	public void setCpus(Set cpus) {
		this.cpus = cpus;
	}

}
