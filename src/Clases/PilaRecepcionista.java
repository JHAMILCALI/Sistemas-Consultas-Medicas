package Clases;


import java.util.Scanner;

public class PilaRecepcionista extends VectorRecepcionista{
	private int tope;

	public PilaRecepcionista() {
		this.tope = -1;
	}
	
	public boolean esVacia(){
		if(this.tope == -1)
			return true;  //pila vacia
		else
			return false; //pila no es vacia
	}
	public boolean esLlena(){
		if(this.tope == max-1)
			return true;  //pila llena
		else 
			return false; //pila no es llena
	}
	public void adi(Recepcionista elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public Recepcionista eli(){
		Recepcionista elem = new Recepcionista();
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
		PilaRecepcionista aux = new PilaRecepcionista();
		while(!esVacia()){
			Recepcionista elem = new Recepcionista();
			 elem = eli();
			 System.out.println();
			elem.mostrar();
			aux.adi(elem);
		} 
		vaciar(aux);
	}
	public void vaciar(PilaRecepcionista p){
		while(!p.esVacia()){  //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	public void llenar(int n){
		Scanner lee = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Recepcionista elem = new Recepcionista();
			elem.leer();
			this.adi(elem);
		}
	}
	public int nroElem(){
		return tope + 1;
	}
	public int NroElem(){
		PilaRecepcionista aux = new PilaRecepcionista();
		int c = 0;
		while(!esVacia()){
			Recepcionista elem = eli();
			aux.adi(elem);
			c++;
		} 
		vaciar(aux);
		return c;
	}
}
