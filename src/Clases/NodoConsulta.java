package Clases;

public class NodoConsulta{
	private Consulta Consulta;
	private NodoConsulta sig; //definiendo el campo enlace sig
	
	public NodoConsulta() {  //constructor
		sig = null;
	}

	public Consulta getConsulta() {
		return Consulta;
	}

	public void setConsulta(Consulta consulta) {
		Consulta = consulta;
	}

	public NodoConsulta getSig() {
		return sig;
	}

	public void setSig(NodoConsulta sig) {
		this.sig = sig;
	}
	
}
