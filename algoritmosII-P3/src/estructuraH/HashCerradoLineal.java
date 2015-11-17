package estructuraH;

import utils.Persona;
import listaDoble.NodoLD;

public class HashCerradoLineal {

	// capacidad expresada en nro primo, igual o mayor a n
	int capacidad;
	public NodoLD[] nodos;

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
		int pos = (x + llave) % capacidad;
		boolean noInserto = true;
		if (!estaLLeno()) {
			if (!existePersona(p)) {
				while (noInserto) {
					pos = (x + llave) % capacidad;
					if (nodos[pos].getElemento().equals("")) {
						System.out.println("posicion libre en clave " + pos);
						nodos[pos].setElemento(p.getCedula());
						nodos[pos].setClave(pos);
						p.setClave(pos);
						noInserto = false;
					} else {
						x++;
						System.out.println("Todavia no encontre un lugar libre para insertar una nueva cedula");
					}
				}
			}
		}
	}

	private boolean estaLLeno() {
		int c = nodos.length;
		boolean altRes = false;
		for (int i = 0; i < c; i++) {
			if (nodos[i].getElemento().equals("")) {
				altRes = false;
				return altRes;
			} else {
				altRes = true;
			}
		}
		System.out.println("esta LLENO");
		return altRes;
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
		if (p.getClave() > -1) {
			if (nodos[p.getClave()].getElemento().equals(p.getCedula())) {
				return true;
			}
		}
		return false;
	}
}
