package oopKlausur;

public class Anwendung3 {

	public static void main(String[] args) {
		
		final String ANREDE="Frau";
		Hintereinanderhaengen hintereinandern=(s1,s2)->ANREDE+" "+s1+" "+s2;
		
		String ausgabe=hintereinandern.haengeHintereinander("Elke", "Muster");
		System.out.println(ausgabe);

	}

}
