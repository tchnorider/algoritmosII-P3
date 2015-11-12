package estructuraH;

import utils.Persona;
import listaDoble.NodoLD;

public class HashCerradoLineal {

	// capacidad expresada en nro primo, igual o mayor a n
	int capacidad;
	NodoLD[] nodos;

	public HashCerradoLineal(int capacidad) {

		this.capacidad = verificarPrimo(capacidad);

		this.nodos = new NodoLD[this.capacidad];

		for (int i = 0; i < capacidad; i++) {
			nodos[i] = new NodoLD();
		}
	}

	public void insertar(Persona p) {

		int x = 1;

		int llave = Integer.parseInt(p.getCedula());

		int pos = h(llave);
		System.out.println("Calculo pos: " + pos);

		if (!existe(p.getCedula())) {
			if (nodos[pos].getElemento().equals("")) {
				System.out.println("posicion libre en clave " + pos);
			} else {
				while (!nodos[pos].getElemento().equals("")) {
					System.out
							.println("Todavia no encontre un lugar libre para insertar una nueva cedula");
					pos = (x + llave) % capacidad;
				}
			}
		}

		nodos[pos].setElemento(p.getCedula());
		p.setClave(pos);
	}

	private int h(int cedula) {

		return cedula % capacidad;

	}

	private int verificarPrimo(int maxNodos) {
		int testPrimo = maxNodos;
		if (testPrimo % 2 == 0) {
			testPrimo = maxNodos + 1;
		}
		return testPrimo;
	}

	public boolean existe(String cedula) {
		int llave = Integer.parseInt(cedula);
		int pos = h(llave);
		int x = 1;
		while (!nodos[pos].getElemento().equals("")) {
			pos = (x + llave) % capacidad;
		}
		return true;
	}

	public boolean existePersona(Persona p) {
		if (p.getClave() != 0) {
			if (nodos[p.getClave()].getElemento().equals(p.getCedula())) {
				return true;
			}
		}
		return false;
	}
}
