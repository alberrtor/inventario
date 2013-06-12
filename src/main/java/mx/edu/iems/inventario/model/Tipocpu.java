package mx.edu.iems.inventario.model;

// Generated 14/05/2013 11:10:50 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Tipocpu generated by hbm2java
 */
public class Tipocpu implements java.io.Serializable {

	private int idtipocpu;
	private String marca;
	private String modelo;
	private String observacion;
	private Set cpus = new HashSet(0);

	public Tipocpu() {
	}

	public Tipocpu(int idtipocpu, String marca, String modelo,
			String observacion) {
		this.idtipocpu = idtipocpu;
		this.marca = marca;
		this.modelo = modelo;
		this.observacion = observacion;
	}

	public Tipocpu(int idtipocpu, String marca, String modelo,
			String observacion, Set cpus) {
		this.idtipocpu = idtipocpu;
		this.marca = marca;
		this.modelo = modelo;
		this.observacion = observacion;
		this.cpus = cpus;
	}

	public int getIdtipocpu() {
		return this.idtipocpu;
	}

	public void setIdtipocpu(int idtipocpu) {
		this.idtipocpu = idtipocpu;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Set getCpus() {
		return this.cpus;
	}

	public void setCpus(Set cpus) {
		this.cpus = cpus;
	}

}
