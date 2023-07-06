package fabrica;

public class Empleado extends Persona {
	
	private double sueldo;
	
	
	
	
	public Empleado(String nombre, String apellido, int edad,tipoDocumento tipoDocumento,
			int numeroDocumento) {
		this(nombre, apellido, edad, tipoDocumento, numeroDocumento,60000);
	}

	public Empleado(String nombre, String apellido,tipoDocumento tipoDocumento, int nDocumento) {
		this(nombre, apellido,20, tipoDocumento, nDocumento);
	}

	public Empleado(String nombre,tipoDocumento tipoDocumento, int nDocumento) {
		this(nombre,"", tipoDocumento, nDocumento);
	}

	public Empleado(tipoDocumento tipoDocumento, int nDocumento) {
		this("",tipoDocumento, nDocumento);
	}


	public Empleado(String nombre, String apellido, int edad, fabrica.tipoDocumento tipoDocumento, int numeroDocumento,
			double sueldo) {
		super(nombre, apellido, edad, tipoDocumento, numeroDocumento);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
