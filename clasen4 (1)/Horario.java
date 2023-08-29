package clasen4;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Horario(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Horario sumarMinutos(int minuto) {
		int hora2=this.hora;
		int minuto2=this.minuto;
		while((minuto2 + minuto)>60) {
			hora2+=1;
			if(minuto>60) {
				minuto-=60;
			}
			else {
				minuto2=minuto2+minuto-60;
				minuto-=minuto;
			}
		
		}
		
		Horario horaNueva=new Horario(hora2,minuto2,segundo);
		
		return horaNueva;
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}


	public int consultarHora() {
		return hora;
	}
	
	public int diferenciaHorariosMinutos(Horario horario) {
		int horaamin=(this.hora) * 60;
		int hora2amin=horario.getHora() * 60;
		int minhora=horaamin+this.minuto;
		int minhora2=hora2amin+horario.getMinuto();
		
		int dif=minhora-minhora2;
		if(dif<0) {
			dif=dif*(-1);
		}
		
		return dif;
		
	}
	
	public static int pasarMinutosaHora(int minutos) {
		return minutos/60;
		
	}

	
	@Override
	public String toString() {
		return "horario [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "]";
	}
}