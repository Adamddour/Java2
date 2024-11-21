package oopKlausur;

public class Salbe extends Artikel{

	
	private int gewicht;
	private float phWert;
	
	public Salbe(int artikelnummer, String producktname, String preis, int vorraetig,int gewicht,float phWert) {
		super(artikelnummer, producktname, preis, vorraetig);
		this.gewicht=gewicht;
		this.phWert=phWert;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public float getPhWert() {
		return phWert;
	}

	public void setPhWert(float phWert) {
		this.phWert = phWert;
	}
	
	
	
	
	public String gibAttributeZurueck() {
		return super.gibAttributeZurueck()+ "Salbe [gewicht=" + gewicht + ", phWert=" + phWert + "]";
	}

	
}
