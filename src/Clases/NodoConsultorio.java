package Clases;

public class NodoConsultorio {
	private Consultorio Consultorio;
	
	private NodoConsultorio sig; //definiendo el campo enlace sig
	private NodoConsultorio ant;
	
	public NodoConsultorio() {  //constructor
		sig = null;
		ant = null;
	}

	public Consultorio getConsultorio() {
		return Consultorio;
	}

	public void setConsultorio(Consultorio Consultorio) {
		this.Consultorio = Consultorio;
	}

	public NodoConsultorio getSig() {
		return sig;
	}

	public void setSig(NodoConsultorio sig) {
		this.sig = sig;
	}

	public NodoConsultorio getAnt() {
		return ant;
	}

	public void setAnt(NodoConsultorio ant) {
		this.ant = ant;
	}

	
}
