package Clases;
import java.beans.IntrospectionException;
import java.util.Scanner;

public class LS_NormalConsulta extends ListaSimpleConsulta{

	public LS_NormalConsulta() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Consulta z) {
		NodoConsulta nuevo = new NodoConsulta();
		nuevo.setConsulta(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Consulta z) {
		NodoConsulta nuevo = new NodoConsulta();
		nuevo.setConsulta(z);
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoConsulta R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoConsulta R = P;   //R apunta  a la raiz P
		System.out.println("\n\tLISTA DE Consultas");
		int cont = 1;
		while(R != null) {
			System.out.println("Nro Consulta ["+cont+"]");
			R.getConsulta().mostrar();
			cont++;
			System.out.println("=========================");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoConsulta R = P;
		int c = 0;
		if(this.esVacia())
			return 0;
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
	public NodoConsulta eliPrincipio() {
		NodoConsulta x = new NodoConsulta();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoConsulta eliFinal() {
		NodoConsulta x = new NodoConsulta();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoConsulta R = P;
				NodoConsulta S = P;
				while(R.getSig() != null) {
					S = R;
					R = R.getSig();
				}
				x = R;
				S.setSig(null);
			}
		}
		return x;
	}
	void llenar1(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			Consulta z = new Consulta();
			System.out.println("\t CONSULTA ["+(i+1)+"]");
			z.leer();
			adiPrincipio(z);
		}
	}
	void llenar2(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			Consulta z = new Consulta();
			System.out.println("\t CONSULTA ["+(i+1)+"]");
			z.leer();
			adiFinal(z);
		}
	}
}
