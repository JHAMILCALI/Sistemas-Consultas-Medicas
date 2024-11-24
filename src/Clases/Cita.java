package Clases;
import java.util.Scanner;

public class Cita {
	private
	String id,fecha,hora,motivo,notaInf,nomDoctorAtendido;
	PilaMedicamento medicamento = new PilaMedicamento();
	public Cita() {
		// TODO Esbozo de constructor generado automáticamente
	}

	public Cita(String id, String fecha, String hora, String motivo, String notaInf, String nomDoctorAtendido,
			PilaMedicamento medicamento) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.motivo = motivo;
		this.notaInf = notaInf;
		this.nomDoctorAtendido = nomDoctorAtendido;
		this.medicamento = medicamento;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro ID CITA: ");
		id=sc.next();
		System.out.println("Intro Fecha: ");
		fecha=sc.next();
		System.out.println("Intro hora: ");
		hora=sc.next();
		System.out.println("Intro motivo: ");
		motivo=sc.next();
		System.out.println("Intro Medico que atendio: ");
		nomDoctorAtendido=sc.next();
		System.out.println("Intro nota de Informacion: ");
		notaInf=sc.next();
		System.out.println("\t INTRODUCE CANTIDAD DE MEDICAMENTOS");
		int cantX=sc.nextInt();
		medicamento.llenar(cantX);
	}
	void mostrar() {
		System.out.println("ID Cita: "+id);
		System.out.println("FECHA: "+fecha);
		System.out.println("HORA: "+hora);
		System.out.println("MOTIVO: "+motivo);
		System.out.println("NOM MEDICO ATENCION: "+nomDoctorAtendido);
		System.out.println("NOTA DE INFORMACION: "+notaInf);
		System.out.println("\tDATOS DE MEDICAMNETOS");
		medicamento.mostrar();
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
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



	public String getMotivo() {
		return motivo;
	}



	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}



	public String getNotaInf() {
		return notaInf;
	}



	public void setNotaInf(String notaInf) {
		this.notaInf = notaInf;
	}



	public String getNomDoctorAtendido() {
		return nomDoctorAtendido;
	}



	public void setNomDoctorAtendido(String nomDoctorAtendido) {
		this.nomDoctorAtendido = nomDoctorAtendido;
	}



	public PilaMedicamento getMedicamento() {
		return medicamento;
	}



	public void setMedicamento(PilaMedicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	
}
