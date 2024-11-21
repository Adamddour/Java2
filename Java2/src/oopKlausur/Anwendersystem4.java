package oopKlausur;

import java.util.function.BooleanSupplier;

public class Anwendersystem4 {

	public static void main(String[] args) {
		
		
		PersonMitGeburtsjahr p= new PersonMitGeburtsjahr("Elke" , "Musterfrau",1970);
							//1979
		BooleanSupplier bo=()->p.getGeburtsjahr()<2000;
		
		erstelleAusgabe(bo);
		

	}
	
	public static void erstelleAusgabe(BooleanSupplier booleanSupplier) {
		

		if(booleanSupplier.getAsBoolean()){
			System.out.println("Geburtsjahr ist kleiner als 2000.");
		}
		else{
			System.out.println("Geburtsjahr ist größer oder gleich 2000.");
		}
	}

}
