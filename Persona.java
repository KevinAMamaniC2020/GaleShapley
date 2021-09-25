package Gale_Shapley;
import java.util.*;

public class Persona {
	protected String nombre;
	protected ArrayList<Persona> preferencia;
	protected Persona pareja;
	
	public Persona(String nombre) {
		this.preferencia=new ArrayList<Persona>();
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Persona> getPreferencia() {
		return preferencia;
	}
	public void setPreferencia(ArrayList<Persona> preferencia) {
		this.preferencia = preferencia;
	}
	public Persona getPareja() {
		return pareja;
	}
	public void setPareja(Persona pareja) {
		this.pareja = pareja;
	}
	
	public boolean soltero() {
		return(getPareja()==null);
	}
	

}
