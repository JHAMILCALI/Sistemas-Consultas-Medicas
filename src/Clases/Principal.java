package Clases;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
            /**
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
                **/
		//Sala_de_Espera sala = new Sala_de_Espera(Rec,Co1,Eme,con);
		Sala_de_Espera sala = new Sala_de_Espera();
                sala.llenar();
                sala.mostrar();
                //sala.leer();
		//sala.mostrar();

		// =======================RESOLUCION DE LOS PROBLEMAS=======================
		Scanner sc = new Scanner(System.in);
		int q;
		while (true) {
			System.out.println("[1] BUSCAR PACIENTE X DE ESPECIALIDAD Y");
			System.out.println("[2] LISTAR LOS PACIENTES DE LA FECHA X");
			System.out.println("[3] PERSONA CON MAYOR EDAD DE LA SALA X");
			System.out.println("[4] MOVER AL PRINCIPIO LOS PACINTES DE URGENCIA");
			System.out.println("[5] MOSTRAR PACINTES DEL DOCTOR X");
			System.out.println("INTRO CUAL INGRESAR ");
			q = sc.nextInt();

			switch (q) {
			case 1:
//			    1. Buscar el paciente x que tiene una consulta en la especialidadY y mostrar su 
//				   historial y toda sus citas medicas 
				System.out.println("\n\tBUSCAR PACINETE X CON ESPECIALIDAD Y");
				System.out.println("Introduce el nombre Paciente X => ");
				//String PacienteX = sc.next();
				String PacienteX = "Jose";
				System.out.println("Introduce el Especialidad Y => ");
				//String EspecialidadY = sc.next();
				String EspecialidadY = "Dermatologia";
				Busqueda_PacienteX(sala,PacienteX,EspecialidadY);
				break;
			case 2:
//			    2.	Listar la cantidad de pacientes que tienen una consulta en la fecha x
			    System.out.println("\n\tLISTAR LOS PACIENTES CON COSULTA EN FECHA X");
			    System.out.println("Introduce la fecha X: ");
			    //String fechaX=sc.next();
			    String fechaX = "23/11/2024";
			    Listar_Pacientes_Con_Fecha_X(sala,fechaX);
			    
				break;
			case 3:
//			     3. Calcular el tiempo de espera de los pacientes no estnatan atendidos(No)
				System.out.println("\n\tCALCULAR TIMEPO DE ESPERA DE PACIENTES NO ATENDIDOS");
				calcular_tiempo_de_pacientes_no_atendidos(sala,"No");	
				break;
			case 4:
//				4. Ordenar las consultas por prioridades de tipo de emergencia (ALTA MEDIA BAJA)
				System.out.println("\n\t_______ORDENADA POR PRIORIDADES DE EMERGANCIA_________");
				ordenar_las_consultas_prioridades_emergencia(sala);
				break;
			case 5:
//				5. Dar prioridad a adultos mayores de 60 años por la  Ley N° 369 para la consultas a atender
				Mopver_Principio_adultos_Mayores_a_60_años(sala,60);
				break;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
				continue;
			}
			System.out.println("Desea realizar otra operación? (s/n)");
			String respuesta = sc.next();
			if (respuesta.equalsIgnoreCase("n")) {
				break;
			}
		}
		sc.close();
	}

	private static void Mopver_Principio_adultos_Mayores_a_60_años(Sala_de_Espera sala, int edad) {
		NodoConsulta R = sala.getConsulta().getP();
		NodoConsulta S = R;
		while (R!=null) {
			Consulta con = R.getConsulta();
			if (con.getPaciente().getEdad()>=edad) {
				if (R==sala.getConsulta().getP()) {
					R=R.getSig();
					S=R;
				}else {
					S.setSig(R.getSig());
					R = R.getSig();
					sala.getConsulta().adiPrincipio(con);
				}
			}else {
				S=R;
				R=R.getSig();

			}
		}
		System.out.println("\t==============CONSULTAS ORDENADAS POR MAYOR DE EDAD===============");
		mostrar_consultas_por_tipo_emergencia(sala);
		
	}

	private static void ordenar_las_consultas_prioridades_emergencia(Sala_de_Espera sala) {
		int nroElem = sala.getEmergencia().nroElem();
		System.out.println("\t==============CONSULTAS NO ORDENADAS===============");
		mostrar_consultas_por_tipo_emergencia(sala);
		for (int i = 0; i < nroElem; i++) {
			Emergencia eme = sala.getEmergencia().eli();
			sala.getEmergencia().adi(eme);
			ordenar_consultas(sala,eme.getNivel_gravedad());
		}
		System.out.println("\t==============CONSULTAS ORDENADAS===============");
		mostrar_consultas_por_tipo_emergencia(sala);
		
		
	}

	private static void mostrar_consultas_por_tipo_emergencia(Sala_de_Espera sala) {
		NodoConsulta R = sala.getConsulta().getP();
		while (R!=null) {
			Consulta con = R.getConsulta();
			System.out.println("Fecha consulta: "+con.getFecha());
			System.out.println("Hora: "+con.getHora());
			System.out.println("Sala: "+con.getSala());
			System.out.println("Atendido: "+con.getatendido());
			System.out.println("tipo_emergencia: "+con.gettipo_emergencia());
			System.out.println("Motivo: "+con.getMotivo());
			System.out.println("Nombre DOctor: "+con.getDoc_Nombre_Atender());
			System.out.println("\tNOMBRE DEL PACIENTE: "+con.getPaciente().getNombre());
			System.out.println("\tEDAD DEL PACIENTE: "+con.getPaciente().getEdad());
			System.out.println("____________________________________________");
			R=R.getSig();
		}
		
	}

	private static void ordenar_consultas(Sala_de_Espera sala, String nivel_gravedad) {
		NodoConsulta R = sala.getConsulta().getP();
		NodoConsulta S = R;
		while (R!=null) {
			Consulta con = R.getConsulta();
			if (con.gettipo_emergencia().equals(nivel_gravedad)) {
				if (R==sala.getConsulta().getP()) {
					R=R.getSig();
					S=R;
				}else {
					S.setSig(R.getSig());
					R = R.getSig();
					sala.getConsulta().adiPrincipio(con);
				}
			}else {
				S=R;
				R=R.getSig();
			}
		}
	}

	private static void calcular_tiempo_de_pacientes_no_atendidos(Sala_de_Espera sala, String no) {
	    NodoConsulta R = sala.getConsulta().getP();
	    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
	    
	    while (R != null) {
	        Consulta con = R.getConsulta();
	        if (con != null && con.getatendido().equals(no)) {
	            try {
	                String hora = con.getHora();
	                if (hora == null || hora.isEmpty()) {
	                    System.out.println("Hora no válida para el paciente: " + con.getPaciente().getNombre());
	                    R = R.getSig();
	                    continue;
	                }
	                LocalTime horaInicial = LocalTime.parse(hora, formato);
	                LocalTime horaActual = LocalTime.now();
	                Duration duracion = Duration.between(horaInicial, horaActual);
	                if (duracion.isNegative()) {
	                    duracion = duracion.abs();
	                }
	                long horas = duracion.toHours();
	                long minutos = duracion.toMinutes() % 60;
	                String tiempoFormateado = String.format("%02d:%02d", horas, minutos);
	                System.out.println("El Paciente: " + con.getPaciente().getNombre() + " esperó el tiempo [" + tiempoFormateado + "]");
	            } catch (Exception e) {
	                System.out.println("Error procesando el tiempo para el paciente: " + con.getPaciente().getNombre());
	                e.printStackTrace();
	            }
	        }
	        R = R.getSig();
	    }
	}


	private static void Listar_Pacientes_Con_Fecha_X(Sala_de_Espera sala, String fechaX) {
		NodoConsulta R = sala.getConsulta().getP();
		System.out.println("\t====== PACIENTES DE LA FECHA "+fechaX+" ======");
		while (R!=null) {
			Consulta consul = R.getConsulta();
			if (consul.getFecha().equals(fechaX)) {
				String nombrePaciente = consul.getPaciente().getNombre();
				System.out.println("Paciente: "+nombrePaciente);
			}
			R=R.getSig();
		}
		
	}

	private static void Busqueda_PacienteX(Sala_de_Espera sala, String pacienteX, String especialidadY) {
		NodoConsulta R = sala.getConsulta().getP();
		while (R!=null) {
			Consulta co = R.getConsulta();
			if (co.getPaciente().getNombre().equals(pacienteX)) {
				String nombreDoc = co.getDoc_Nombre_Atender();
				if (verificar_Doctor_con_especialidad(nombreDoc,sala,especialidadY)) {
					co.Paciente.mostrar();
				}else {
					System.out.println("No se pudo encotrar resultados de "+pacienteX+" de la especialidad "+especialidadY);
				}
			}
			R=R.getSig();
		}
		
	}

	private static boolean verificar_Doctor_con_especialidad(String nombreDoc, Sala_de_Espera sala,
			String especialidadY) {
			NodoConsultorio R = sala.getConsultorio().getP();
			boolean sw = false;
			int n = sala.getConsultorio().nroNodos();
			for (int i = 0; i < n; i++) {
				Consultorio con = R.getConsultorio();
				if (con.getNomEspecialidad().equals(especialidadY)) {
					int n1 = con.getDoctor().nroNodos();
					NodoDoctor S = con.getDoctor().getP();
					for (int j = 0; j < n1; j++) {
						Doctor doc = S.getDoctor();
						if (doc.getNombre().equals(nombreDoc)) {
							sw=true;
						}
						S=S.getSig();
					}
				}
				R=R.getSig(); 
			}
		return sw;
	}


}
