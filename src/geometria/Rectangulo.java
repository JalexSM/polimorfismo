package geometria;

public class Rectangulo extends Figura{
	
	private double altura;
	private double base; 
	
	public Rectangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	
	
	

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		
		System.out.println("El area es: " + altura*base);
	}

	
	

}
