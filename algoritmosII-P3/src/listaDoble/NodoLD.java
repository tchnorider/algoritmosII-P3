package listaDoble;

public class NodoLD {

	private String elemento;
	private NodoLD siguiente;
	private NodoLD anterior;

	public NodoLD getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLD siguiente) {
		this.siguiente = siguiente;
	}

	public NodoLD getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoLD anterior) {
		this.anterior = anterior;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public NodoLD(String valor) {
		this.elemento = valor;
		this.siguiente = null;
	}
}
