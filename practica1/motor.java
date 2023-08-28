package practica1;

public class motor {
	private String marca;
	private int hp;
	private int cilindrada = 1600;
	
	

	public motor(String marca, int hp, int cilindrada) {
		super();
		this.marca = marca;
		this.hp = hp;
		this.cilindrada = cilindrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	

	public void arrancarMotor(String motor) {
	if (motor == "arrancar") {
		System.out.println("arranco el motor");
	}
	}
	
	public void detenerMotor(String motor) {
		if (motor == "detener") {
			System.out.println("detuvo el motor");
		}
		}
	

}



	
