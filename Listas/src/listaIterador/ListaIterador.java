package listaIterador;

import java.util.Scanner;


public class ListaIterador {
	CabeceraItedaror cabecera;

	public ListaIterador() {

	}

	public void insertar(int elemento) {

		TuplaIterador tupla = new TuplaIterador(elemento);

		if (cabecera == null) {

			cabecera = new CabeceraItedaror(tupla);
			tupla.setSiguienteElemento(tupla);
			tupla.setPosicionAnterior(tupla);
		} else {

			TuplaIterador ultimo = cabecera.getPrimero().getPosicionAnterior();

			ultimo.setSiguienteElemento(tupla);
			tupla.setPosicionAnterior(ultimo);
			tupla.setSiguienteElemento(cabecera.getPrimero());
			cabecera.getPrimero().setPosicionAnterior(tupla);
		}

		cabecera.setTamano(cabecera.getTamano() + 1);
	}

	public void mostrar() {

		Iterador iterador = new Iterador(cabecera);

		
		while (iterador.hasNext()) {
		    System.out.println(iterador.next());
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaIterador l = new ListaIterador();
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
				//l.eliminar(elemento);
				break;
			}
			}

		}
	}
}
