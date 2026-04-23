package productos;

public class ProductoDigital extends Producto{
	
	    private String formato;

	    public ProductoDigital(String nombre, double precio, String formato) {
	        super(nombre, precio);
	        this.formato = formato;
	    }

	    @Override
	    public void mostrarDescripcion() {
	        super.mostrarDescripcion();
	        System.out.println("Formato digital: " + formato);
	    }
	}

