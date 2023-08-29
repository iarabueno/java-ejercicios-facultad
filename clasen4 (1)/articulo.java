package clasen4;

import java.util.Objects;

public class articulo {
	private String descripcion;
	
	public void setDescripcion(String valor) {
		descripcion = valor;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "articulo [descripcion=" + descripcion + "]";
	}
	
	public boolean equals(articulo obj) {
		return true;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}
		//si sos un articulo
		if (!(obj instanceof articulo)){
			return false;
		}
		
		//if (obj.getClass()==this.getClass())
		//esta casteando el articulo, el equals es para el string
		//esto sirve para comparar algo
		if (((articulo) obj).getDescripcion().equals(this.descripcion)) {
			return true;
		}
		return false;
		
	}
	
	
	
}
