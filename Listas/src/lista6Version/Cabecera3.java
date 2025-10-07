package lista6Version;



public class Cabecera3 {
	Tupla3ObjetosCircular primero;
	int tamano=0;

	public Cabecera3(Tupla3ObjetosCircular primero) {

		this.primero = primero;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public Tupla3ObjetosCircular getPrimero() {
		return primero;
	}

	public void setPrimero(Tupla3ObjetosCircular primero) {
		this.primero = primero;
	}
}
