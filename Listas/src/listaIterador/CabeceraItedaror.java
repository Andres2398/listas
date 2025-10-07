package listaIterador;

public class CabeceraItedaror {
	int tamano = 0;
	TuplaIterador primero;

	public CabeceraItedaror(TuplaIterador primero) {
		this.primero = primero;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public TuplaIterador getPrimero() {
		return primero;
	}

	public void setPrimero(TuplaIterador primero) {
		this.primero = primero;
	}

}
