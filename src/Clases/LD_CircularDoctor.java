package Clases;

import java.util.Scanner;

public class LD_CircularDoctor extends ListaDobleDoctor{
	public LD_CircularDoctor() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	public int nroNodos() {
		int c = 0;
		NodoDoctor R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;
		}
		return c;
	}
	void adiPrimero(Doctor z){
		NodoDoctor nuevo = new NodoDoctor();
		nuevo.setDoctor(z);
		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoDoctor R = P.getAnt();
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
			P.setAnt(R);
			R.setSig(P);
		}
	}
	void mostrar() {
		NodoDoctor R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				R.getDoctor().mostrar();
				System.out.println("------------------");
				R = R.getSig();
			}
			R.getDoctor().mostrar();
		}
		else
			System.out.println("Lista Vacia");
	}

	void adiFinal(Doctor z) {
		NodoDoctor nuevo = new NodoDoctor();
		nuevo.setDoctor(z);
		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoDoctor R = P.getAnt();
			R.setSig(nuevo);
			nuevo.setAnt(R);
			nuevo.setSig(P);
			P.setAnt(nuevo);
		}
	}

	NodoDoctor eliPrimero() {
		NodoDoctor x = new NodoDoctor();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				NodoDoctor R = P.getAnt();
				P = P.getSig();
				P.setAnt(R);
				R.setSig(P);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	NodoDoctor eliFinal() {
		NodoDoctor x = new NodoDoctor();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P.getAnt();
				NodoDoctor R = x.getAnt();
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
			Doctor z = new Doctor();
			z.leer();
			adiPrimero(z);
		}
	}

	void leer2(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Doctor z = new Doctor();
			z.leer();
			adiFinal(z);
		}
	}
}
