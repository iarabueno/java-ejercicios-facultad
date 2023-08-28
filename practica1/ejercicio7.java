package practica1;

public class ejercicio7 {

	public static void main(String[] args) {

		cajaDeVelocidades auto1 = new cajaDeVelocidades("ford", 6, "larga", 0);
		cajaDeVelocidades auto2 = new cajaDeVelocidades("peugeot", 6, "corto", 0);
		cajaDeVelocidades auto3 = new cajaDeVelocidades("mercedes", 6, "mediano", 0);
		
		auto1.cambiarMarcha(2);	
		auto2.cambiarMarcha(3);
		auto3.cambiarMarcha(5);
		System.out.println();
		
		System.out.println(auto1.getTipoFabricante());
		System.out.println(auto1.getCantidadMarchas());
		System.out.println(auto1.getTipoDeRelacion());
		System.out.println();
		
		System.out.println(auto2.getTipoFabricante());
		System.out.println(auto2.getCantidadMarchas());
		System.out.println(auto2.getTipoDeRelacion());
		System.out.println();
		
		System.out.println(auto3.getTipoFabricante());
		System.out.println(auto3.getCantidadMarchas());
		System.out.println(auto3.getTipoDeRelacion());
		System.out.println();
		
		
		
	
		}
}
