package trabajo;

public class TrabajadoPorHora extends Trabajador{
	
	 	private int horas;
	    private double pagoPorHora;




		public TrabajadoPorHora(int horas, double pagoPorHora) {
			super();
			this.horas = horas;
			this.pagoPorHora = pagoPorHora;
		}
	
		
		 @Override
		    public double calcularPago() {
		        return horas * pagoPorHora;
		    }
		
		

}
