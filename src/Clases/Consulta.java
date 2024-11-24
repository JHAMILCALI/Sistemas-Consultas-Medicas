package Clases;

import java.util.Scanner;

public class Consulta {
	private
	 String fecha,hora,sala,atendido,tipo_emergencia,motivo,Doc_Nombre_Atender;
	 Paciente Paciente = new Paciente();
	public Consulta(){
		
	}
	public Consulta(String fecha, String hora, String sala,String atendido, String tipo_emergencia, String motivo, String doc_Nombre_Atender,Paciente paciente) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.sala = sala;
		this.atendido = atendido;
		this.tipo_emergencia = tipo_emergencia;
		this.motivo = motivo;
		this.Doc_Nombre_Atender = doc_Nombre_Atender;
		this.Paciente = paciente;
	}
	void leer() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Intro fecha Consulta: ");
		fecha=sc.next();
		System.out.println("Intro hora Consulta: ");
		hora=sc.next();
		System.out.println("Intro sala: ");
		sala=sc.next();
		System.out.println("Intro atendido (si) (no): ");
		atendido=sc.next();
		System.out.println("Intro tipo_emergencia: ");
		tipo_emergencia=sc.next();
		System.out.println("Intro Motivo: ");
		motivo=sc.next();
		System.out.println("Intro nombre Doctor:");
		Doc_Nombre_Atender=sc.next();
		System.out.println("\t_____Intro datos de Paciente_____");
		Paciente.leer();
	}
	void mostrar() {
		System.out.println("Fecha consulta: "+fecha);
		System.out.println("Hora: "+hora);
		System.out.println("Sala: "+sala);
		System.out.println("Atendido: "+atendido);
		System.out.println("tipo_emergencia: "+tipo_emergencia);
		System.out.println("Motivo: "+motivo);
		System.out.println("Nombre DOctor: "+Doc_Nombre_Atender );
		System.out.println("\t_________PACIENTE______");
		Paciente.mostrar();
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getatendido() {
		return atendido;
	}
	public void setatendido(String atendido) {
		this.atendido = atendido;
	}
	public String gettipo_emergencia() {
		return tipo_emergencia;
	}
	public void settipo_emergencia(String tipo_emergencia) {
		this.tipo_emergencia = tipo_emergencia;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDoc_Nombre_Atender() {
		return Doc_Nombre_Atender;
	}
	public void setDoc_Nombre_Atender(String doc_Nombre_Atender) {
		Doc_Nombre_Atender = doc_Nombre_Atender;
	}
	public Paciente getPaciente() {
		return Paciente;
	}
	public void setPaciente(Paciente paciente) {
		Paciente = paciente;
	}
	
	
	

}
