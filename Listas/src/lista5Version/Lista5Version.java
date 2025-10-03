package lista5Version;

import java.util.Scanner;


public class Lista5Version {
	Cabecera2 cabecera;

	public Lista5Version() {

	}

	public void insertar(int elemento) {

		Tupla3Objetos tupla = new Tupla3Objetos(elemento);

		if (cabecera == null) {
			cabecera = new Cabecera2(tupla);
			tupla.setPosicionAnterior(null);
		} else {
			Tupla3Objetos actual = cabecera.getPrimero();

			while (actual.getSiguienteElemento() != null) {

				actual = actual.getSiguienteElemento();

			}
			actual.setSiguienteElemento(tupla);
			tupla.setPosicionAnterior(actual);
		}

	}

	public void mostrar() {
		Tupla3Objetos mostrar = cabecera.getPrimero();
		while (mostrar.getSiguienteElemento() != null) {
			if (mostrar.getPosicionAnterior() != null) {
				System.out.println("Elemento " + mostrar.getElemento() + " Elemento anterior "
						+ mostrar.getPosicionAnterior().getElemento() + " Elemento Siguiente "
						+ mostrar.getSiguienteElemento().getElemento());

			} else {
				System.out.println("Elemento " + mostrar.getElemento() + " Elemento anterior es null"
						+ " Elemento Siguiente " + mostrar.getSiguienteElemento().getElemento());
			}
			mostrar = mostrar.getSiguienteElemento();
		}
		System.out.println("Elemento " + mostrar.getElemento() + " Elemento anterior "
				+ mostrar.getPosicionAnterior().getElemento() + " Elemento Siguiente es null");

	}

	public void eliminar(int elemento) {

		Tupla3Objetos mirar = cabecera.getPrimero();
		Tupla3Objetos anterior;
		boolean borrado = false;
		if (mirar.getElemento() == elemento) {
			mirar.getSiguienteElemento().setPosicionAnterior(null);
			cabecera.setPrimero(mirar.getSiguienteElemento());
		} else {
			anterior = mirar;
			mirar = mirar.getSiguienteElemento();
			while (mirar.getSiguienteElemento() != null && !borrado) {

				if (mirar.getElemento() == elemento) {
					mirar.getSiguienteElemento().setPosicionAnterior(anterior);
					anterior.setSiguienteElemento(mirar.getSiguienteElemento());
					borrado = true;
				}
				anterior = mirar;
				mirar = mirar.getSiguienteElemento();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lista5Version l = new Lista5Version();
		while (true) {
			System.out.println("elige: 1 insertar, 2 mostrar, 3 eliminar");
			int input = sc.nextInt();
			switch (input) {
			case 1: {

				System.out.println("elemento");
				int elemento = sc.nextInt();
				l.insertar(elemento);
				break;
			}
			case 2: {
				l.mostrar();
				break;
			}
			case 3: {
				System.out.println("elemento");
				int elemento = sc.nextInt();
				l.eliminar(elemento);
				break;
			}
			}

		}
	}
}
