package estructuraH;

import listaDoble.Lista;

public class HashCerradoLineal {
	// tamaño expresado en nro primo, igual o mayor a n
	int tam;
	Lista[] tabla;

	public HashCerradoLineal(int t) {
		this.tam = calcularT(t);
		this.tabla = new Lista[this.tam];
		for(int i=0;i<tam;i++){
			tabla[i]= new Lista();
		}
	}

	private int calcularT(int t) {
		// TODO Auto-generated method stub
		return 0;
	}
}
