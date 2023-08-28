package practica1;

public class rueda {
	private double radio;
	private String color;
	private String tipoMaterial;
	
	public rueda(double radio, String color, String tipoMaterial) {
		super();
		this.radio = radio;
		this.color = color;
		this.tipoMaterial = tipoMaterial;
	}
	
	public double getradio() {
		return radio;
		}
		
		public String color() {
			return color;
		}
		
		public String tipoMaterial() {
			return tipoMaterial;
		}
	
	public void girar() {
		System.out.println("esta girando la rueda");
		System.out.println("radio:"+ radio);
		System.out.println("color: "+ color);
		System.out.println("tipoMaterial: "+ tipoMaterial);
	}
	
}


