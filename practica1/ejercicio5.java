package practica1;

public class ejercicio5 {

	public static void main(String[] args) {
		cajaAhorro cuenta1 = new cajaAhorro(203004, "juancito", 5000);
		cajaAhorro cuenta2 = new cajaAhorro(203405, "joaquin", 4000);
		
		System.out.println("retirar saldo de la cuenta 1");
		cuenta1.retirarSaldo(40);
		System.out.println("");
		
		System.out.println("mostrar estado de la cuenta n1");
		cuenta1.mostrarMensaje();
		System.out.println("");
		
		System.out.println("depositar saldo de la cuenta 2");
		cuenta1.depositarSaldo(5000);
		System.out.println("");
		
		System.out.println("retirar saldo de la cuenta 2 y que rechace el pedido");
		cuenta2.retirarSaldo(6000);
		System.out.println("");
	}

}
