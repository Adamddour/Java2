package oopKlausur;

public class Tablette extends Artikel {

	private String wirkstoff;
	private int anzahlPraPackung;
	
	public Tablette(int artikelnummer, String producktname, String preis, int vorraetig,String wirkstoff,int anzahlPraPackung) {
		super(artikelnummer, producktname, preis, vorraetig);
		this.wirkstoff=wirkstoff;
		this.anzahlPraPackung=anzahlPraPackung;
	}

	public String getWirkstoff() {
		return wirkstoff;
	}

	public void setWirkstoff(String wirkstoff) {
		this.wirkstoff = wirkstoff;
	}

	public int getAnzahlPraPackung() {
		return anzahlPraPackung;
	}

	public void setAnzahlPraPackung(int anzahlPraPackung) {
		this.anzahlPraPackung = anzahlPraPackung;
	}

	
	public String gibAttributeZurueck() {
		return super.gibAttributeZurueck()+ "Tablette [wirkstoff=" + wirkstoff + ", anzahlPraPackung=" + anzahlPraPackung + "]";
	}
	
	

}
