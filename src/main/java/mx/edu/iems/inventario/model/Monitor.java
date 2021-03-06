package mx.edu.iems.inventario.model;

// Generated 14/05/2013 11:10:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Monitor generated by hbm2java
 */
public class Monitor implements java.io.Serializable {

	private int idmonitor;
	private Tipomonitor tipomonitor;
	private Empleado empleado;
	private Estadoequipo estadoequipo;
	private Usuario usuario;
	private Ubicacion ubicacion;
	private String serie;
	private int progresivo;
	private String observacion;
	private String fechaalta;
	private Set computadoras = new HashSet(0);

	public Monitor() {
	}

	public Monitor(int idmonitor, Tipomonitor tipomonitor, Empleado empleado,
			Estadoequipo estadoequipo, Usuario usuario, Ubicacion ubicacion,
			String serie, int progresivo, String observacion, String fechaalta) {
		this.idmonitor = idmonitor;
		this.tipomonitor = tipomonitor;
		this.empleado = empleado;
		this.estadoequipo = estadoequipo;
		this.usuario = usuario;
		this.ubicacion = ubicacion;
		this.serie = serie;
		this.progresivo = progresivo;
		this.observacion = observacion;
		this.fechaalta = fechaalta;
	}

	public Monitor(int idmonitor, Tipomonitor tipomonitor, Empleado empleado,
			Estadoequipo estadoequipo, Usuario usuario, Ubicacion ubicacion,
			String serie, int progresivo, String observacion, String fechaalta,
			Set computadoras) {
		this.idmonitor = idmonitor;
		this.tipomonitor = tipomonitor;
		this.empleado = empleado;
		this.estadoequipo = estadoequipo;
		this.usuario = usuario;
		this.ubicacion = ubicacion;
		this.serie = serie;
		this.progresivo = progresivo;
		this.observacion = observacion;
		this.fechaalta = fechaalta;
		this.computadoras = computadoras;
	}

	public int getIdmonitor() {
		return this.idmonitor;
	}

	public void setIdmonitor(int idmonitor) {
		this.idmonitor = idmonitor;
	}

	public Tipomonitor getTipomonitor() {
		return this.tipomonitor;
	}

	public void setTipomonitor(Tipomonitor tipomonitor) {
		this.tipomonitor = tipomonitor;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Estadoequipo getEstadoequipo() {
		return this.estadoequipo;
	}

	public void setEstadoequipo(Estadoequipo estadoequipo) {
		this.estadoequipo = estadoequipo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Ubicacion getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public int getProgresivo() {
		return this.progresivo;
	}

	public void setProgresivo(int progresivo) {
		this.progresivo = progresivo;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getFechaalta() {
		return this.fechaalta;
	}

	public void setFechaalta(String fechaalta) {
		this.fechaalta = fechaalta;
	}

	public Set getComputadoras() {
		return this.computadoras;
	}

	public void setComputadoras(Set computadoras) {
		this.computadoras = computadoras;
	}

}
