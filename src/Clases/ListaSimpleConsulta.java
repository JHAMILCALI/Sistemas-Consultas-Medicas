package Clases;

public class ListaSimpleConsulta{
	protected NodoConsulta P;  //raiz de la lista
	
	public ListaSimpleConsulta() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoConsulta getP() {
		return P;
	}

	public void setP(NodoConsulta p) {
		P = p;
	}
	
}
