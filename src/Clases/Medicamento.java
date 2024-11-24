package Clases;
import java.util.Scanner;

public class Medicamento {
	private
	String nombre,indicaciones;
	int dosis,precio;
	public Medicamento() {
		// TODO Esbozo de constructor generado automáticamente
	}
	
	public Medicamento(String nombre, String indicaciones, int dosis, int precio) {
		super();
		this.nombre = nombre;
		this.indicaciones = indicaciones;
		this.dosis = dosis;
		this.precio = precio;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre del medicamento: ");
		nombre=sc.next();
		System.out.println("Intro dosisis: ");
		dosis=sc.nextInt();
		System.out.println("Inttroduce las indicaciones: ");
		indicaciones=sc.next();
		System.out.println("Intro el precio: ");
		precio=sc.nextInt();
	}
	void mostrar() {
		System.out.println("NOMBRE MEDICAMENTO : "+nombre);
		System.out.println("DOSIS: "+dosis);
		System.out.println("INDICACIONES : "+indicaciones);
		System.out.println("PRECIO: "+precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}

	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	
}
