package academico;

public class Estudiante extends Persona {
	
	private String carnet;
	private String carrera;
	
	
	public Estudiante(String carnet, String carrera) {
		super();
		this.carnet = carnet;
		this.carrera = carrera;
	}
	
	   @Override
	    public void presentarse() {
	        System.out.println("Hola, soy un estudiante, mi carnet es " 
	                           + carnet + " y estudio " + carrera);
	   }
	
	
	
	
	

}
