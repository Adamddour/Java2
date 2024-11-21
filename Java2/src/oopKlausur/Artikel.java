package oopKlausur;

public abstract class Artikel {
	
	private int artikelnummer;
	private String producktname;
	private String preis;
	private int vorraetig;
	
	
	
	
	public Artikel(int artikelnummer, String producktname, String preis, int vorraetig) {
		this.artikelnummer = artikelnummer;
		this.producktname = producktname;
		this.preis = preis;
		this.vorraetig = vorraetig;
	}
	
	
	public int getArtikelnummer() {
		return artikelnummer;
	}
	public void setArtikelnummer(int artikelnummer) {
		this.artikelnummer = artikelnummer;
	}
	public String getProducktname() {
		return producktname;
	}
	public void setProducktname(String producktname) {
		this.producktname = producktname;
	}
	public String getPreis() {
		return preis;
	}
	public void setPreis(String preis) {
		this.preis = preis;
	}
	public int getVorraetig() {
		return vorraetig;
	}
	public void setVorraetig(int vorraetig) {
		this.vorraetig = vorraetig;
	}


	
	public String gibAttributeZurueck() {
		return "Artikel [artikelnummer=" + artikelnummer + ", producktname=" + producktname + ", preis=" + preis+ ", vorraetig=" + vorraetig + "]";
	}
	
	
	
	

}
