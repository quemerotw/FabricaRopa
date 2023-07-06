package fabrica;

public class Persona {
	
	
	private String nombre;
	private String apellido;
	private tipoDocumento tipoDocumento; //obligatorio
	private int edad;
	private int numeroDocumento; //obligatorio
	
	
	
	public Persona(tipoDocumento tipoDocumento,int nDocumento) {
		this("Nombre",tipoDocumento,nDocumento);
	}
	public Persona(String nombre, tipoDocumento tipoDocumento,int nDocumento) {
		this("Nombre","Apellido",tipoDocumento,nDocumento);
	}
	
	
	public Persona(String nombre, String apellido,tipoDocumento tipoDocumento,int nDocumento) {
		this("nombre","apellido",20,tipoDocumento,nDocumento);
	}
	
	
	
	public Persona(String nombre,String apellido,int edad,tipoDocumento tipoDocumento,int numeroDocumento) {
		this.apellido=apellido;
		this.nombre=nombre;
		this.edad=edad;
		this.numeroDocumento=numeroDocumento;
		this.tipoDocumento=tipoDocumento;
	}



	
	public int getNumeroDocumento() {
		return numeroDocumento;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}



	public tipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	
}
