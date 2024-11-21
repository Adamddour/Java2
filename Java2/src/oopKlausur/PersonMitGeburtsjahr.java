package oopKlausur;

public class PersonMitGeburtsjahr extends Person{

	private int geburtsjahr;
	public PersonMitGeburtsjahr(String vorname, String nachname,int geburtsjahr) {
		super(vorname, nachname);
		this.geburtsjahr=geburtsjahr;
	}
	
	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
	
	

}
