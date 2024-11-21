package oopKlausur;

public class Bahnhof {

	
	private String name; 
	private int anzahlGleise; 
	private int jahrLetzteRenovierung; 
	
	 public Bahnhof(String name, int anzahlGleise, int jahrLetzteRenovierung) {
	
		this.name = name;
		this.anzahlGleise = anzahlGleise;
		this.jahrLetzteRenovierung = jahrLetzteRenovierung;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getAnzahlGleise() {
		return anzahlGleise;
	}


	public void setAnzahlGleise(int anzahlGleise) {
		this.anzahlGleise = anzahlGleise;
	}


	public int getJahrLetzteRenovierung() {
		return jahrLetzteRenovierung;
	}


	public void setJahrLetzteRenovierung(int jahrLetzteRenovierung) {
		this.jahrLetzteRenovierung = jahrLetzteRenovierung;
	}


	public String gibAttributeZurueck() { 
		 return this.getName() + ", " + this.getAnzahlGleise() + " Gleise, letzte Renovierung: " + this.getJahrLetzteRenovierung(); 
	 } 
}
