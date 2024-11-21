package wiederholung;

public class BahnhofUtil <T extends Bahnhof>{

	private T bahnhofBasis;

	public BahnhofUtil(T bahnhofBasis) {
		
		this.bahnhofBasis = bahnhofBasis;
	}

	public T getBahnhofBasis() {
		return bahnhofBasis;
	}

	public void setBahnhofBasis(T bahnhofBasis) {
		this.bahnhofBasis = bahnhofBasis;
	}
	
	public void gibBahnhofBasisAus() {
		System.out.println(bahnhofBasis.gibAttributeZurueck());
	}
	
	
	
	
}
