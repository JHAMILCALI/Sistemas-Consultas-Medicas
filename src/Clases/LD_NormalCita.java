package Clases;

//Lic Aruquipa Marcelo
public class LD_NormalCita extends ListaDobleCita{
	public LD_NormalCita() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoCita R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Cita z){
		NodoCita nuevo = new NodoCita();
		nuevo.setCita(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoCita R = P;
		System.out.println("\t*****LISTA DE CITAS MEDICAS*****");
		int cont=1;
		while(R != null) {
			System.out.println("\tCITA ["+cont+"]");
			R.getCita().mostrar();
			cont++;
			System.out.println("------------------------------");
			R = R.getSig();
		}
	}
	void adiFinal(Cita z) {
		NodoCita nuevo =  new NodoCita();
		nuevo.setCita(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoCita R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoCita eliPrimero() {
		NodoCita x = new NodoCita();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				P = P.getSig();
				P.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	NodoCita eliFinal() {
		NodoCita x = new NodoCita();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoCita R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoCita aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Cita z = new Cita();
			System.out.println("\t CITA ["+i+"]");
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Cita z = new Cita();
			System.out.println("\t CITA ["+i+"]");
			z.leer();
			adiFinal(z);
		}
	}
}
