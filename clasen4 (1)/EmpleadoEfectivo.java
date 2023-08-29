package clasen4;

public class EmpleadoEfectivo extends empleado{
	private double porcentajeDescuento;
	private double premios;
	
	public EmpleadoEfectivo(String nombre, String apellido, Horario horarioEntrada, Horario horarioSalida, double porcentajeDescuento, double premios) {
		super(nombre, apellido, horarioEntrada, horarioSalida);
		this.porcentajeDescuento = porcentajeDescuento;
		this.premios = premios;
	}

	@Override
	public String toString() { 
	// .toString() recursividad -> llamar al heredero xd
		return super.toString() + "EmpleadoEfectivo [porcentajeDescuento=" + porcentajeDescuento + ", premios=" + premios + "]";
	}

	public double getPorcentajeDescuento() {
		return getSueldo()/100*porcentajeDescuento;
		// return sueldo/100*porcentajeDescuento; -> en caso de que la variable sea protected y no private
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public double sueldoNeto() {
		return getSueldo()- getPorcentajeDescuento() + premios;
	}
	

	
	
	

}
