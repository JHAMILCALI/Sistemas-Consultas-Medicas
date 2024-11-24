package Clases;

import java.util.Scanner;

public class Emergencia {
	private
	String nivel_gravedad,descripcion;
	public Emergencia() {
		
	}
	public Emergencia(String nivel_gravedad, String descripcion) {
		super();
		this.nivel_gravedad = nivel_gravedad;
		this.descripcion = descripcion;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nivel gravedad: ");
		nivel_gravedad=sc.next();
		System.out.println("Intro descripcion: ");
		descripcion=sc.next();
	}
	void mostrar() {
		System.out.println("Nivel de gravedada: "+ nivel_gravedad);
		System.out.println("Descripcion: "+descripcion);
	}
	public String getNivel_gravedad() {
		return nivel_gravedad;
	}
	public void setNivel_gravedad(String nivel_gravedad) {
		this.nivel_gravedad = nivel_gravedad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
