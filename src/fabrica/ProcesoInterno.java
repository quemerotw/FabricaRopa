package fabrica;

public class ProcesoInterno extends Proceso{

	private Empleado[] empleados;
	private int cantidadPrendasRealizadas;
	
	
	public ProcesoInterno() {
		this("");

	}
	public ProcesoInterno(String nombre) {
		this(nombre,"");
	}
	public ProcesoInterno(String nombre, String descripcion) {
		this(nombre, descripcion,10);
	}
	public ProcesoInterno(String nombre, String descripcion, int cantidadPrendasRealizadas) {
		super(nombre,descripcion);
		this.setCantidadPrendasRealizadas(cantidadPrendasRealizadas);
	}
	public int getCantidadPrendasRealizadas() {
		return cantidadPrendasRealizadas;
	}
	public void setCantidadPrendasRealizadas(int cantidadPrendasRealizadas) {
		this.cantidadPrendasRealizadas = cantidadPrendasRealizadas;
	}
	public Empleado[] getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}
	
	public double calcularCosto () {
		double sumaSueldos = 0;
		for(Empleado empleadoAux : this.empleados) {
			sumaSueldos = sumaSueldos + empleadoAux.getSueldo();
		}
		return (sumaSueldos / cantidadPrendasRealizadas);
	}
	@Override
	public String toString() {
		String stringAux = "";
		for(Empleado empleadoAux : this.empleados) {
			stringAux = stringAux + String.format("%s - %s - ", empleadoAux.getNombre(),empleadoAux.getApellido());
		}
		return super.toString() + stringAux;
	}
}

