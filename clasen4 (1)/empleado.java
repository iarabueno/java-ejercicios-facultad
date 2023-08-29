package clasen4;

public class empleado {
    private static int ultimoLegajo=100;
    private String nombre;
    private String apellido;
    private int legajo;
    private double sueldo;
    private Horario horarioEntrada;
    private Horario horarioSalida;
 
    public empleado(String nombre, String apellido,  Horario horarioEntrada, Horario horarioSalida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = ultimoLegajo;
        ultimoLegajo++;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
    }

    public empleado() {
    	
    }

    public empleado(String nombre, String apellido) {
    	this.nombre = nombre;
    	this.apellido = apellido;
    }
    
    public double getSueldo() {
		return sueldo;
	}

	public int horasTrabajadas()
    {
        return Horario.pasarMinutosaHora(horarioSalida.diferenciaHorariosMinutos(horarioEntrada));
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getUltimoLegajo() {
        return ultimoLegajo;
    }
    
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + "\n" +
                ", apellido='" + apellido + "\n" +
                ", legajo='" + legajo + "\n" +
                ", Proximo empleado: " + ultimoLegajo +
                '}';
    }
}
