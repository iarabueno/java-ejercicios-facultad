package clasen4;

public class main {

	public static void main(String[] args) {
//		EmpleadoEfectivo nuevoEmpleado = newEmpleado (nombre: "Carlos", apellido: "gomez", legajo: 123, sueldo: 505050, "");
//		System.out.println(nuevoEmpleado.sueldotoString());
		
		articulo articulo = new articulo();
		articulo articulo1 = new articulo();
		
		articulo.setDescripcion("remera");
		articulo1.setDescripcion("Pantalon");
		
//		empleado empleadoEjemplo = new empleado();
		
		if (articulo==articulo1) {
			System.out.println(articulo.toString());
		}
		
		if (articulo.equals(articulo1)) {
			System.out.println("es el mismo articulo");
		}
		else {
			System.out.println("no son el mismo articulo");
		}
		
	}

}
