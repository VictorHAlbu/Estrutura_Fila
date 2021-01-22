package br.com.fila;

public class Celula {

	private Celula proximo;
	private Celula anterior;
	private Object elemento;
	

	public Celula(Celula proximo, Object elemento) {
		
		this.proximo = proximo;
		this.elemento = elemento;
	}

	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	
	public Celula getProximo() {
		return this.proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Object getElemento() {
		return this.elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
	public Celula getAnterior() {
		return this.anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	
}
