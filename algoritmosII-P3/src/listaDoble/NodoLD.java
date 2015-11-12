package listaDoble;

public class NodoLD {

	private String elemento;
	private int clave;
	private NodoLD siguiente;
	private NodoLD anterior;

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}	
	
	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

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

	public NodoLD(String valor) {
		this.elemento = valor;
		this.siguiente = null;
	}
	
	public NodoLD() {
		this.elemento = "";
		this.siguiente = null;
	}
}
