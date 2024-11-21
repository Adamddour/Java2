package oopKlausur;

import java.util.ArrayList;

public class ArrayListMitAusgabe <T extends Artikel> extends ArrayList<T>{

	public String[] gibListeAlsZeilenZurueck() { 
		
		  String[] ergebnis = new String[this.size()]; 
		  for(int i = 0; i < this.size(); i++) { 
		   ergebnis[i] = this.get(i).gibAttributeZurueck(); 
		  }
		  
		  return ergebnis; 
	} 
}
