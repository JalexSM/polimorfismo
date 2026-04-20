package empresa;

public class Vendedor extends Empleado{
	
	 private double comision;

	 public Vendedor(String nombre, double salario, double comision) {
		super(nombre, salario);
		this.comision = comision;
	 }

	 @Override
	 public void resumen() {
		// TODO Auto-generated method stub
		super.resumen();
		System.out.println("La comision del empleado es:"+comision);
	 }
	 
	 
	

}
