package lista3Version;

import java.util.Scanner;

public class Lista3Version {
    Tupla[] lista;
    int indiceLista;
    int cabeza = -1;

    public Lista3Version() {
        this.lista = new Tupla[10];
        this.indiceLista = 0;
    }

    public void insertar(int posicion, int elemento) {
       
        if (indiceLista == lista.length)
            aumentarTamano();

      
        lista[indiceLista] = new Tupla(posicion, elemento);
        

        //lista vacía
        if (cabeza == -1) {
            cabeza = indiceLista;
        } 
        // insertar al inicio
        else if (posicion < lista[cabeza].getPosicion()) {
            lista[indiceLista].setPosicionArray(cabeza);
            cabeza = indiceLista;
        } 
        // insertar en medio/final
        else {
            int actual = cabeza;
            while (lista[actual].getPosicionArray() != -1 &&
                   lista[lista[actual].getPosicionArray()].getPosicion() < posicion) {
                actual = lista[actual].getPosicionArray();
                
            }
            lista[indiceLista].setPosicionArray(lista[actual].getPosicionArray());
            lista[actual].setPosicionArray(indiceLista);
        }

        indiceLista++;
    }

    private void aumentarTamano() {
        Tupla[] nuevo = new Tupla[lista.length * 2];
        for (int i = 0; i < lista.length; i++) {
            nuevo[i] = lista[i];
        }
        lista = nuevo;
    }

    public void mostrar() {
        if (cabeza == -1) {
            System.out.println("(lista vacía)");
            return;
        }

        int actual = cabeza;
        while (actual != -1) {
            System.out.println("Posicion: " + lista[actual].getPosicion() +
                               " Elemento: " + lista[actual].getElemento() +
                               " Siguiente: " + lista[actual].getPosicionArray());
            actual = lista[actual].getPosicionArray();
        }
    }
    
    public void eliminar(int posicion) {
    	 if (cabeza == -1) {
    	        System.out.println("La lista está vacía.");
    	    } else {
    	        // eliminar la cabeza
    	        if (lista[cabeza].getPosicion() == posicion) {
    	            int eliminado = cabeza;
    	            cabeza = lista[cabeza].getPosicionArray(); 
    	            lista[eliminado] = null; 
    	            System.out.println("Elemento eliminado en posicion " + posicion);
    	        } else {
    	            // buscar nodo previo al que queremos eliminar
    	            int actual = cabeza;
    	            while (lista[actual].getPosicionArray() != -1 &&
    	                   lista[lista[actual].getPosicionArray()].getPosicion() != posicion) {
    	                actual = lista[actual].getPosicionArray();
    	            }

    	            // Verificar si encontramos el nodo y enlazarlo con el siguiente
    	            if (lista[actual].getPosicionArray() != -1) {
    	                int eliminado = lista[actual].getPosicionArray();
    	                lista[actual].setPosicionArray(lista[eliminado].getPosicionArray());
    	                lista[eliminado] = null; 
    	                System.out.println("Elemento eliminado en posicion " + posicion);
    	            } else {
    	                System.out.println("No existe nodo con posicion " + posicion);
    	            }
    	        }
    	    }
    }

    public static void main(String[] args) {
        Lista3Version l = new Lista3Version();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("elige: 1 insertar, 2 mostrar, 3 eliminar");
            int input = sc.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("posicion");
                    int posi = sc.nextInt();
                    System.out.println("elemento");
                    int elemento = sc.nextInt();
                    l.insertar(posi, elemento);
                    break;
                }
                case 2: {
                    l.mostrar();
                    break;
                }
                case 3: {
                	System.out.println("posicion");
                    int posi = sc.nextInt();
                    l.eliminar(posi);
                    break;
                }
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
