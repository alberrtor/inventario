package mx.edu.iems.inventario.model;

// Generated 14/05/2013 11:10:50 PM by Hibernate Tools 3.4.0.CR1

/**
 * Computadora generated by hbm2java
 */
public class Computadora implements java.io.Serializable {

	private String idcomputadora;
	private Monitor monitor;
	private Empleado empleado;
	private Usuario usuario;
	private Nobreak nobreak;
	private Cpu cpu;
	private String fechaalta;

	public Computadora() {
	}

	public Computadora(String idcomputadora, Monitor monitor,
			Empleado empleado, Usuario usuario, Nobreak nobreak, Cpu cpu,
			String fechaalta) {
		this.idcomputadora = idcomputadora;
		this.monitor = monitor;
		this.empleado = empleado;
		this.usuario = usuario;
		this.nobreak = nobreak;
		this.cpu = cpu;
		this.fechaalta = fechaalta;
	}

	public String getIdcomputadora() {
		return this.idcomputadora;
	}

	public void setIdcomputadora(String idcomputadora) {
		this.idcomputadora = idcomputadora;
	}

	public Monitor getMonitor() {
		return this.monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Nobreak getNobreak() {
		return this.nobreak;
	}

	public void setNobreak(Nobreak nobreak) {
		this.nobreak = nobreak;
	}

	public Cpu getCpu() {
		return this.cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public String getFechaalta() {
		return this.fechaalta;
	}

	public void setFechaalta(String fechaalta) {
		this.fechaalta = fechaalta;
	}

}
