package mx.edu.iems.inventario.model;

// Generated 14/05/2013 11:10:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Nobreak generated by hbm2java
 */
public class Nobreak implements java.io.Serializable {

	private int idnobreak;
	private Empleado empleado;
	private Estadoequipo estadoequipo;
	private Tiponobreak tiponobreak;
	private Usuario usuario;
	private Ubicacion ubicacion;
	private String serie;
	private int progresivo;
	private String observacion;
	private String fechaalta;
	private Set computadoras = new HashSet(0);

	public Nobreak() {
	}

	public Nobreak(int idnobreak, Empleado empleado, Estadoequipo estadoequipo,
			Tiponobreak tiponobreak, Usuario usuario, Ubicacion ubicacion,
			String serie, int progresivo, String observacion, String fechaalta) {
		this.idnobreak = idnobreak;
		this.empleado = empleado;
		this.estadoequipo = estadoequipo;
		this.tiponobreak = tiponobreak;
		this.usuario = usuario;
		this.ubicacion = ubicacion;
		this.serie = serie;
		this.progresivo = progresivo;
		this.observacion = observacion;
		this.fechaalta = fechaalta;
	}

	public Nobreak(int idnobreak, Empleado empleado, Estadoequipo estadoequipo,
			Tiponobreak tiponobreak, Usuario usuario, Ubicacion ubicacion,
			String serie, int progresivo, String observacion, String fechaalta,
			Set computadoras) {
		this.idnobreak = idnobreak;
		this.empleado = empleado;
		this.estadoequipo = estadoequipo;
		this.tiponobreak = tiponobreak;
		this.usuario = usuario;
		this.ubicacion = ubicacion;
		this.serie = serie;
		this.progresivo = progresivo;
		this.observacion = observacion;
		this.fechaalta = fechaalta;
		this.computadoras = computadoras;
	}

	public int getIdnobreak() {
		return this.idnobreak;
	}

	public void setIdnobreak(int idnobreak) {
		this.idnobreak = idnobreak;
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

	public Tiponobreak getTiponobreak() {
		return this.tiponobreak;
	}

	public void setTiponobreak(Tiponobreak tiponobreak) {
		this.tiponobreak = tiponobreak;
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
