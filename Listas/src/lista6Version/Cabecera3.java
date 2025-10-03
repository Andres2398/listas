package lista6Version;

import lista5Version.Tupla3Objetos;

public class Cabecera3 {
	Tupla3ObjetosCircular primero;

	public Cabecera3(Tupla3ObjetosCircular primero) {

		this.primero = primero;
	}

	public Tupla3ObjetosCircular getPrimero() {
		return primero;
	}

	public void setPrimero(Tupla3ObjetosCircular primero) {
		this.primero = primero;
	}
}
