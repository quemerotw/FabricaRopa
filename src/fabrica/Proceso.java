package fabrica;

public abstract class Proceso {
	
	private static int contador =0;
	private int codigoUnicoSecuencial;
	private String nombre;
	private String descripcion;
	private Empleado empleadoEncargado;
	
	
	
	public Proceso() {
		this("");
	}
	
	public Proceso(String nombre) {
		this(nombre,"");
	}
	public Proceso(String nombre,String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.codigoUnicoSecuencial = contador;
		contador++;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Empleado getEmpleadoEncargado() {
		return empleadoEncargado;
	}
	public void setEmpleadoEncargado(Empleado empleadoEncargado) {
		this.empleadoEncargado = empleadoEncargado;
	}
	public int getCodigoUnicoSecuencial() {
		return codigoUnicoSecuencial;
	}

	@Override
	public String toString() {
		return String.format("Empleado A Cargo: %s - %s \n",this.empleadoEncargado.getNombre(), this.empleadoEncargado.getApellido());
	}
	
	
	public abstract double calcularCosto();
	
	
	
	
}
