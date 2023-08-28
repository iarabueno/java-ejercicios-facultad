package practica1;

public class ejercicio8 {

	public static void main(String[] args) {
	int cilindrada = 1600;
	motor auto1 = new motor("roll royce", 354, cilindrada);
	motor auto2 = new motor("porsche", 650, cilindrada);
	

	
	auto1.arrancarMotor("arrancar");
	auto1.detenerMotor("detener");
	
	System.out.println();
	
	auto2.arrancarMotor("arrancar");
	auto2.detenerMotor("detener");

	System.out.println();
	
	System.out.println(auto1.getMarca());
	System.out.println(auto1.getHp());
	System.out.println(auto1.getCilindrada());
	
	System.out.println();
	
	System.out.println(auto2.getMarca());
	System.out.println(auto2.getHp());
	System.out.println(auto2.getCilindrada());
	}

}
