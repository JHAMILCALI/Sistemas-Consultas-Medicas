package Clases;
import java.util.Scanner;

public class Doctor {
	private
	String turno,nombre,especialidad;
	int ci,edad;
	public Doctor() {
		
	}
	public Doctor(String turno, String nombre, String especialidad, int ci, int edad) {
		super();
		this.turno = turno;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.ci = ci;
		this.edad = edad;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro Turno: ");
		turno=sc.next();
		System.out.println("Intro Nombre Doc: ");
		nombre=sc.next();
		System.out.println("Intro Especialidad: ");
		especialidad=sc.next();
		System.out.println("Intro CI: ");
		ci=sc.nextInt();
		System.out.println("Intro edad: ");
		edad=sc.nextInt();
	}
	void mostrar() {
		System.out.println("TURNO: "+turno);
		System.out.println("NOMBRE DOC: "+nombre);
		System.out.println("Especialidad: "+especialidad);
		System.out.println("CI: "+ci);
		System.out.println("EDAD: "+edad);
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
