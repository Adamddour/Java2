package OopKlausur_2022_2023;

public class OutdoorTeppich extends Teppich{

	private boolean wasserabweisend; 
	
	  
	 public OutdoorTeppich(String artikelnummer, boolean hochflorTeppich, int breite, int laenge, int preis,
			boolean wasserabweisend) {
		super(artikelnummer, hochflorTeppich, breite, laenge, preis);
		this.wasserabweisend = wasserabweisend;
	}
	


	public boolean isWasserabweisend() {
		return wasserabweisend;
	}



	public void setWasserabweisend(boolean wasserabweisend) {
		this.wasserabweisend = wasserabweisend;
	}



	@Override 
	 public String gibAttributeAus(String trenner) { 
	  String ergebnis = super.gibAttributeAus(trenner) + trenner 
	   + this.isWasserabweisend(); 
	  return ergebnis; 
	 }
}
