package Clases;

import java.util.Scanner;

public class ColaCircularEmergencia extends ColaEmergencia{
	public ColaCircularEmergencia() {
		super();
	}
	public int nroElem() {
		return (fi - fr + MAX) % MAX;
	}
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == MAX-1)
			return true;
		return false;
	}
	public void adi(Emergencia elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public Emergencia eli() {
		Emergencia elem = new Emergencia();
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularEmergencia z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\tIntro Emergencia");
			Emergencia elem = new Emergencia();
			elem.leer();
			adi(elem);
		}
	}
	public void mostrar() {
		ColaCircularEmergencia aux = new ColaCircularEmergencia();
		Emergencia elem;
		System.out.println("\t****COLA DE EMERGENCIA(O)****");
		while(!esVacia()) {
			elem = eli();
			elem.mostrar();
			System.out.println();
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
