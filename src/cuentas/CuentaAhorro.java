package cuentas;

public class CuentaAhorro extends Cuenta{

	public CuentaAhorro(double saldo) {
		super(saldo);
	}

	@Override
	public void depositar(double monto) {
		double interes = monto*0.05;
		saldo = monto+interes;
		System.out.println("Deposito con interes ingresado ");
		System.out.println("Interes: " + interes);
		System.out.println("Saldo actual " + saldo);
		
	}
	
	
	
	

}
