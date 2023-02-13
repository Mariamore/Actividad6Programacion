package modelo.dao;

import java.util.List;

import javabeans.Persona;

public interface InstitutoDao {
	
	boolean altaPersona(Persona p);
	Persona buscarPersona(String nif);
	List<Persona> buscarTodas();
	boolean eliminarPersona (Persona persona);
	List<Persona> buscarPersonasPorTipo (String tipoPersona);
	
}
