package practica1;

public class ejercicio6 {

	public static void main(String[] args) {
		rueda rueda1 = new rueda(250, "rojo", "acero");
		rueda rueda2 = new rueda(300, "amarillo", "aleacion");
		rueda rueda3 = new rueda(320, "verde", "caucho sintetico");

		System.out.println();
		rueda1.girar();
		System.out.println();
		rueda2.girar();
		System.out.println();
		rueda3.girar();

	}

}
