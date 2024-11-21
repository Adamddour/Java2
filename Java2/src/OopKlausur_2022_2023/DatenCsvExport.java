package OopKlausur_2022_2023;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DatenCsvExport extends Export{
	
	@Override 
	 public void schreibeTeppicheInDatei(ArrayList<Teppich> teppiche) throws IOException{ 
	  BufferedWriter aus= new BufferedWriter(new FileWriter("Teppiche.csv")); 
	  for(Teppich liste:teppiche) { 
		  aus.write(liste.gibAttributeAus(";") + "\n"); 
	  } 
	  
	  aus.close(); 
	 } 

}
