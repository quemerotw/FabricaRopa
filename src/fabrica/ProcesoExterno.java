package fabrica;

public class ProcesoExterno extends Proceso{
	
	private double costoFijo;
	private String nombreEmpresaExterna;
	private Persona personaReferente;
	
	
	public ProcesoExterno() {
		this("");

	}
	public ProcesoExterno(String nombre) {
		this(nombre,"");
	}
	public ProcesoExterno(String nombre, String descripcion) {
		this(nombre, descripcion,10000);
	}
	public ProcesoExterno(String nombre, String descripcion, double costoFijo) {
		super(nombre,descripcion);
		this.costoFijo = costoFijo;
	}
	
	
	public double getCostoFijo() {
		return costoFijo;
	}
	public void setCostoFijo(double costoFijo) {
		this.costoFijo = costoFijo;
	}
	public String getNombreEmpresaExterna() {
		return nombreEmpresaExterna;
	}
	public void setNombreEmpresaExterna(String nombreEmpresaExterna) {
		this.nombreEmpresaExterna = nombreEmpresaExterna;
	}
	public Persona getPersonaReferente() {
		return personaReferente;
	}
	public void setPersonaReferente(Persona personaReferente) {
		this.personaReferente = personaReferente;
	}
	@Override
	public String toString() {
		return String.format("Persona Referente : %s - %s", this.personaReferente.getNombre(), this.personaReferente.getApellido());
	}
	
	public double calcularCosto() {
		return this.costoFijo;
	}
	
	
	
	
	
	
	
	
}
