package lista5Version;

public class Tupla3Objetos {
	int elemento;
	Tupla3Objetos siguienteElemento;
	Tupla3Objetos posicionAnterior;

	public Tupla3Objetos(int elemento) {

		this.elemento = elemento;
	}

	public Tupla3Objetos getPosicionAnterior() {
		return posicionAnterior;
	}

	public void setPosicionAnterior(Tupla3Objetos posicionAnterior) {
		this.posicionAnterior = posicionAnterior;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public Tupla3Objetos getSiguienteElemento() {
		return siguienteElemento;
	}

	public void setSiguienteElemento(Tupla3Objetos siguienteElemento) {
		this.siguienteElemento = siguienteElemento;
	}
}
