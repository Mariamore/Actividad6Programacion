package javabeans;
//Creamos la clase Administrativo, que hereda de Persona
public class Administrativo extends Persona{
//Creamos el atributo privado
	private String tareas;
	
//Generamos el getter y el setter de tareas
	public String getTareas() {
		return tareas;
	}
	
	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
/*
 * Hacemos el constructor con todo, que hereda de Persona los atributos nif, nombre, dirección y teléfono, 
 * más el atributo propio, curso
 */

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

//Generamos el constructor vacío con los valores por defecto de los atributos
	public Administrativo(String nif, String nombre, String direccion, String telefono) {
		super(nif, nombre, direccion, telefono);
	}
//Generamos el toString()
	@Override
	public String toString() {
		return "Administrativo [nif= " + this.getNif() + ", nombre= " + this.getNombre() + ", direccion= " + this.getDireccion() + 
				", telefono= " + this.getTelefono() + ", tareas = " + tareas + "]";
	}
//Sobreescribimos el método heredado de Persona trabajar()
	@Override
	public String trabajar() {
		return "El administrativo " + this.getNombre() + " va a realizar estas tareas: " + tareas;
	}
//Creamos el método propio gestionarMatriclua()
	public String gestionarMatricula() {
		return "El administrativo " + this.getNombre() + " va a gestionar una matrícula.";
	}
}
