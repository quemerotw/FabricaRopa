package fabrica;

public class Fabrica {
	
	private String nombre; 
	private Prenda[] prendas;
	private Empleado[] empleados;
	
	public Fabrica() {
		
	}
	
	public Fabrica(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Prenda[] getPrendas() {
		return prendas;
	}


	public void setPrendas(Prenda[] prendas) {
		this.prendas = prendas;
	}


	public Empleado[] getEmpleados() {
		return empleados;
	}


	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}
	
	
	public void listarCostos(){
		for(Prenda prendaAux :this.prendas) {
			double costoTotal =0;
			System.out.println(String.format("Nombre de la Prenda: %s\nProcesos: ",prendaAux.getNombre()));
			for(Proceso procesoAux: prendaAux.getProcesos()) {
				System.out.println(String.format("%s",procesoAux.getNombre()));
				costoTotal = costoTotal + procesoAux.calcularCosto();
			}
			System.out.println(String.format("Costo Total: $ %.2f \n", costoTotal));
		}
	}
	

}
