package lista6Version;



public class Tupla3ObjetosCircular {
	int elemento;
	Tupla3ObjetosCircular siguienteElemento;
	Tupla3ObjetosCircular posicionAnterior;

	public Tupla3ObjetosCircular(int elemento) {

		this.elemento = elemento;
	}

	public Tupla3ObjetosCircular getPosicionAnterior() {
		return posicionAnterior;
	}

	public void setPosicionAnterior(Tupla3ObjetosCircular posicionAnterior) {
		this.posicionAnterior = posicionAnterior;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public Tupla3ObjetosCircular getSiguienteElemento() {
		return siguienteElemento;
	}

	public void setSiguienteElemento(Tupla3ObjetosCircular siguienteElemento) {
		this.siguienteElemento = siguienteElemento;
	}
}
