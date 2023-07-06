package fabrica;


public class Prenda {
	
	
	private String nombre;
	private Proceso[] procesos;
	private int metrosCuadradosTela;
	
	
	
	
	
	public Prenda(String nombre) {
		this.nombre = nombre;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public Proceso[] getProcesos() {
		return procesos;
	}





	public void setProcesos(Proceso[] procesos) {
		this.procesos = procesos;
	}





	public int getMetrosCuadradosTela() {
		return metrosCuadradosTela;
	}





	public void setMetrosCuadradosTela(int metrosCuadradosTela) {
		this.metrosCuadradosTela = metrosCuadradosTela;
	}





	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Prenda) {
			Prenda prendaAux = (Prenda)obj;
			return (this.nombre == prendaAux.getNombre());
		}
		else {
			return false;
		}
	}
}
