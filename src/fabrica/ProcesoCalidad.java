package fabrica;

public class ProcesoCalidad extends ProcesoInterno{
	
	private double sumaFijaCapacitacion = 0;
	
	
	public ProcesoCalidad() {
		this("");

	}
	
	public ProcesoCalidad(String nombre) {
		this(nombre,"");
	}
	public ProcesoCalidad(String nombre, String descripcion) {
		this(nombre, descripcion,3000);
	}
	public ProcesoCalidad(String nombre, String descripcion, double sumaFijaCapacitacion) {
		super(nombre,descripcion);
		this.sumaFijaCapacitacion = sumaFijaCapacitacion;
	}
	
	public double getSumaFijaCapacitacion() {
		return sumaFijaCapacitacion;
	}
	public void setSumaFijaCapacitacion(double sumaFijaCapacitacion) {
		this.sumaFijaCapacitacion = sumaFijaCapacitacion;
	}
	
	
	@Override
	public double calcularCosto() {
		return super.calcularCosto() + sumaFijaCapacitacion;
	}
	
	
}
