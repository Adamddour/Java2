package oopKlausur_2020_2021;

public class Person {

	private String vorname; 
	private String nachname; 
	private int geburtsjahr; 
	  
	
	  public Person(String vorname, String nachname, int geburtsjahr) {
		
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public void setNachname(String nachname) {
		this.nachname = nachname;
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
