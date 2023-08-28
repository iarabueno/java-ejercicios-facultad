package practica1;

public class cajaAhorro {
	private int numeroCuenta;
	private String titular;
	private double saldo;
	

	
	public cajaAhorro(int numeroCuenta, String titular, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public int getnumeroCuenta() {
		return numeroCuenta;
	}
	
	public String titular() {
		return titular;
	}
	
	public double saldo() {
		return saldo;
	}

	public void depositarSaldo(double cantidad){
		if (cantidad > 0){
			saldo+=cantidad;
		}
		System.out.println("usted depositó "+ cantidad);
		System.out.println("saldo actual: "+ saldo);
	
	}
	
	public void retirarSaldo(double cantidad) {
			if ((cantidad > 0) && (cantidad <= saldo)){
				saldo-=cantidad;
				System.out.println("usted retiró " + cantidad + " monto");
				System.out.println("saldo actual: "+ saldo);
			}
			else {
				System.out.println("usted no puede retirar " + cantidad + " monto");
				System.out.println("saldo actual: "+ saldo);
			}
	}
		
			
	public void mostrarMensaje() {
		System.out.println("numero de cuenta: "+ numeroCuenta);
		System.out.println("titular: "+ titular);
		System.out.println("saldo: "+ saldo);
		
		
	}
	
}