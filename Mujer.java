package Gale_Shapley;
import java.util.*;

public class Mujer extends Persona{
	
	protected HashSet<Persona> p=new HashSet<Persona>();
	
	public Mujer(String nombre) {
		super(nombre);
	}
	
	public void setPareja(Persona h) {
		if(esHombre(h)==true)
			super.setPareja(h);
	}
	
	public boolean esHombre(Persona p) {
		if(p instanceof Hombre)
			return true;
		return false;
	}
	
	public void setPreferencia(ArrayList<Persona>listM) {
		super.setPreferencia(listM);
	}
	
	public void addProp(Persona h) {
		esHombre(h);
		this.p.add(h);
	}

	public HashSet<Persona> getProp(){
		return p;
	}
	
	public void setProp(HashSet<Persona> prop) {
		this.p=prop;
	}
	
	public void rechazar() {
		for(int i=0;i<this.preferencia.size();i++) {
			Hombre h=(Hombre)this.preferencia.get(i);
			if(this.p.contains(h)) {
				this.p.clear();
				this.p.add(h);
				this.setPareja(h);
				h.setPareja(this);
				return;
			}
		}
	}
}
