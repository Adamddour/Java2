package oopKlausur;

import java.util.ArrayList;

public class Anwendersystem2 {

	
		ArrayList<Artikel> artikelliste=new ArrayList<Artikel>();
		//private ArrayListMitAusgabe<Artikel> artikelliste=new ArrayListMitAusgabe<>();
		// Fügt Artikel zur Artikelliste hinzu
	    public void fuelleArtikelliste() {
	        this.artikelliste.add(new Tablette(1, "Tablette gegen Entzündungen", "12,90 Euro", 50, "Eisenkraut", 50));
	        this.artikelliste.add(new Salbe(2, "Zinksalbe", "8,90 Euro", 30, 75, 5.5f));
	        this.artikelliste.add(new Seife(3, "Kernseife", "3,90 Euro", 20, 100, 6.5f, "neutral"));
	    }

	    // Gibt die Artikelliste aus
	    public <T extends Artikel> void gibArtikellisteAus(ArrayList<T> artikelliste) {
	    	
	    	//String[] zeilen=artikelliste.gibListeAlsZeilenZurueck();
	        for(Artikel artikel:artikelliste) {
	        	System.out.println(artikel.gibAttributeZurueck());
	        }
	    }
	    
	    
	    public void selektiereSeifenSalben(ArrayList<? super Salbe> ziel,ArrayList<? extends Artikel> quelle) { 
	    	
	    	for(Artikel artikel : quelle) { 
	    		
	    		  if(artikel instanceof Salbe) { 
	    		     ziel.add((Salbe)artikel); 
	    		 }    
	    	}   
	   } 

	    public static void main(String[] args) {
	        Anwendersystem2 anw = new Anwendersystem2();
	        anw.fuelleArtikelliste();
	        ArrayList<Salbe> listeSeifenSalben = new ArrayList<Salbe>(); 
	        anw.selektiereSeifenSalben(listeSeifenSalben, anw.artikelliste); 
	        anw.gibArtikellisteAus(listeSeifenSalben);   
	    }

	    //zeilen->artikelliste->ArrayListMitAusgabe -> gibAttributeZurueck
	

}
