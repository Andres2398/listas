package listaIterador;

public class Iterador {

	private TuplaIterador actual; 
	private TuplaIterador primero; 
	private boolean inicio; 

	public Iterador(CabeceraItedaror cabecera) {
		if (cabecera != null && cabecera.getPrimero() != null) {
			this.primero = cabecera.getPrimero();
			this.actual = primero;
			this.inicio = true;
		} else {
			this.primero = null;
			this.actual = null;
			this.inicio = false;
		}
	}

	public boolean hasNext() {
		// la lista esta vacia
		if (primero == null)
			return false;

		// Detener si ya hemos dado la vuelta
		if (!inicio && actual == primero)
			return false;

		return true;
	}

	public int next() {
		if (!hasNext())
			throw new IllegalStateException("No hay más elementos en la lista.");

		int valor = actual.getElemento();
		actual = actual.getSiguienteElemento();
		inicio = false;
		return valor;
	}

	public int getFirst() {
		if (primero == null)
			throw new IllegalStateException("La lista está vacía.");
		return primero.getElemento();
	}
}