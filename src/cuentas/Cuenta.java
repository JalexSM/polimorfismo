package cuentas;

public class Cuenta {
	
	protected double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} 
	
	public void depositar(double monto) {
		saldo += monto;
		
		
		}
	
	

}
