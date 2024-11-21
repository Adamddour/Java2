package oopKlausur;

public class BahnhofUtil <T extends Bahnhof>{

	private T bahnhofBasis;

	public BahnhofUtil(T bahnhofBasis) {
	
		this.bahnhofBasis = bahnhofBasis;
	}
	
	public void gibBahnhofBasisAus() {
		System.out.println(bahnhofBasis.gibAttributeZurueck());
	}
	
	
}
