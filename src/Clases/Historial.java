package Clases;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Historial {
	private
	String id,diagnostico,tratamiento;
	LD_NormalCita cita = new LD_NormalCita();
	public Historial() {
		// TODO Esbozo de constructor generado automáticamente
	}
	
	public Historial(String id, String diagnostico, String tratamiento, LD_NormalCita cita) {
		super();
		this.id = id;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
		this.cita = cita;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el ID Historial: ");
		id=sc.next();
		System.out.println("Introduce Diagnostico: ");
		diagnostico=sc.next();
		System.out.println("Introduce Tratamiento: ");
		tratamiento=sc.next();
		System.out.println("\tIntroduce la cantidad de Citas medicas: ");
		int cantX=sc.nextInt();
		cita.leer1(cantX);
	}
	void mostrar() {
		System.out.println("ID HISTORIAL: "+id);
		System.out.println("DIAGNOSTICO: "+diagnostico);
		System.out.println("TRATAMIENTO: "+tratamiento);
		System.out.println();
		cita.mostrar();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public LD_NormalCita getCita() {
		return cita;
	}

	public void setCita(LD_NormalCita cita) {
		this.cita = cita;
	}

	
}
