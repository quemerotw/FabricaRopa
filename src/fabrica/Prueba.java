package fabrica;



public class Prueba {

	public static void main(String[] args) {
	
		Fabrica fabrica = new Fabrica("Nike");
		Empleado empleado1 = new Empleado("Josefa","Carlone",20,tipoDocumento.DNI,32987561);
		Empleado empleado2 = new Empleado("Pancracio","Delopi",32,tipoDocumento.DNI,22590987,90000);
		Empleado empleado3 = new Empleado("Estebean","Quito",24,tipoDocumento.DNI,38745322,120000);
		Empleado empleado4 = new Empleado("Paquita","Ladelbarrio",72,tipoDocumento.LE,15590987);
		Persona persona1 = new Persona("Juana","Delgolpe",36,tipoDocumento.DNI,36590987);
		Empleado empleado5 = new Empleado("Pablo","Ojeda",20,tipoDocumento.DNI,30590987);
		Empleado empleado6 = new Empleado("Luciano","Mendez",20,tipoDocumento.DNI,30590987);
		Empleado[] empleados1 = new Empleado[] {empleado1,empleado2,empleado3};
		Empleado[] empleados2 = new Empleado[] {empleado4,empleado5,empleado6};
		
		
		ProcesoInterno procesoInterno1 = new ProcesoInterno("Corte","Corte de telas",20000);
		procesoInterno1.setEmpleados(empleados1);
		procesoInterno1.setEmpleadoEncargado(empleado6);
		
		
		ProcesoInterno procesoInterno2 = new ProcesoInterno("Costura","Costura de Telas",20000);
		procesoInterno2.setEmpleados(empleados2);
		procesoInterno2.setEmpleadoEncargado(empleado5);
		
		
		ProcesoExterno procesoExterno1 = new ProcesoExterno("Etiquetado","Colocaicon de etiquetas",2000);
		procesoExterno1.setPersonaReferente(persona1);
		
		ProcesoCalidad procesoCalidad1 = new ProcesoCalidad("Prueba Calidad","Testeo Stress Tela",2000);
		procesoCalidad1.setCantidadPrendasRealizadas(20000);
		procesoCalidad1.setEmpleadoEncargado(empleado6);
		procesoCalidad1.setEmpleados(empleados1);
		
		
		Prenda remera = new Prenda("Remera");
		remera.setMetrosCuadradosTela(20);
		remera.setProcesos(new Proceso[] {procesoInterno1,procesoInterno2,procesoExterno1,procesoCalidad1});
		
		
		Prenda pantalon = new Prenda("Pantalon");
		pantalon.setMetrosCuadradosTela(10);
		pantalon.setProcesos(new Proceso[] {procesoInterno2,procesoExterno1,procesoCalidad1});
		
		
		Prenda zapatilla = new Prenda("Zapatilla");
		zapatilla.setMetrosCuadradosTela(5);
		zapatilla.setProcesos(new Proceso[] {procesoInterno1,procesoExterno1,procesoCalidad1});
		
		
		Prenda gorra = new Prenda("Gorra");
		gorra.setMetrosCuadradosTela(3);
		gorra.setProcesos(new Proceso[] {procesoInterno2,procesoCalidad1});
		fabrica.setPrendas(new Prenda[] {remera,pantalon,zapatilla,gorra});
		
		if (!zapatilla.equals(gorra)) {
			System.out.println(fabrica.getNombre());
		}
		
		if(zapatilla.equals(zapatilla)) {
			System.out.println(procesoCalidad1.toString());
			System.out.println(procesoExterno1.toString()+ "\n \n");
			
			fabrica.listarCostos();
		}
	}

}
