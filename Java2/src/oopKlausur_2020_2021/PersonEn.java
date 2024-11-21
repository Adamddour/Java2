package oopKlausur_2020_2021;

public enum PersonEn {
	
	MUSTERFRAU("Elke",1981),
	MUSTERMANN("Max",1970),
	MUSTERPERSON("Helmut",1999);
	
	private String vorname;
	private int geburtsjahr;
	
	
	private PersonEn(String vorname, int geburtsjahr) {
		this.vorname = vorname;
		this.geburtsjahr = geburtsjahr;
	}
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
	
	public boolean durchZwei() {
		if(getGeburtsjahr()%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
