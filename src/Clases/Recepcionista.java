package Clases;

import java.util.Scanner;

public class Recepcionista {
	private
	String nombre,horario,turno;
	public Recepcionista() {
		
	}
	public Recepcionista(String nombre, String horario, String turno) {
		super();
		this.nombre = nombre;
		this.horario = horario;
		this.turno = turno;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre: ");
		nombre=sc.next();
		System.out.println("Intro horario: ");
		horario=sc.next();
		System.out.println("Intro turno: ");
		turno=sc.next();
	}
	void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Horario: "+horario);
		System.out.println("Turno: "+turno);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
}
