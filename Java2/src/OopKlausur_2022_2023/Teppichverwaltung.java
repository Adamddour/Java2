package OopKlausur_2022_2023;

import java.util.ArrayList;

public class Teppichverwaltung {

	private Teppich[] teppiche = new Teppich[2];
	
	private ArrayList<Teppich> tListe=new ArrayList<Teppich>();
	
	 
	
	 
	 
	
	private void fuelleTeppiche() { 
	  //this.teppiche[0] = new Teppich("111_high", true, 180, 300, 590); 
	  //this.teppiche[1] = new Teppich("222_low", false, 150, 270, 490); 
	  
		  //tListe.add(new Teppich("111_high", true, 180, 300, 590));
		  //tListe.add(new Teppich("222_low", false, 150, 270, 490));
		 
	 } 
	 
	
	 
	
	
	
	 private void schreibeTeppicheInCsvDatei() { 
	  try { 
	   Creator creator = new CsvExportCreator(); 
	   Export export = creator.factoryMethod(); 
	    export.schreibeTeppicheInDatei(tListe); 
	  } 
	  catch(Exception exc) { 
	   exc.printStackTrace(); 
	  } 
	 } 
	  
	 public static void main(String[] args) { 
		 
		 Teppich t1=new Teppich("111_high", true, 180, 300, 590);
		 OutdoorTeppich ot=new OutdoorTeppich("444_low", false, 140, 230, 420, true);
		 
		 TeppichUtil<Teppich> tu1=new TeppichUtil<Teppich>(t1);
		 TeppichUtil<Teppich> tu2=new TeppichUtil<Teppich>(ot);
		 
		 tu1.gibAttributeUndQuadratmeterTeppichBasisInKonsoleAus();
		 tu2.gibAttributeUndQuadratmeterTeppichBasisInKonsoleAus();
	  Teppichverwaltung teppichverwaltung = new Teppichverwaltung(); 
	  teppichverwaltung.fuelleTeppiche(); 
	  teppichverwaltung.schreibeTeppicheInCsvDatei(); 
	 } 
}
