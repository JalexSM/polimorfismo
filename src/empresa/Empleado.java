package empresa;

public class Empleado {
	
	
	private String nombre;
	
	
	public Empleado(String nombre, double salario) {
		super();
		this.nombre = nombre;

	}
	
	public void resumen() {
		
		System.out.println("nombre:"+nombre);
		
		
		
	}

}
