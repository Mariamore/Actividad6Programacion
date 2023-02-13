package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javabeans.Administrativo;
import javabeans.Alumno;
import javabeans.Persona;
import javabeans.Profesor;

public class InstitutoDaoImplList implements InstitutoDao{
//Creamos el atributo ArrayList<Persona> personas, privado
	
	private ArrayList<Persona> personas;
//Generamos el método toString()	
@Override
	public String toString() {
		return "InstitutoDaoImplList [personas=" + personas + "]";
	}
//Generamos el constructor, con el método cargarDatos(), para que el ArrayList personas tenga contenido y poder hacer pruebas
	public InstitutoDaoImplList() {
		personas = new ArrayList<>();
		cargarDatos();
	}
	
//Creamos el método cargarDatos() 
	private void cargarDatos() {
		personas.add(new Profesor("516632211R", "Carlos Robles", "C/ Pez Volador, 35", "616669922", "Matemáticas y lengua"));
		personas.add(new Profesor("516632256H", "Sandra Gómez", "C/ Velazquez, 98", "659844123", "Geografía e historia"));
		personas.add(new Alumno("532224411A", "Alicia Torres", "C/ Luna Lunera, 45", "639889999", "1º de Bachillerato"));
		personas.add(new Alumno("00383238N", "Juan Serrano", "C/ Santa Hortensia, 115", "676432981", "3º de la ESO"));
		personas.add(new Administrativo("123454411A", "Rosa Torres", "C/ Luna Lunera, 45", "639889999", "Hacer matrículas y controlar asistencia"));
		personas.add(new Administrativo("70828546M", "Arturo González", "C/ Diego de León, 34", "656489741", "Hacer matrículas y atender consultas"));
	}
	
/*
 * Hacemos el método altaPersona, de forma que si la persona ya existe, devuelve false, y si no existe, la añade a la listta,
 * devolviendo true 	
 */
	@Override
	public boolean altaPersona(Persona p) {
		if (personas.contains(p))
			return false;
		else 
			return personas.add(p);
	}

/*
 * Hacemos el método buscarPersona de forma que hacemos un bucle for que recorra el ArrayList personas
 * y si el nif de alguno de los elementos de personas coincide con el que nos pasan en el método, devuelve
 * dicho elemento, si no, devuelve null.
 */

	@Override
	public Persona buscarPersona(String nif) {
		for (Persona ele: personas) {
			if (ele.getNif().equals(nif))
				return ele;
		}
		return null;		
	}
/*
 * Hacemos el método buscarTodas(), que queremos que nos devuelva todas las personas que contiene la lista, así que 
 * devuelve el ArrayList personas
 */
	@Override
	public List<Persona> buscarTodas() {
		return personas;
	}
/*
 * Hacemos el método eliminarPersona, usando sobre el ArrayList personas el método remove, que elimina del mismo la 
 * persona que le pasemos
 */
	@Override
	public boolean eliminarPersona(Persona persona) {
		return personas.remove(persona);
	}
/*
 * Hacemos el método buscarPersonasPorTipo, creando una nueva Lista de Persona, 
 * de forma que según el tipoPersona, entrará en uno de los tres bucles if. Dentro de cada uno de ellos 
 * hay un bucle for que recorre todo el ArrayList personas, y si la persona es instancia de la clase de persona 
 * adecuada según cada if interno al for, imprime el método propio de la clase y añade la persona a la Lista.
 * Al final el método devuelve la Lista creada.
 */
	@Override
	public List<Persona> buscarPersonasPorTipo(String tipoPersona) {
		List<Persona> lista = new ArrayList<>();
		String tipoPersonaLowerCase = tipoPersona.toLowerCase();
		for (Persona ele: personas) {
			switch (tipoPersonaLowerCase) {
			 case "profesor":
				 if (ele instanceof Profesor) {
						System.out.println(((Profesor)ele).ponerNotas());
						lista.add(ele);
					}
				 break;
			 case "alumno":
				 if (ele instanceof Alumno) {
						System.out.println(((Alumno)ele).hacerExamen());
						lista.add(ele);
					}
				 break;
			 case "administrativo":
				 if (ele instanceof Administrativo) {
						System.out.println(((Administrativo)ele).gestionarMatricula());
						lista.add(ele);
				 }
				 break;
			 default:
				 System.out.println("No encontrado");
			}
		
		}
		return lista;
	}
}	

