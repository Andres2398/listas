package lista3Version;

public class Tupla {
	private int posicion;
	private int elemento;
	private int posicionArray;
	
	public Tupla(int posicion, int elemento) {
		
		this.posicion = posicion;
		this.elemento = elemento;
		posicionArray=-1;
		
	}
	

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public int getPosicionArray() {
		return posicionArray;
	}

	public void setPosicionArray(int posicionArray) {
		this.posicionArray = posicionArray;
	}

	
	
}
