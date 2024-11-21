package oopKlausur_2021_2022;

public class Person {
	
	private String nachname;
	private String vorname;
	private String familienstand;
	public Person(String nachname, String vorname, String familienstand) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.familienstand = familienstand;
	}
	
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getFamilienstand() {
		return familienstand;
	}
	public void setFamilienstand(String familienstand) {
		this.familienstand = familienstand;
	}
	
	public boolean familienStand() {
		if(this.familienstand.equals("ledig")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	

}
