package javabeans;

public abstract class Persona {
// Tras crear la pclase abstracta Persona, y creo los atributos privados
	
	private String nif, nombre, direccion, telefono;

	
//Hacemos el constructor con todo y vacío
	
	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Persona() {
		super();
	}
// Geeneramos los getters y setters
	
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

//Generamos el toString()

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}


//Escribimos los métodos propios de la clase
	
	public String llamar(Persona persona) {
		return this.nombre + " llamando a " + persona.getNombre();
	}

	public abstract String trabajar();
	
	

}
