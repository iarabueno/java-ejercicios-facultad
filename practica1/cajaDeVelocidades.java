package practica1;

public class cajaDeVelocidades {
    private String tipoFabricante;
    private int cantidadMarchas;
    private String tipoDeRelacion;
    
    private int marchaActual;


	public cajaDeVelocidades(String tipoFabricante, int cantidadMarchas, String tipoDeRelacion, int marchaActual) {
		super();
		this.tipoFabricante = tipoFabricante;
		this.cantidadMarchas = cantidadMarchas;
		this.tipoDeRelacion = tipoDeRelacion;
		this.marchaActual = marchaActual;
	}

	
	public String getTipoFabricante() {
		return tipoFabricante;
	}



	public void setTipoFabricante(String tipoFabricante) {
		this.tipoFabricante = tipoFabricante;
	}



	public int getCantidadMarchas() {
		return cantidadMarchas;
	}



	public void setCantidadMarchas(int cantidadMarchas) {
		this.cantidadMarchas = cantidadMarchas;
	}



	public String getTipoDeRelacion() {
		return tipoDeRelacion;
	}



	public void setTipoDeRelacion(String tipoDeRelacion) {
		this.tipoDeRelacion = tipoDeRelacion;
	}



	public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 0 && nuevaMarcha <= cantidadMarchas) {
            System.out.println("Cambiando a marcha " + nuevaMarcha);
            setMarchaActual(nuevaMarcha);
        } else {
            System.out.println("Marcha inválida");
        }
    }



    public int getMarchaActual() {
        return marchaActual;
    }

    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }
    
}
	


	
	

