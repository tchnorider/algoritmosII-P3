package ejercicio3;

import utils.Persona;
import listaDoble.Lista;

public class HashAbierto {
	int tam;
	Lista[] tabla;

	public HashAbierto(int t) {
		this.tam = t;
		this.tabla = new Lista[t];
		for(int i=0;i<tam;i++){
			tabla[i]= new Lista();
		}
	}
	
	public void insertar(Persona p){
		int pos = h(p.getCedula());
		tabla[pos].insertarInicio(p.getCedula());
	}

	private int h(String cedula) {
		String aux = cedula.replace(".", " ");
		return Integer.parseInt(aux) % tam;
	}
	
	public boolean pertenece(Persona p){
		int pos=h(p.getCedula());
		return tabla[pos].existe(p.getCedula());
	}

}
