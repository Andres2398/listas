package lista4Version;

import java.util.Scanner;

public class Lista4Version {
	Cabecera cabecera;

	public void insertar(int elemento) {

		Tupla2Objetos tupla = new Tupla2Objetos(elemento);

		if (cabecera == null) {
			cabecera = new Cabecera(tupla);
		} else {
			Tupla2Objetos actual = cabecera.getPrimero();
			while (actual.getSiguienteElemento() != null) {
				actual = actual.getSiguienteElemento();
			}
			actual.setSiguienteElemento(tupla);
		}

	}

	public void mostrar() {
		Tupla2Objetos mostrar = cabecera.getPrimero();
		while (mostrar.getSiguienteElemento() != null) {
			System.out.println(mostrar.getElemento());
			mostrar = mostrar.getSiguienteElemento();
		}
		System.out.println(mostrar.getElemento());
	}

	public void eliminar(int elemento) {
		Tupla2Objetos mirar = cabecera.getPrimero();
		Tupla2Objetos anterior;
		boolean borrado = false;
		if (mirar.getElemento() == elemento)
			cabecera.setPrimero(mirar.getSiguienteElemento());
		else {
			anterior = mirar;
			mirar = mirar.getSiguienteElemento();
			while (mirar.getSiguienteElemento() != null && !borrado) {

				if (mirar.getElemento() == elemento) {
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
		Lista4Version l = new Lista4Version();
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
