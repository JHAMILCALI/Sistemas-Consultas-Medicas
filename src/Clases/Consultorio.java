package Clases;
import java.util.Scanner;

public class Consultorio {
	private
	String nomEspecialidad,id;
	LD_CircularDoctor doctor = new LD_CircularDoctor();
	public Consultorio() {
		// TODO Esbozo de constructor generado automáticamente
	}
	
	public Consultorio(String nomEspecialidad, String id, LD_CircularDoctor doctor) {
		super();
		this.nomEspecialidad = nomEspecialidad;
		this.id = id;
		this.doctor = doctor;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro Nombre Especialiad: ");
		nomEspecialidad=sc.next();
		System.out.println("Intro ID consultorio: ");
		id=sc.next();
		
		System.out.println("\tIntro Cantidad de Doctores");
		int cantX=sc.nextInt();
		doctor.leer1(cantX);
		
	}
	void mostrar() {
		System.out.println("NOMBRE CONSULTORIO: "+nomEspecialidad);
		System.out.println("ID CONSULTORIO: "+id);
		System.out.println("\tDOCTORES");
		doctor.mostrar();
	}

	public String getNomEspecialidad() {
		return nomEspecialidad;
	}

	public void setNomEspecialidad(String nomEspecialidad) {
		this.nomEspecialidad = nomEspecialidad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LD_CircularDoctor getDoctor() {
		return doctor;
	}

	public void setDoctor(LD_CircularDoctor doctor) {
		this.doctor = doctor;
	}
	
}
