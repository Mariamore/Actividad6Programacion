package javabeans;
//Creamos la clase Alumno, que hereda de Persona
public class Alumno extends Persona{
//Creamos el atributo privado de alumno
	
	private String curso;
//Generamos los getter y setter del atributo curso

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
/*
 * Hacemos el constructor con todo, que hereda de Persona los atributos nif, nombre, dirección y teléfono, 
 * más el atributo propio, curso
 */
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}
//Generamos el constructor vacío que aporta los valores por defecto de los atributos
	public Alumno(String nif, String nombre, String direccion, String telefono) {
		super(nif, nombre, direccion, telefono);
	}
//Generamos el toString()
		@Override
		public String toString() {
			return "Alumno [nif= " + this.getNif() + ", nombre= " + this.getNombre() + ", direccion= " + this.getDireccion() + 
					", telefono= " + this.getTelefono() + ", curso= " + curso + "]";
		}
		
//Sobreescribimos el método heredado de Persona trabajar()
	@Override
	public String trabajar() {
		return "El alumno " + this.getNombre() + " va a estudiar para el curso " + this.curso;
	}
	
//Generamos el método propio hacerExamen()
	
	public String hacerExamen() {
		return "El alumno " + this.getNombre() + " va a hacer su examen.";
	}



}
