package Clases;

import java.util.Scanner;

public class LD_CircularConsultorio extends ListaDobleConsultorio{
	public LD_CircularConsultorio() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	public int nroNodos() {
		int c = 0;
		NodoConsultorio R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;
		}
		return c;
	}
	void adiPrimero(Consultorio z){
		NodoConsultorio nuevo = new NodoConsultorio();
		nuevo.setConsultorio(z);
		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoConsultorio R = P.getAnt();
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
			P.setAnt(R);
			R.setSig(P);
		}
	}
	void mostrar() {
		NodoConsultorio R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				R.getConsultorio().mostrar();
				System.out.println("------------------");
				R = R.getSig();
			}
			R.getConsultorio().mostrar();
		}
		else
			System.out.println("Lista Vacia");
	}

	void adiFinal(Consultorio z) {
		NodoConsultorio nuevo = new NodoConsultorio();
		nuevo.setConsultorio(z);
		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoConsultorio R = P.getAnt();
			R.setSig(nuevo);
			nuevo.setAnt(R);
			nuevo.setSig(P);
			P.setAnt(nuevo);
		}
	}

	NodoConsultorio eliPrimero() {
		NodoConsultorio x = new NodoConsultorio();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				NodoConsultorio R = P.getAnt();
				P = P.getSig();
				P.setAnt(R);
				R.setSig(P);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	NodoConsultorio eliFinal() {
		NodoConsultorio x = new NodoConsultorio();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P.getAnt();
				NodoConsultorio R = x.getAnt();
				R.setSig(P);
				P.setAnt(R);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	void leer1(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Consultorio z = new Consultorio();
			z.leer();
			adiPrimero(z);
		}
	}

	void leer2(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Consultorio z = new Consultorio();
			z.leer();
			adiFinal(z);
		}
	}
}
