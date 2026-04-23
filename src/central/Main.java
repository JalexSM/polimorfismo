package central;

import java.util.Scanner;

import academico.Estudiante;
import academico.Persona;
import animales.Animal;
import animales.Perro;
import cuentas.Cuenta;
import cuentas.CuentaAhorro;
import empresa.Empleado;
import empresa.Vendedor;
import geometria.Figura;
import geometria.Rectangulo;
import movilidad.Motocicleta;
import movilidad.Vehiculo;
import musica.Guitarra;
import musica.Instrumento;
import productos.Producto;
import productos.ProductoDigital;
import trabajo.TrabajadoPorHora;
import trabajo.Trabajador;
import vehiculos.Avion;
import vehiculos.Transporte;




/* 



*/


public class Main {
	
	
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		int opcion = 0;

		while (opcion != 11) {
			System.out.println("\n===== MENÚ PRINCIPAL =====");
			System.out.println(" 1. Animal y Perro ");
			System.out.println(" 2. Figura y Rectangulo");
			System.out.println(" 3. Empleado y Vendedor");
			System.out.println(" 4. Cuenta y CuentaAhorro");
			System.out.println(" 5. Transporte y Avion");
			System.out.println(" 6. Persona y Estudiante");
			System.out.println(" 7. Vehiculo y Motocicleta");
			System.out.println(" 8. Producto y ProductoDigital");
			System.out.println(" 9. Instrumento y Guitarra");
			System.out.println(" 10. Trabajador y TrabajadorPorHora");
			System.out.println(" 11. SALIR");

			System.out.print("Seleccione una opción: ");

			try {
				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					 ejercicio1();
					break;
				case 2:
					 ejercicio2();
					break;
				case 3:
					 ejercicio3();
					break;
				case 4:
					 ejercicio4();
					break;
				case 5:
					ejercicio5();
					break;
				case 6:
					ejercicio6();
					break;
				case 7:
					ejercicio7();
					break;
				case 8:
					ejercicio8();
					break;
				case 9:
					ejercicio9();
					break;
				case 10:
					ejercicio10();
					break;
				case 11:
					System.out.println("saliendo ... ");
					break;
				default:
					System.out.println("Opción inválida.");
				}

			} catch (Exception e) {
				System.out.println("Debe ingresar un número válido.");
				sc.nextLine();
			}
		}

	}
	
	
	public static void ejercicio1() {
		
		Animal perro1 = new Perro();
		
		perro1.haceSonido();
		
		
		
	}
	
	
	
	
	public static void ejercicio2() {
		
		Figura rec1 = new Rectangulo(22.5,2.5);
		
		rec1.calcularArea();
		
		
		
	}
	
	public static void ejercicio3() {
		
		Empleado vendor1 = new Vendedor ("alexander",75000.00);
		vendor1.resumen();
		
		
		
	}
		
	
	public static void ejercicio4() {
		
		Cuenta cuenta1 = new CuentaAhorro(2000);
		cuenta1.depositar(100);
		
		
	}
	
	public static void ejercicio5() {
		
	Transporte avion1 = new Avion();
	avion1.moverse();

		
		
		
	}
	
	
	public static void ejercicio6() {
		
		Persona est1 = new Estudiante("312312","ing. sistemas");
		est1.presentarse();
		
		
	}
	
	public static void ejercicio7() {
		
		
		Vehiculo vehi1 = new Motocicleta();
		vehi1.encender();
		
		
	}
	
	public static void ejercicio8() {
		
        Producto prod1 = new ProductoDigital("Curso de Java", 150.0, "PDF");

        prod1.mostrarDescripcion();
	
		
		
		
	}

	
	public static void ejercicio9() {
		 Instrumento Guit1 = new Guitarra();
		 Guit1.tocar();
		 
		 
	}
	
	public static void ejercicio10() {
		
		Trabajador trabajador = new TrabajadoPorHora (40, 25.5);
        System.out.println("Pago total: Q" + trabajador.calcularPago());
		
	}
	
	
	
	
}
