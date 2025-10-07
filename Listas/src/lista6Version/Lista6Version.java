package lista6Version;

import java.util.Scanner;

public class Lista6Version {
	Cabecera3 cabecera;

	public Lista6Version() {

	}

	public void insertar(int elemento) {

		Tupla3ObjetosCircular tupla = new Tupla3ObjetosCircular(elemento);

		if (cabecera == null) {

			cabecera = new Cabecera3(tupla);
			tupla.setSiguienteElemento(tupla);
			tupla.setPosicionAnterior(tupla);
		} else {

			Tupla3ObjetosCircular ultimo = cabecera.getPrimero().getPosicionAnterior();

			ultimo.setSiguienteElemento(tupla);
			tupla.setPosicionAnterior(ultimo);
			tupla.setSiguienteElemento(cabecera.getPrimero());
			cabecera.getPrimero().setPosicionAnterior(tupla);
		}

		cabecera.setTamano(cabecera.getTamano() + 1);
	}

	public void mostrar() {

		Tupla3ObjetosCircular actual = cabecera.getPrimero();
		do {
			System.out.println(
					"Elemento: " + actual.getElemento() + " | Anterior: " + actual.getPosicionAnterior().getElemento()
							+ " | Siguiente: " + actual.getSiguienteElemento().getElemento());

			actual = actual.getSiguienteElemento();
		} while (actual != cabecera.getPrimero());
	}

	public void eliminar(int elemento) {

		Tupla3ObjetosCircular mirar = cabecera.getPrimero();
		Tupla3ObjetosCircular anterior;
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
		Lista6Version l = new Lista6Version();
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
