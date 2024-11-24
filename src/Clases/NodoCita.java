package Clases;

//Lic Aruquipa Marcelo
public class NodoCita {
	private Cita Cita;
	private NodoCita ant;
	private NodoCita sig;
	
	NodoCita(){
		this.sig = null;
		this.ant = null;
	}

	public Cita getCita() {
		return Cita;
	}

	public void setCita(Cita Cita) {
		this.Cita = Cita;
	}

	public NodoCita getAnt() {
		return ant;
	}

	public void setAnt(NodoCita ant) {
		this.ant = ant;
	}

	public NodoCita getSig() {
		return sig;
	}

	public void setSig(NodoCita sig) {
		this.sig = sig;
	}
	
	
}
