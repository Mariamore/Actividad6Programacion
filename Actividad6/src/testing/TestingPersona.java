package testing;

import javabeans.Administrativo;
import javabeans.Alumno;
import javabeans.Persona;
import javabeans.Profesor;

public class TestingPersona {

	public static void main(String[] args) {
//Para realizar el testing, creamos un objeto profesor
	 Persona p1 = new Profesor("516632211R", "Carlos Robles", "C/ Pez Volador, 35", "616669922", "Matemáticas y lengua");
 /*
  * Ejecutamos el método toString() haciendo un casting a la clase Profesor, para que se utilice 
  * el método sobreescrito de la clase Profesor
  */
	 System.out.println(p1.toString());
	 
/*
 * Ahora ejecutamos el método trabajar() haciendo casting a la clase Profesor, para que se ejecute el
 * método sobreescrito de dicha clase
 */
	 System.out.println(p1.trabajar()+"\n");
	 
//Creamos ahora un objeto de la clase Alumno
	 
	 Persona p2 = new Alumno("532224411A", "Alicia Torres", "C/ Luna Lunera, 45", "639889999", "1º de Bachillerato");
 /*
  * Ejecutamos el método toString(), y se ejecutará el propio de la clase Alumno
  */
	 System.out.println(p2.toString());
		 
 /*
  * Ahora ejecutamos el método trabajar() y se ejecuta el
  * método sobreescrito de la clase Alumno
  */
		 System.out.println(p2.trabajar()+"\n");	 

//Creamos un objeto de la clase Administrativo
	Persona p3 = new Administrativo("123454411A", "Rosa Torres", "C/ Luna Lunera, 45", "639889999", "Hacer matrículas y controlar asistencia");
	
 /*
  * Ejecutamos el método toString(), y se ejecutará el propio de la clase Alumno
  */
 	
	System.out.println(p3.toString());
			 
 /*
  * Ahora ejecutamos el método trabajar() y se ejecuta el
  * método sobreescrito de la clase Alumno
  */
	 System.out.println(p3.trabajar()+"\n");	 
	 
//Ahora, ejecutamos el método llamar() para que el alumno llame al profesor
	 System.out.println(p2.llamar(p1)+"\n");
	 
/*
 * A continuación, ejecutamos el método ponerNotas() del objeto profesor haciendo casting a la
 * clase Profesor para poder ejecutar su método propio
 */
	 
	 System.out.println(((Profesor)p1).ponerNotas());
	 
/*
 * Ahora, ejecutamos el método hacerExamen() del objeto alumno, haciendo casting a la clase
 * Alumno, para poder ejecutar su método propio
 */
	 System.out.println(((Alumno)p2).hacerExamen());
	 
/*
 * Por último, ejecutamos el método gestionarMatricula() del objeto administrativo, haciendo
 * casting a la clase Administrativo para pdoer ejecutar dicho método propio
 */
	 System.out.println(((Administrativo)p3).gestionarMatricula());
	}	
}
