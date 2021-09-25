package Gale_Shapley;
import java.util.*;

public class Hombre extends Persona {
	
	public Hombre(String Nombre) {
		super(Nombre);
	}
	
	public void setPareja(Persona m) {
		if(esMujer(m)==true)
			super.setPareja(m);
	}
	
	public boolean esMujer(Persona p) {
		if(p instanceof Hombre)
			return false;
		return true;
	}
	
	public void setPreferencia(ArrayList<Persona> ListM) {
		super.setPreferencia(ListM);
	}
	
	public void propuesta() {
		if(this.preferencia==null)
			return;
		Mujer m = (Mujer) this.preferencia.get(0);
		m.addProp(this);
		this.preferencia.remove(0);
	}

}
