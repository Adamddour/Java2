package OopKlausur_2022_2023;

public class Teppich {
	
	private String artikelnummer;  
	 private boolean hochflorTeppich; 
	 private int breite; 
	 private int laenge; 
	 private int preis; 
	 
	  
	 public Teppich(String artikelnummer, boolean hochflorTeppich, int breite, int laenge, int preis) {
		super();
		this.artikelnummer = artikelnummer;
		this.hochflorTeppich = hochflorTeppich;
		this.breite = breite;
		this.laenge = laenge;
		this.preis = preis;
	}


	public String getArtikelnummer() {
		return artikelnummer;
	}


	public void setArtikelnummer(String artikelnummer) {
		this.artikelnummer = artikelnummer;
	}


	public boolean isHochflorTeppich() {
		return hochflorTeppich;
	}


	public void setHochflorTeppich(boolean hochflorTeppich) {
		this.hochflorTeppich = hochflorTeppich;
	}


	public int getBreite() {
		return breite;
	}


	public void setBreite(int breite) {
		this.breite = breite;
	}


	public int getLaenge() {
		return laenge;
	}


	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}


	public int getPreis() {
		return preis;
	}


	public void setPreis(int preis) {
		this.preis = preis;
	}


	public String gibAttributeAus(String trenner) { 
	  String ergebnis = this.getArtikelnummer() + trenner 
	   + this.isHochflorTeppich() + trenner 
	   + this.getBreite() + trenner 
	   + this.getLaenge() + trenner 
	   + this.getPreis(); 
	  	return ergebnis; 
	 } 

}
