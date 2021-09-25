package Gale_Shapley;
import java.util.*;

public class Gale {
	
	public void GaleShapley(ArrayList<Hombre> ListH, ArrayList<Mujer> ListM ) {
		while(mujerSolt(ListM)){
			for(int i=0;i<ListH.size();i++) {
				if(ListH.get(i).soltero())
					ListH.get(i).propuesta();
			}
			
			for(int i=0;i<ListM.size();i++) {
				if(ListM.get(i).getProp().size()>1)
					ListM.get(i).rechazar();
			}
			System.out.println(" ");
			System.out.println("Resultados : ");
			System.out.println(" ");
			for(int i=0; i < ListH.size();i++) {
				Hombre h=ListH.get(i);
				if(h.soltero()) {
					System.out.print(h.getNombre());
					System.out.println(" Esta Soltero ");
				}
				else {
					System.out.print(h.getNombre());
					System.out.print(" y ");
					System.out.print(h.getPareja().getNombre());
					System.out.println(" estan juntos");
				}
			}
			
			for(int i=0;i<ListM.size();i++) {
				Mujer m = ListM.get(i);
				if(m.soltero()) {
					System.out.print(m.getNombre());
					System.out.println(" Esta Soltera ");
				}
				else {
					System.out.print(m.getNombre());
					System.out.print(" y ");
					System.out.print(m.getPareja().getNombre());
					System.out.println(" estan juntos");
				}
			}
		}
	}
	
	public boolean mujerSolt(ArrayList<Mujer>ListM) {
		for(int i=0;i<ListM.size();i++) 
			if(ListM.get(i).soltero())
				return true;
			return false;
	}

}
