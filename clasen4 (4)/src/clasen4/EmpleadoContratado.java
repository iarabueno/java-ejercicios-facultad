package clasen4;

public class EmpleadoContratado extends empleado{
	private double valorHora = 0;
	private int horasMensuales = 0;
	
	public EmpleadoContratado(String nombre, String apellido, Horario horarioEntrada, Horario horarioSalida, double valorHora, int horasMensuales) {
		super(nombre, apellido, horarioEntrada, horarioSalida);
		this.valorHora = valorHora;
		this.horasMensuales = horasMensuales;
	}
	
	void acumularHoras(int horasMensuales) {
		double valorHora1 = this.valorHora;
		int horasMensuales1 = this.horasMensuales;
		
		horasMensuales+= valorHora;
		
		double horasAcumuladas = horasMensuales * valorHora;
		}
	}
	
	double sueldoNeto(double sueldo) {
		return ((sueldo*horasMensuales)/30);
	}
	
	
}
