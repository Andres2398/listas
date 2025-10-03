package lista4Version;

public class Tupla2Objetos {
	int elemento;
	Tupla2Objetos siguienteElemento;
	
	
	
	
	public Tupla2Objetos(int elemento) {
		
		this.elemento = elemento;
	}
	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	public Tupla2Objetos getSiguienteElemento() {
		return siguienteElemento;
	}
	public void setSiguienteElemento(Tupla2Objetos siguienteElemento) {
		this.siguienteElemento = siguienteElemento;
	}
}
