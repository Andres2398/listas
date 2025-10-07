package listaIterador;



public class TuplaIterador {
	int elemento;
	TuplaIterador siguienteElemento;
	TuplaIterador posicionAnterior;

	public TuplaIterador(int elemento) {

		this.elemento = elemento;
	}

	public TuplaIterador getPosicionAnterior() {
		return posicionAnterior;
	}

	public void setPosicionAnterior(TuplaIterador posicionAnterior) {
		this.posicionAnterior = posicionAnterior;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public TuplaIterador getSiguienteElemento() {
		return siguienteElemento;
	}

	public void setSiguienteElemento(TuplaIterador siguienteElemento) {
		this.siguienteElemento = siguienteElemento;
	}
}
