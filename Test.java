package Gale_Shapley;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Hombre> ListH =new ArrayList<Hombre>();
		ArrayList<Mujer> ListM =new ArrayList<Mujer>();
		
		Mujer m1 = new Mujer("Amy");
		Mujer m2 = new Mujer("Bertha");
		Mujer m3 = new Mujer("Claire");
		Mujer m4 = new Mujer("Diane");
		Mujer m5 = new Mujer("Erika");
		
		Hombre h1 = new Hombre("Victor");
		Hombre h2 = new Hombre("Willian");
		Hombre h3 = new Hombre("Xavier");
		Hombre h4 = new Hombre("Yancey");
		Hombre h5 = new Hombre("Zeus");
		
		m1.setPreferencia(new ArrayList<Persona>(Arrays.asList(h5,h1,h2,h4,h3)));
		m2.setPreferencia(new ArrayList<Persona>(Arrays.asList(h3,h2,h4,h1,h5)));
		m3.setPreferencia(new ArrayList<Persona>(Arrays.asList(h2,h3,h4,h5,h1)));
		m4.setPreferencia(new ArrayList<Persona>(Arrays.asList(h1,h5,h4,h3,h2)));
		m5.setPreferencia(new ArrayList<Persona>(Arrays.asList(h4,h2,h5,h3,h1)));
		
		h1.setPreferencia(new ArrayList<Persona>(Arrays.asList(m2,m1,m4,m5,m3)));
		h2.setPreferencia(new ArrayList<Persona>(Arrays.asList(m4,m2,m1,m3,m5)));
		h3.setPreferencia(new ArrayList<Persona>(Arrays.asList(m2,m5,m3,m4,m1)));
		h4.setPreferencia(new ArrayList<Persona>(Arrays.asList(m1,m4,m3,m2,m5)));
		h5.setPreferencia(new ArrayList<Persona>(Arrays.asList(m2,m4,m1,m5,m3)));
		
		ListH.add(h1);
		ListH.add(h2);
		ListH.add(h3);
		ListH.add(h4);
		ListH.add(h5);
		
		ListM.add(m1);
		ListM.add(m2);
		ListM.add(m3);
		ListM.add(m4);
		ListM.add(m5);
		
		Gale g=new Gale();
		g.GaleShapley(ListH,ListM);
	}

}
