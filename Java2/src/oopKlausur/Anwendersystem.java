package oopKlausur;

public class Anwendersystem {

	public static void main(String[] args) {

		
		GeometrischeFigur[] geometrischeFigur=GeometrischeFigur.values();
		
		GeometrischeFigur kugel=GeometrischeFigur.KUGEL;
		
		System.out.println("Die geometrischeFigur Figur"+kugel);
		System.out.println("Alle vorhandene:");
		
		for(GeometrischeFigur geme:geometrischeFigur) {
			System.out.println(geme+" Diemension: "+geme.getDimension()+" ,AnzahlEcken: "+geme.getAnzahlEcken());
		}


	}

}
