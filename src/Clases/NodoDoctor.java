package Clases;



public class NodoDoctor {
	private Doctor Doctor;
	
	private NodoDoctor sig; //definiendo el campo enlace sig
	private NodoDoctor ant;
	
	public NodoDoctor() {  //constructor
		sig = null;
		ant = null;
	}

	public Doctor getDoctor() {
		return Doctor;
	}

	public void setDoctor(Doctor Doctor) {
		this.Doctor = Doctor;
	}

	public NodoDoctor getSig() {
		return sig;
	}

	public void setSig(NodoDoctor sig) {
		this.sig = sig;
	}

	public NodoDoctor getAnt() {
		return ant;
	}

	public void setAnt(NodoDoctor ant) {
		this.ant = ant;
	}

	
}
