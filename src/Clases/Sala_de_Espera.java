package Clases;

import java.util.Scanner;

public class Sala_de_Espera {
	private
	PilaRecepcionista Recepcionista = new PilaRecepcionista();
	LS_NormalConsulta Consulta = new LS_NormalConsulta();
	ColaCircularEmergencia Emergencia = new ColaCircularEmergencia();
	LD_CircularConsultorio Consultorio = new LD_CircularConsultorio();
	public Sala_de_Espera() {
		
	}
	public void Sala_de_Espera(PilaRecepcionista recepcionista, LS_NormalConsulta consulta,
			ColaCircularEmergencia emergencia, LD_CircularConsultorio consultorio) {
		
		this.Recepcionista = recepcionista;
		this.Consulta = consulta;
		this.Emergencia = emergencia;
		this.Consultorio = consultorio;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("\t_________RECEPCIONISTA_________");
		System.out.println("Introduce la cantidadad de recepcionista: ");
		a=sc.nextInt();
		Recepcionista.llenar(a);
		System.out.println("\t_________CONSULTAS_________");
		System.out.println("Introduce la cantidadad de consultas: ");
		b=sc.nextInt();
		Consulta.llenar1(b);
		System.out.println("\t_________EMERGENCIA_________");
		System.out.println("Introduce la cantidadad de emergencia: ");
		c=sc.nextInt();
		Emergencia.llenar(c);
		System.out.println("\t_________CONSULTORIO_________");
		System.out.println("Introduce la cantidadad de consultorio: ");
		d=sc.nextInt();
		Consultorio.leer1(d);
	}
	void mostrar() {
		System.out.println("\t_________RECEPCIONISTA_________");
		Recepcionista.mostrar();
		System.out.println("\t_________CONSULTAS_________");
		Consulta.mostrar();
		System.out.println("\t_________EMERGENCIA_________");
		Emergencia.mostrar();
		System.out.println("\t_________CONSULTORIO_________");
		Consultorio.mostrar();
	}
	public void llenar() {
		// tipos de urgencia
				// Emergencia, urgencia,atencion Prioritaria,conuslta general
				// ======PACIENTE 1=================
				PilaMedicamento P1M1 = new PilaMedicamento();
				P1M1.adi(new Medicamento("Paracetamol", "Cada 8 horas", 4, 3));
				P1M1.adi(new Medicamento("Hidriax", "Despuede de cada comida", 45, 10));
				PilaMedicamento P1M2 = new PilaMedicamento();
				P1M2.adi(new Medicamento("Protector solar", "Al salir a la calle ponerse en el rostro", 1, 90));
				// --------CITA P1----------
				LD_NormalCita Ci1 = new LD_NormalCita();
				Ci1.adiFinal(new Cita("123AB", "12/04/2023", "12:30", "Rostro", "Se le acoseja no exponerse al sol.", "Neytan",P1M1));
				Ci1.adiFinal(new Cita("124AB", "12/03/2023", "14:45", "Rostro", "Se le acoseja usara protector solar", "Neytan",P1M2));
				//-------HISTORILA P1-------
				Historial H1 = new Historial("123A","Normal","Topico",Ci1);
				Paciente P1 = new Paciente("123ABC1","Jose",45,89765356,H1);
				Paciente P2 = new Paciente("123ABC1","Karen",34,89765356,H1);
				//--------CONSULTA 1-----------
				LS_NormalConsulta Co1 = new LS_NormalConsulta();
				
				Co1.adiFinal(new Consulta("23/11/2024","00:30","B4-2","No","Media","Dolor de cabeza","Manolo",P2));
				Co1.adiFinal(new Consulta("23/11/2024","00:30","B4-2","No","Baja","Dolor de cabeza","Manolo",P2));
				Co1.adiFinal(new Consulta("23/11/2024","00:30","B4-2","No","Alta","Dolor de cabeza","Manolo",P2));
				Co1.adiFinal(new Consulta("23/11/2024","00:30","B4-2","No","Alta","Dolor de cabeza","Manolo",P2));
				Co1.adiFinal(new Consulta("23/11/2024","00:30","B4-2","No","Baja","Dolor de cabeza","Manolo",P2));
				Co1.adiFinal(new Consulta("23/11/2024","12:30","B4-2","No","Alta","Dolor de cabeza","Neytan",P1));
				// Doctores
				LD_CircularDoctor doc1 = new LD_CircularDoctor();
				doc1.adiFinal(new Doctor("Mañana","Neytan","Dermatologo",762537738,20));
				LD_CircularDoctor doc2 = new LD_CircularDoctor();
				doc2.adiFinal(new Doctor("Tarde","Jorge","Cardiólogo ",877364774,34));
				LD_CircularDoctor doc3 = new LD_CircularDoctor();
				doc3.adiFinal(new Doctor("Mañana", "Carlos", "Cardiólogo", 987654321, 15));
				LD_CircularDoctor doc4 = new LD_CircularDoctor();
				doc4.adiFinal(new Doctor("Tarde", "Ana", "Infectóloga", 876543210, 22));
				LD_CircularDoctor doc5 = new LD_CircularDoctor();
				doc5.adiFinal(new Doctor("Mañana", "Marta", "Endocrinóloga", 765432109, 18));
				LD_CircularDoctor doc6 = new LD_CircularDoctor();
				doc6.adiFinal(new Doctor("Tarde", "Juan", "Neumólogo", 654321098, 25));
				
				
				// Consultorios
				LD_CircularConsultorio con = new LD_CircularConsultorio();
				con.adiFinal(new Consultorio("Dermatologia","62532AC",doc1));
				con.adiFinal(new Consultorio("Cardiólogia","62532AB",doc2));
				con.adiFinal(new Consultorio("Cardiología", "72532AC", doc3));
				con.adiFinal(new Consultorio("Infectología", "72532AB", doc4));
				con.adiFinal(new Consultorio("Endocrinología", "72532AD", doc5));
				con.adiFinal(new Consultorio("Neumología", "72532AE", doc6));
				
				
				//Emergencia
				ColaCircularEmergencia Eme = new ColaCircularEmergencia();
				Eme.adi(new Emergencia("Baja","Revisión de síntomas leves como un resfriado, dolor de cabeza, controles médicos regulares"));
				Eme.adi(new Emergencia("Media","Dolor abdominal severo, heridas moderadas, fiebre alta en un niño"));
				Eme.adi(new Emergencia("Alta","Infarto, dificultad respiratoria severa, hemorragia intensa"));

				
				//Recepcionista
				PilaRecepcionista Rec = new PilaRecepcionista();
				Rec.adi(new Recepcionista("Ana","07:00 - 12:00","Mañana"));
				Rec.adi(new Recepcionista("Ana","12:00 - 18:00","Tarde"));
				Rec.adi(new Recepcionista("Ana","18:00 - 00:00","Noche"));
				
				//SALA DE ESPERA
				//Sala_de_Espera sala = new Sala_de_Espera(Rec,Co1,Eme,con);
				this.Sala_de_Espera(Rec, Co1, Eme, con);
				//sala.leer();
	}
	public PilaRecepcionista getRecepcionista() {
		return Recepcionista;
	}
	public void setRecepcionista(PilaRecepcionista recepcionista) {
		Recepcionista = recepcionista;
	}
	public LS_NormalConsulta getConsulta() {
		return Consulta;
	}
	public void setConsulta(LS_NormalConsulta consulta) {
		Consulta = consulta;
	}
	public ColaCircularEmergencia getEmergencia() {
		return Emergencia;
	}
	public void setEmergencia(ColaCircularEmergencia emergencia) {
		Emergencia = emergencia;
	}
	public LD_CircularConsultorio getConsultorio() {
		return Consultorio;
	}
	public void setConsultorio(LD_CircularConsultorio consultorio) {
		Consultorio = consultorio;
	}
	
	
}