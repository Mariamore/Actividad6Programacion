package javabeans;
//Creamos la clase Prfesor, que hereda de Persona
public class Profesor extends Persona{
//Creamos sus atributos privados
	
	private String competencias;
	
//Hacemos los getter y setter del atributo competencias
	
	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

/*
 * Hacemos el constructor con todo, que hereda de Persona los atributos nif, nombre, dirección y teléfono, 
 * más el atributo propio, competencias
 */

	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}
//Generamos el constructor vacío que aporta los valores por defecto de los atributos
	public Profesor(String nif, String nombre, String direccion, String telefono) {
	super(nif, nombre, direccion, telefono);
}
//Generamos el toString()
	@Override
	public String toString() {
		return "Profesor [nif = " + this.getNif() + ", nombre = " + this.getNombre() + ", direccion = " + this.getDireccion() + 
				", telefono = " + this.getTelefono() + ", competencias = " + competencias + "]";
	}

//Sobreescribimos el método heredado de Persona trabajar()
	@Override
	public String trabajar() {
		return "El profesor " + this.getNombre() + " va a impartir su clase.";
	}
//Generamos un método propio de la clase Profesor
	
	public String ponerNotas() {
		return "El profesor " + this.getNombre() + " va a corregir los exámenes.";
	}
	
}
