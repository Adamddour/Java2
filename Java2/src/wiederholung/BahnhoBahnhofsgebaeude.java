package wiederholung;

public class BahnhoBahnhofsgebaeude  extends Bahnhof{

	
	
	private boolean mitBahnhofsgebaeude; 
	  
	 public BahnhoBahnhofsgebaeude(String name, int anzahlGleise,int jahrLetzteRenovierung, boolean mitBahnhofsgebaeude) { 
	  super(name, anzahlGleise, jahrLetzteRenovierung); 
	  this.mitBahnhofsgebaeude = mitBahnhofsgebaeude; 
	 } 
	 
	 public boolean isMitBahnhofsgebaeude() { 
	  return mitBahnhofsgebaeude; 
	 } 
	 
	 public void setMitBahnhofsgebaeude(boolean mitBahnhofsgebaeude) { 
	  this.mitBahnhofsgebaeude = mitBahnhofsgebaeude; 
	 } 
	  
	 @Override 
	 public String gibAttributeZurueck() { 
	  return super.gibAttributeZurueck()+ ", mit Gebaeude: " + this.isMitBahnhofsgebaeude(); 
	 }

}
