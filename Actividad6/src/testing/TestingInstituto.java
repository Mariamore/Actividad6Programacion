package testing;

import javabeans.Administrativo;
import javabeans.Alumno;
import javabeans.Persona;
import javabeans.Profesor;
import modelo.dao.InstitutoDao;
import modelo.dao.InstitutoDaoImplList;

public class TestingInstituto {

	public static void main(String[] args) {

		InstitutoDao miInstituto = new InstitutoDaoImplList();
		
		Persona p3 = new Alumno("58203698K", "Paz Zuñiga", "C/ Santo Tomás, 74", "684123655", "2º de Bachillerato");
		Persona p4 = new Profesor("70256987L", "Alberto Rodríguez", "C/ General Díaz Porlier, 58", "658471230", "Inglés");
		Persona p5 = new Alumno("551248779T", "Víctor Fontán", "C/ Santo Tomás, 55", "658963221", "1º de Bachillerato");
		Persona p6 = new Administrativo("54236988G", "Almudena Santos", "C/ Clara Campoamor, 88", "641236974", "Gestión de incidencias y asistencia al profesorado");

//Procedemos a probar el método alta persona, importando las clases Profesor, Alumno y Administrativo
		
		miInstituto.altaPersona(p3);
		miInstituto.altaPersona(p4);
		miInstituto.altaPersona(p5);
		miInstituto.altaPersona(p6);
		
//Ahora hacemos un syso de mi Instituto, para comprobar que se han dado de alta las personas
		System.out.println(miInstituto+"\n");
	
		System.out.println("Prueba método buscarPersona" + "\n");
//Procedemos a probar el método buscarPersona por el nif
		
		System.out.println("Datos de la persona con NIF 516632211R: " + miInstituto.buscarPersona("516632211R") + "\n");
		System.out.println("Datos de la persona con NIF 58203698K: " + miInstituto.buscarPersona("58203698K") + "\n");
		System.out.println("Datos de la persona con NIF 70256987L: " + miInstituto.buscarPersona("70256987L") + "\n");
		
		System.out.println("Prueba del método buscarTodas" + "\n");
		
//Procedemos a probar el método buscarTodas()
		System.out.println(miInstituto.buscarTodas());
		System.out.println("Prueba método buscarPersonaPorTipo");
		
		System.out.println("Prueba del método eliminarPersona" + "\n");
		
//Procedemos a probar el método eliminarPersona
		
		miInstituto.eliminarPersona(p5);
//Ahora hacemos un syso de miInstituto, para comprobar que se haya eliminado la persona p5		
		
		System.out.println(miInstituto+"\n");
		
		System.out.println("Prueba del método buscarPersonasPorTipo con la clase Profesor");
		
//Procedemos a probar el método buscarPersonasPorTipo con profesores
		
		System.out.println(miInstituto.buscarPersonasPorTipo("Profesor")+"\n");
		
		System.out.println("Prueba del método buscarPersonasPorTipo con la clase Alumno");
		
//Procedemos a probar el método buscarPersonasPorTipo con alumnos
		
		System.out.println(miInstituto.buscarPersonasPorTipo("Alumno")+"\n");
		
		System.out.println("Prueba del método buscarPersonasPorTipo con la clase Administrativo");
		
//Procedemos a probar el método buscarPersonasPorTipo con administrativos
		
		System.out.println(miInstituto.buscarPersonasPorTipo("Administrativo")+"\n");
	}
	

}
